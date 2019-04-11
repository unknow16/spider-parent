package com.unknow.spiderparent.vo;

import java.util.List;

/**
 * {
 *     "pageInfo":{
 *         "type":1,
 *         "pageNum":1,
 *         "pageSize":10
 *     },
 *     "basicInfo":[
 *         "full_host_win",
 *         "full_guest_win"
 *     ],
 *     "enterBallNum":{
 *         "type":[
 *             1,
 *             2,
 *             3
 *         ],
 *         "columns":[
 *             "s_1",
 *             "s_2"
 *         ]
 *     },
 *     "scoreOr":{
 *         "columns":[
 *             "s_1_1",
 *             "s_2_2"
 *         ],
 *         "hostType":[
 *             1
 *         ],
 *         "sessionType":[
 *             1,
 *             2
 *         ]
 *     }
 * }
 */
public class OptionVo {

    PageInfo pageInfo;
    List<String> basicInfo;
    EnterBallNum enterBallNum;
    ScoreOr scoreOr;

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<String> getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(List<String> basicInfo) {
        this.basicInfo = basicInfo;
    }

    public EnterBallNum getEnterBallNum() {
        return enterBallNum;
    }

    public void setEnterBallNum(EnterBallNum enterBallNum) {
        this.enterBallNum = enterBallNum;
    }

    public ScoreOr getScoreOr() {
        return scoreOr;
    }

    public void setScoreOr(ScoreOr scoreOr) {
        this.scoreOr = scoreOr;
    }
}






