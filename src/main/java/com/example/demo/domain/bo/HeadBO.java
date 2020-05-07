package com.example.demo.domain.bo;

/**
 * 表头信息
 */
public class HeadBO {
    /**
     * 盘库单号
     */
    private String inspectno;
    /**
     * 查库人
     */
    private String inspectusr;
    /**
     * 复核人
     */
    private String rechecker;
    /**
     * 楼层号
     */
    private String floorno;
    /**
     * 查库日期
     */
    private String savedate;

    public String getInspectno() {
        return inspectno;
    }

    public void setInspectno(String inspectno) {
        this.inspectno = inspectno;
    }

    public String getInspectusr() {
        return inspectusr;
    }

    public void setInspectusr(String inspectusr) {
        this.inspectusr = inspectusr;
    }

    public String getRechecker() {
        return rechecker;
    }

    public void setRechecker(String rechecker) {
        this.rechecker = rechecker;
    }

    public String getFloorno() {
        return floorno;
    }

    public void setFloorno(String floorno) {
        this.floorno = floorno;
    }

    public String getSavedate() {
        return savedate;
    }

    public void setSavedate(String savedate) {
        this.savedate = savedate;
    }
}
