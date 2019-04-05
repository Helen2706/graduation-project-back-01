package com.luhuiling.graduation.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 *
 * @author luhuiling
 * @email 15652612973@163.com
 * @date 2019-04-04 14:08:58
 */
public class UserDO implements Serializable {
    private static final long serialVersionUID = 1L;

            //
        private Long userId;
            //用户名
        private String username;
            //密码
        private String password;
            //盐
        private String salt;
            //1 锁定 0未锁定
        private Integer locked;
            //创建时间
        private Date gmtCreate;
            //修改时间
        private Date gmtModified;
    
            /**
         * 设置：
         */
        public void setUserId(Long userId) {
            this.userId = userId;
        }
        /**
         * 获取：
         */
        public Long getUserId() {
            return userId;
        }
            /**
         * 设置：用户名
         */
        public void setUsername(String username) {
            this.username = username;
        }
        /**
         * 获取：用户名
         */
        public String getUsername() {
            return username;
        }
            /**
         * 设置：密码
         */
        public void setPassword(String password) {
            this.password = password;
        }
        /**
         * 获取：密码
         */
        public String getPassword() {
            return password;
        }
            /**
         * 设置：盐
         */
        public void setSalt(String salt) {
            this.salt = salt;
        }
        /**
         * 获取：盐
         */
        public String getSalt() {
            return salt;
        }
            /**
         * 设置：1 锁定 0未锁定
         */
        public void setLocked(Integer locked) {
            this.locked = locked;
        }
        /**
         * 获取：1 锁定 0未锁定
         */
        public Integer getLocked() {
            return locked;
        }
            /**
         * 设置：创建时间
         */
        public void setGmtCreate(Date gmtCreate) {
            this.gmtCreate = gmtCreate;
        }
        /**
         * 获取：创建时间
         */
        public Date getGmtCreate() {
            return gmtCreate;
        }
            /**
         * 设置：修改时间
         */
        public void setGmtModified(Date gmtModified) {
            this.gmtModified = gmtModified;
        }
        /**
         * 获取：修改时间
         */
        public Date getGmtModified() {
            return gmtModified;
        }
    }