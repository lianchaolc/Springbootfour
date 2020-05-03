package com.example.demo.bean.familybean;
import java.io.Serializable;

public class PPMenumEntity  implements Serializable{
    public PPMenumEntity(String pp_menum_textimage, String pp_menum_texttitle, String pp_menum_state) {
        this.pp_menum_textimage = pp_menum_textimage;
        this.pp_menum_texttitle = pp_menum_texttitle;
        this.pp_menum_state = pp_menum_state;
    }

    private String pp_menum_textimage;  // 图片
    private String pp_menum_texttitle;  //  文字
    private String pp_menum_state;       // 状态

    @Override
    public String toString() {
        return "PPMenumEntity{" +
                "pp_menum_textimage='" + pp_menum_textimage + '\'' +
                ", pp_menum_texttitle='" + pp_menum_texttitle + '\'' +
                ", pp_menum_state='" + pp_menum_state + '\'' +
                '}';
    }

    public PPMenumEntity() {
    }

    public String getPp_menum_textimage() {
        return pp_menum_textimage;
    }

    public void setPp_menum_textimage(String pp_menum_textimage) {
        this.pp_menum_textimage = pp_menum_textimage;
    }

    public String getPp_menum_texttitle() {
        return pp_menum_texttitle;
    }

    public void setPp_menum_texttitle(String pp_menum_texttitle) {
        this.pp_menum_texttitle = pp_menum_texttitle;
    }

    public String getPp_menum_state() {
        return pp_menum_state;
    }

    public void setPp_menum_state(String pp_menum_state) {
        this.pp_menum_state = pp_menum_state;
    }

}
