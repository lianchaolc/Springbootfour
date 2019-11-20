package com.example.demo.bean.ppshopbean;

/**
 * 家的实体类
 */
public class ppshopfamilybean {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String getEndDATE() {
        return EndDATE;
    }

    public void setEndDATE(String endDATE) {
        EndDATE = endDATE;
    }

    @Override
    public String toString() {
        return "ppshopfamilybean{" +
                "id='" + id + '\'' +
                ", idcard='" + idcard + '\'' +
                ", name='" + name + '\'' +
                ", DATE='" + DATE + '\'' +
                ", EndDATE='" + EndDATE + '\'' +
                '}';
    }

    private String id;        // id  进行排序
    private String idcard;    //  身份证号
    private String name;     //姓名
    private String DATE;    //开始时间
    private String EndDATE;//  结束时间

}
