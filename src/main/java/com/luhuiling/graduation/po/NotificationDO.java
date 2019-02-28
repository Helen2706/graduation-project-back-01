package com.luhuiling.graduation.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 通知
 *
 * @author luhuiling
 * @email 15652612973@163.com
 * @date 2019-02-27 19:28:26
 */
public class NotificationDO implements Serializable {
    private static final long serialVersionUID = 1L;

            //编号
        private Long id;
            //标题
        private String title;
            //作者
        private String author;
            //内容
        private String content;
            //创建时间
        private Date createTime;
            //修改时间
        private Date modifiedTime;
            //状态 1已发布 2草稿箱
        private Integer state;
    
            /**
         * 设置：编号
         */
        public void setId(Long id) {
            this.id = id;
        }
        /**
         * 获取：编号
         */
        public Long getId() {
            return id;
        }
            /**
         * 设置：标题
         */
        public void setTitle(String title) {
            this.title = title;
        }
        /**
         * 获取：标题
         */
        public String getTitle() {
            return title;
        }
            /**
         * 设置：作者
         */
        public void setAuthor(String author) {
            this.author = author;
        }
        /**
         * 获取：作者
         */
        public String getAuthor() {
            return author;
        }
            /**
         * 设置：内容
         */
        public void setContent(String content) {
            this.content = content;
        }
        /**
         * 获取：内容
         */
        public String getContent() {
            return content;
        }
            /**
         * 设置：创建时间
         */
        public void setCreateTime(Date createTime) {
            this.createTime = createTime;
        }
        /**
         * 获取：创建时间
         */
        public Date getCreateTime() {
            return createTime;
        }
            /**
         * 设置：修改时间
         */
        public void setModifiedTime(Date modifiedTime) {
            this.modifiedTime = modifiedTime;
        }
        /**
         * 获取：修改时间
         */
        public Date getModifiedTime() {
            return modifiedTime;
        }
            /**
         * 设置：状态 1已发布 2草稿箱
         */
        public void setState(Integer state) {
            this.state = state;
        }
        /**
         * 获取：状态 1已发布 2草稿箱
         */
        public Integer getState() {
            return state;
        }
    }