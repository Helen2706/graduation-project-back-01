package com.luhuiling.graduation.po.utils;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

public class ShiroUtils {
    public static Subject getSubject(){
        return SecurityUtils.getSubject();
    }

    public static Session getSession(){
        return SecurityUtils.getSubject().getSession();
    }

    public static void setSessionAttribute(Object key,Object value){
        getSession().setAttribute(key, value);
    }

    public static String getKaptcha(String kaptchaSessionKey) throws BDException{
        Object kaptcha = getSession().getAttribute(kaptchaSessionKey);
        /*if(kaptcha == null){
            throw new BDException("验证码失效",106);
        }*/
        getSession().removeAttribute(kaptchaSessionKey);
        return kaptcha.toString();
    }
}
