package com.example.demo.global.domain.model;

public class HbVehicleDelete {

    private String vehicleid;//车牌号
    private String parkcode;//车场编号
    private String carid;//车辆对接系统id
    private String caruuid;//车辆对接系统uuid
    private String createtime;//创建时间
    private String deleteuuid;//删除时候的uuid

    public String getDeleteuuid() {
        return deleteuuid;
    }

    public void setDeleteuuid(String deleteuuid) {
        this.deleteuuid = deleteuuid;
    }

    public String getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(String vehicleid) {
        this.vehicleid = vehicleid;
    }

    public String getParkcode() {
        return parkcode;
    }

    public void setParkcode(String parkcode) {
        this.parkcode = parkcode;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getCaruuid() {
        return caruuid;
    }

    public void setCaruuid(String caruuid) {
        this.caruuid = caruuid;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}