package com.example.liushiqian.lightdic;

/**
 * Created on  2017/2/21.
 * Author: LiuShiQian
 * Description: XXX
 */
public class EveryDay {
    //每日一句的api
    //如果 date为空 则默认取当日的，当日为空 取前一日的
    //type(可选)	// last 和 next  以date日期为准，last返回前一天的，next返回后一天的
    public static final String GET_EVERY = "http://open.iciba.com/dsapi/?";

    //每日一句ID
    private String sid;
    //音频地址
    private String tts;
    //英文内容
    private String content;
    //中文内容
    private String note;
    //词霸小编
    private String translation;
    //图片地址
    private String picture;
    //大图片地址
    private String picture2;
    //标题
    private String caption;
    //时间
    private String dateline;
    //分享用合成图片
    private String fenxiang_img;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getTts() {
        return tts;
    }

    public void setTts(String tts) {
        this.tts = tts;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDateline() {
        return dateline;
    }

    public void setDateline(String dateline) {
        this.dateline = dateline;
    }

    public String getFenxiang_img() {
        return fenxiang_img;
    }

    public void setFenxiang_img(String fenxiang_img) {
        this.fenxiang_img = fenxiang_img;
    }

    public void parseFromJson(String json)
    {

    }
}
