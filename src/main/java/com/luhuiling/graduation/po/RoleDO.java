package com.luhuiling.graduation.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色
 *
 * @author luhuiling
 * @email 15652612973@163.com
 * @date 2019-04-06 19:45:31
 */
public class RoleDO implements Serializable {
    private static final long serialVersionUID = 1L;

            //编号
        private Long id;
            //角色名称
        private String roleName;
            //备注
        private String remark;
            //创建时间
        private Date createTime;
            //创建时间
        private Date modifiedTime;
    
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
         * 设置：角色名称
         */
        public void setRoleName(String roleName) {
            this.roleName = roleName;
        }
        /**
         * 获取：角色名称
         */
        public String getRoleName() {
            return roleName;
        }
            /**
         * 设置：备注
         */
        public void setRemark(String remark) {
            this.remark = remark;
        }
        /**
         * 获取：备注
         */
        public String getRemark() {
            return remark;
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
         * 设置：创建时间
         */
        public void setModifiedTime(Date modifiedTime) {
            this.modifiedTime = modifiedTime;
        }
        /**
         * 获取：创建时间
         */
        public Date getModifiedTime() {
            return modifiedTime;
        }
    }