package com.luhuiling.graduation.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/*
* 学院主页菜单导航栏
* */
public class NavbarMenu implements Serializable{
    private static final long serialVersionUID = 1L;
    //菜单id
    private long menuId;
    //父菜单ID，一级菜单为0
    private long parentId;
    //菜单名称
    private String name;
    //菜单URL
    private String url;
    //授权(多个用逗号分隔，如：user:list,user:create)
    private String perms;
    //菜单图标
    private String icon;
    //类型   0：目录   1：菜单   2：按钮
    private int type;
    //排序
    private int orderNum;
    /*子菜单列表*/
    private List<NavbarMenu> childrens;
    //创建时间
    private Date gmtCreate;
    //修改时间
    private Date gmtModified;

    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public List<NavbarMenu> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<NavbarMenu> childrens) {
        this.childrens = childrens;
    }
}
