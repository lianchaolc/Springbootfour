package com.example.demo.domain.bo;

import java.util.List;

/**
 * Created by Zhaohui on 2018/3/27.
 */
public class GetScanMsgAndUpdateTagBO extends CommonBO {
    /**
     * 表头数据
     */
    private HeadBO headBO;
    /**
     * 表格数据
     */
    private List<SummaryTagBO> summaryTagBOList;

    public HeadBO getHeadBO() {
        return headBO;
    }

    public void setHeadBO(HeadBO headBO) {
        this.headBO = headBO;
    }

    public List<SummaryTagBO> getSummaryTagBOList() {
        return summaryTagBOList;
    }

    public void setSummaryTagBOList(List<SummaryTagBO> summaryTagBOList) {
        this.summaryTagBOList = summaryTagBOList;
    }
}
