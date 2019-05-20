package com.unknow.spiderparent.vo;

import java.util.List;
import java.util.Map;

/**
 *
 * {
 *
 *        "pageInfo":{
 *           "type":1,
 *           "pageNum":1,
 *           "pageSize":10
 *       },
 *     "main": [
 *         "basicInfo&full_host_win",
 *         "basicInfo&full_draw",
 *         "basicInfo&full_guest_win",
 *         "enterBallNum&1",
 *         "enterBallNum&2",
 *         "enterBallNum&3",
 *         "scoreOr&1",
 *         "scoreOr&2"
 *     ],
 *     "dynamic": {
 *         "basicInfo&full_host_win&0": 3.0,
 *         "basicInfo&full_draw&0": 38.4,
 *         "basicInfo&full_guest_win&0": 24,
 *         "basicInfo&half_host_win&0": 14.6,
 *         "basicInfo&half_draw&0": 61,
 *         "basicInfo&half_guest_win&0": 100,
 *         "enterBallNum&s1&1": 12,
 *         "enterBallNum&s2&2": 12,
 *         "enterBallNum&s3&3": 12,
 *         "scoreOr&s10&1": 12,
 *         "scoreOr&s20&2": 12
 *     }
 *
 * }
 *
 *
 */
public class OptionValueRequestVo {

    private PageInfo pageInfo;
    private List<String> main;
    private Map<String, Double> dynamic;

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<String> getMain() {
        return main;
    }

    public void setMain(List<String> main) {
        this.main = main;
    }

    public Map<String, Double> getDynamic() {
        return dynamic;
    }

    public void setDynamic(Map<String, Double> dynamic) {
        this.dynamic = dynamic;
    }
}
