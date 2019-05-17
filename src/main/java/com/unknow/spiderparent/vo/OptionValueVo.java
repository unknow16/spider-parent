package com.unknow.spiderparent.vo;

import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

/**
 * {
 *     "pageInfo":{
 *         "type":1,
 *         "pageNum":1,
 *         "pageSize":10
 *     },
 *     "basicInfo":[
 *         {"full_host_win": 12.12},
 *         {"full_guest_win": 11.11}
 *     ],
 *     "enterBallNum":{
 *         "type": [1],
 *         "condition": [
 *              {"s_1": 3.33},
 *              {"s_2": 3.33}
 *         ]
 *     },
 *     "scoreOr": {
 *         "hostType": [1],
 *         "sessionType": [1],
 *         "condition": [
 *          {"s_1_1": 5.55}
 *         ]
 *     }
 * }
 */
public class OptionValueVo {

    private PageInfo pageInfo;
    private List<Map<String, Double>> basicInfo;
    private EnterBallNumValue enterBallNum;
    private ScoreOrValue scoreOr;

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<Map<String, Double>> getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(List<Map<String, Double>> basicInfo) {
        this.basicInfo = basicInfo;
    }

    public EnterBallNumValue getEnterBallNum() {
        return enterBallNum;
    }

    public void setEnterBallNum(EnterBallNumValue enterBallNum) {
        this.enterBallNum = enterBallNum;
    }

    public ScoreOrValue getScoreOr() {
        return scoreOr;
    }

    public void setScoreOr(ScoreOrValue scoreOr) {
        this.scoreOr = scoreOr;
    }

    public static void main(String[] args) {
        String a = "{\"pageInfo\":{\"type\":1,\"pageNum\":1,\"pageSize\":10},\"basicInfo\":[{\"full_host_win\":12.12},{\"full_guest_win\":0}],\"enterBallNum\":{\"type\":[1],\"condition\":[{\"s_1\":3.33},{\"s_2\":3.33}]},\"scoreOr\":{\"hostType\":[1],\"sessionType\":[1],\"condition\":[{\"s_1_1\":5.55}]}}";
        OptionValueVo optionValueVo = JSON.parseObject(a, OptionValueVo.class);

        List<Map<String, Double>> basicInfo = optionValueVo.getBasicInfo();
        Double full_guest_win = basicInfo.get(1).get("full_guest_win");
        if (full_guest_win.doubleValue() == 0) {
            System.out.println(full_guest_win.doubleValue());
        }

        System.out.println(optionValueVo);
    }
}
