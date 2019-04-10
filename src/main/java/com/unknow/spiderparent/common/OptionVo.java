package com.unknow.spiderparent.common;

import com.unknow.spiderparent.entity.RaceRateBasic;
import com.unknow.spiderparent.entity.RaceRateScoreAnd;
import com.unknow.spiderparent.entity.RaceRateScoreOr;
import lombok.Data;

import java.util.List;

/**
 * @Date 2019/4/10 18:02
 * @Created by fuyi
 */
@Data
public class OptionVo {

    private RaceRateBasic raceRateBasic;
    private List<RaceRateScoreOr> raceRateScoreOrs;
    private List<RaceRateScoreAnd> raceRateScoreAnds;
}
