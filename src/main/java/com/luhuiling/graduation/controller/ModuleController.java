package com.luhuiling.graduation.controller;

import com.luhuiling.graduation.dao.ModuleDao;
import com.luhuiling.graduation.po.Module;
import com.luhuiling.graduation.po.utils.BDException;
import com.luhuiling.graduation.po.utils.GenUtils;
import com.luhuiling.graduation.po.utils.R;
import com.luhuiling.graduation.service.ModuleService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.util.Map;

/**
 * 处理有关模块/数据库表增删改查的有关请求
 */
@Controller
@RequestMapping("/module")
public class ModuleController {
    @Value("${file.save.dictory}")
    private String SAVE_FOLDER;
    @Autowired
    ModuleDao moduleDao;
    @Autowired
    ModuleService moduleService;

    @RequestMapping("/add")
    @ResponseBody
    public R add(@RequestBody Module module){
        moduleDao.createTable(module);
        return R.ok();
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Map> list(){
        List<Map> lists = moduleDao.listTables();
        return lists;
    }

    /**
     * 批量删除
     */
    @RequestMapping("/batchRemove")
    @ResponseBody
    public R remove(@RequestParam("tables[]") String[] tables){
        for (String table:tables){
            moduleDao.deleteTable(table);
        }
        return R.ok();
    }

    /**
     * 自动生成
     */
    @RequestMapping("/download")
    public void download(String tableName,HttpServletResponse response) throws IOException {
        byte[] data = moduleService.generatorCode(tableName);
        GenUtils.getFile(data,SAVE_FOLDER,tableName+".zip");
        response.reset();
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition","attachment;filename=\""+tableName+".zip\"");
        response.addHeader("Content-Length","" + data.length);
//        response.setContentType("application/octet-stream;charset=UTF-8");
        HttpHeaders headers = new HttpHeaders();
        //设置文件类型
        headers.add("Content-Disposition", "attchement;filename=\""+tableName+".zip\"");
        //设置Http状态码
HttpStatus statusCode = HttpStatus.OK;
        //返回数据
ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(data, headers, statusCode);
        IOUtils.write(data,response.getOutputStream());
//        return entity;
    }

    /**
     * 文件下载
     */
    //带文件名的单个文件下载
    @RequestMapping(path = "/downloadwithname", method = RequestMethod.GET)
    public void downloadWithFileName(String name,
                                     HttpServletResponse response) throws IOException{
        File file = new File(SAVE_FOLDER+"/"+name);

        InputStream inputStream = new FileInputStream(file);
        OutputStream outputStream = null;
        try {
            response.setHeader("Content-Disposition", "attachment;filename="+ name);
            outputStream = response.getOutputStream();
            IOUtils.copy(inputStream, outputStream);
            response.flushBuffer();
        } catch (IOException e) {
            throw new BDException("server error.");
        } finally {
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly(outputStream);
        }
    }
}
