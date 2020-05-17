package com.example.demo.global.domain;


import com.example.demo.global.domain.query.PageQuery;

public class PatrolplaceListQuery extends PageQuery {
    private String patrolplaceid;
    private String patrolplacename;
    private String orgid;

    public String getPatrolplaceid() {
        return patrolplaceid;
    }

    public void setPatrolplaceid(String patrolplaceid) {
        this.patrolplaceid = patrolplaceid;
    }

    public String getPatrolplacename() {
        return patrolplacename;
    }

    public void setPatrolplacename(String patrolplacename) {
        this.patrolplacename = patrolplacename;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }
}
