package com.example.demo.domain.model;

/**
 * Created by Zhaohui on 2018/3/27.
 */
public class TagDO {
    /**
     * 标签号
     */
    private String tagid;
    /**
     * 盘库单号
     */
    private String inspectno;
    /**
     * 保存时间
     */
    private String scandate;
    /**
     * 券别
     */
    private String rmbcls;
    /**
     * 券种
     */
    private String rmbedition;

    public String getTagid() {
        return tagid;
    }

    public void setTagid(String tagid) {
        this.tagid = tagid;
    }

    public String getInspectno() {
        return inspectno;
    }

    public void setInspectno(String inspectno) {
        this.inspectno = inspectno;
    }

    public String getScandate() {
        return scandate;
    }

    public void setScandate(String scandate) {
        this.scandate = scandate;
    }

    public String getRmbcls() {
        return rmbcls;
    }

    public void setRmbcls(String rmbcls) {
        this.rmbcls = rmbcls;
    }

    public String getRmbedition() {
        return rmbedition;
    }

    public void setRmbedition(String rmbedition) {
        this.rmbedition = rmbedition;
    }
}
