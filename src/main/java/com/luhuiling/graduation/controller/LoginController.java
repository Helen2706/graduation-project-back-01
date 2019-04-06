package com.luhuiling.graduation.controller;

import com.google.code.kaptcha.Producer;
import com.luhuiling.graduation.po.UserDO;
import com.luhuiling.graduation.po.utils.BDException;
import com.luhuiling.graduation.po.utils.R;
import com.luhuiling.graduation.po.utils.ShiroUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@RestController
@RequestMapping("/sys")
public class LoginController {

    @Autowired
    Producer producer;

    @RequestMapping("/captcha")
    public void captcha(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");

        //生成文字验证码
        String text = producer.createText();
        //生成图片验证码
        BufferedImage image = producer.createImage(text);
        //保存到shiro session
        ShiroUtils.setSessionAttribute("KAPTCHA_SESSION_KEY",text);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image,"jpg",out);
        out.flush();
    }

    @RequestMapping("/login")
    public R login(@RequestBody UserDO userDO, String captcha,HttpServletResponse response, HttpServletRequest request){
//        String kaptcha = ShiroUtils.getKaptcha("KAPTCHA_SESSION_KEY");
        /*if(!kaptcha.equalsIgnoreCase(captcha)){
            throw new BDException("验证码错误",107);
        }*/
        Subject subject;
        try{
            subject = ShiroUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(userDO.getUsername(),userDO.getPassword());
            token.setRememberMe(false);
            subject.login(token);
        }catch (UnknownAccountException e) {
            return R.error("账户名/密码错误！");
        } catch (IncorrectCredentialsException e) {
            return R.error("账户名/密码错误！");
        } catch (LockedAccountException e) {
            return R.error("账户名已锁定！");
        } catch (AuthenticationException e) {
            return R.error("账户认证失败！");
        }
        return R.ok();
    }
}
