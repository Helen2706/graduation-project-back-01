package com.luhuiling.graduation.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统菜单
 *
 * @author luhuiling
 * @email 15652612973@163.com
 * @date 2019-03-04 14:20:16
 */
public class SystemMenuDO implements Serializable {
    private static final long serialVersionUID = 1L;

            //编号
        private Integer id;
            //名称
        private String name;
            //类型
        private Integer type;
            //URL
        private String url;
            //权限
        private String authority;
            //父菜单
        private Integer parentid;
    
            /**
         * 设置：编号
         */
        public void setId(Integer id) {
            this.id = id;
        }
        /**
         * 获取：编号
         */
        public Integer getId() {
            return id;
        }
            /**
         * 设置：名称
         */
        public void setName(String name) {
            this.name = name;
        }
        /**
         * 获取：名称
         */
        public String getName() {
            return name;
        }
            /**
         * 设置：类型
         */
        public void setType(Integer type) {
            this.type = type;
        }
        /**
         * 获取：类型
         */
        public Integer getType() {
            return type;
        }
            /**
         * 设置：URL
         */
        public void setUrl(String url) {
            this.url = url;
        }
        /**
         * 获取：URL
         */
        public String getUrl() {
            return url;
        }
            /**
         * 设置：权限
         */
        public void setAuthority(String authority) {
            this.authority = authority;
        }
        /**
         * 获取：权限
         */
        public String getAuthority() {
            return authority;
        }
            /**
         * 设置：父菜单
         */
        public void setParentid(Integer parentid) {
            this.parentid = parentid;
        }
        /**
         * 获取：父菜单
         */
        public Integer getParentid() {
            return parentid;
        }
    }