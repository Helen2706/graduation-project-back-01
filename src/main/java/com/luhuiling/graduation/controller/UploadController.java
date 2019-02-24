package com.luhuiling.graduation.controller;

import com.luhuiling.graduation.po.utils.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/upload")
public class UploadController {
    @Value("${picture.save.dictory}")
    private String UPLOAD_FOLDER;

    @RequestMapping("/picture")
    public R uploadPicture(@RequestParam("picture")MultipartFile picture, HttpServletRequest request){
        //获取文件在服务器中的存储位置
        String path = request.getSession().getServletContext().getRealPath("/upload");
        File filePath = new File(UPLOAD_FOLDER);
        if(!filePath.exists() &&!filePath.isDirectory()){
            System.out.println("目录不存在，创建目录:" + filePath);
            filePath.mkdir();
        }

        String originalFileName = picture.getOriginalFilename();
        String type = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
        String fileName = System.currentTimeMillis() + "." + type;
        File targetFile = new File(UPLOAD_FOLDER,fileName);

        //将文件保存到服务器指定位置
        try {
            picture.transferTo(targetFile);
            return R.ok(fileName);
        } catch (IOException e) {
            System.out.println("/upload/picture 保存文件错误");
            e.printStackTrace();
            return R.error("上传图片失败，请重试");
        }
    }
}
