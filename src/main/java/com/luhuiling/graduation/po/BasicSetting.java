package com.luhuiling.graduation.po;

/**
 * 学院网站基础设置类
 */
public class BasicSetting {
    private int id;
    private String name;              //网站名称
    private String pictureUrl;        //网站图标存储地址
    private String englishName;       //英文名称
    private String parentName;        //父网站名称
    private String copyright;         //版权信息
    private String contactInfo;       //联系信息
    private Boolean hasParent;        //是否有父网站
    private Boolean hasEnglishName;   //是否有英文名称

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Boolean getHasParent() {
        return hasParent;
    }

    public void setHasParent(Boolean hasParent) {
        this.hasParent = hasParent;
    }

    public Boolean getHasEnglishName() {
        return hasEnglishName;
    }

    public void setHasEnglishName(Boolean hasEnglishName) {
        this.hasEnglishName = hasEnglishName;
    }
}
