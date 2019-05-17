package com.unknow.spiderparent.controller;

import com.unknow.spiderparent.common.BaseResult;
import com.unknow.spiderparent.common.SpiderException;
import com.unknow.spiderparent.entity.*;
import com.unknow.spiderparent.service.IEnterBallDataService;
import com.unknow.spiderparent.service.IMainPanDataService;
import com.unknow.spiderparent.service.IRaceInfoService;
import com.unknow.spiderparent.service.IUpDownSectionDataService;
import com.unknow.spiderparent.vo.OptionValueVo;
import com.unknow.spiderparent.vo.OptionVo;
import com.unknow.spiderparent.vo.PageData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "比赛信息数据接口")
@RestController
public class RaceInfoController {

    @Autowired
    private IRaceInfoService raceInfoService;

    @Autowired
    private IMainPanDataService mainPanDataService;

    @Autowired
    private IUpDownSectionDataService upDownSectionDataService;

    @Autowired
    private IEnterBallDataService enterBallDataService;

    @ApiOperation(value = "手工新增比赛信息")
    @PostMapping(value = "/addRaceInfo")
    public BaseResult addRaceInfo(@RequestBody RaceInfo raceInfo) {
        int count = raceInfoService.addRaceInfo(raceInfo);
        return BaseResult.ok("手工新增比赛信息成功", count);
    }

    @ApiOperation(value = "获取某联赛比赛信息列表数据")
    @GetMapping(value = "/queryRaceInfoList")
    public BaseResult queryRaceInfoList(
            @RequestParam(required = true, defaultValue = "1", value = "type") Integer type,
            @RequestParam(required = true, defaultValue = "1", value = "pageNum") Integer pageNum,
            @RequestParam(required = true, defaultValue = "10", value = "pageSize") Integer pageSize) throws Exception {
        List<RaceInfo> raceInfos = raceInfoService.queryRaceInfoList(type, pageNum, pageSize);
        int total = raceInfoService.countRaceInfoList(type);
        return BaseResult.ok("获取联赛比赛信息列表数据成功", PageData.create(raceInfos, total));
    }


    @ApiOperation(value = "获取某联赛比赛信息列表数据和赔率数据")
    @GetMapping(value = "/queryRaceInfoListAndRate")
    public BaseResult queryRaceInfoListAndRate(
            @RequestParam(required = true, defaultValue = "1", value = "type") Integer type,
            @RequestParam(required = true, defaultValue = "1", value = "pageNum") Integer pageNum,
            @RequestParam(required = true, defaultValue = "10", value = "pageSize") Integer pageSize) throws Exception {
        List<RaceInfo> raceInfos = raceInfoService.queryRaceInfoList(type, pageNum, pageSize);
        for (RaceInfo raceInfo : raceInfos) {
            Map<String, Object> rates = raceInfoService.queryRaceRateDetail(raceInfo.getRaceId());
            raceInfo.setRates(rates);
        }
        int total = raceInfoService.countRaceInfoList(type);
        return BaseResult.ok("获取联赛比赛信息列表数据成功", PageData.create(raceInfos, total));
    }

    @ApiOperation(value = "获取比赛列表数据和可选赔率")
    @RequestMapping(value = "/queryRaceInfoListAndRateOption", method = RequestMethod.POST)
    public BaseResult queryRaceInfoListAndRateOption(@RequestBody OptionVo optionVo ) throws Exception {

        List<RaceInfo> raceInfos = raceInfoService.queryRaceInfoList(optionVo.getPageInfo().getType(), optionVo.getPageInfo().getPageNum(), optionVo.getPageInfo().getPageSize());
        for (RaceInfo raceInfo : raceInfos) {
            Map<String, Object> rates = raceInfoService.queryRaceRateDetailOption(raceInfo.getRaceId(), optionVo);
            raceInfo.setRates(rates);
        }
        int total = raceInfoService.countRaceInfoList(optionVo.getPageInfo().getType());
        return BaseResult.ok("获取成功", PageData.create(raceInfos, total));
    }

    @ApiOperation(value = "获取比赛列表数据+列筛选+值筛选")
    @RequestMapping(value = "/queryRaceInfoListAndRateOptionValue", method = RequestMethod.POST)
    public BaseResult queryRaceInfoListAndRateOptionValue(@RequestBody OptionValueVo optionValueVo) throws Exception {
        List<RaceInfo> raceInfos = raceInfoService.queryRaceInfoList(optionValueVo.getPageInfo().getType(), optionValueVo.getPageInfo().getPageNum(), optionValueVo.getPageInfo().getPageSize());
        for (RaceInfo raceInfo : raceInfos) {
            Map<String, Object> rates = raceInfoService.queryRaceRateDetailOptionValue(raceInfo.getRaceId(), optionValueVo);
            raceInfo.setRates(rates);
        }
        int total = raceInfoService.countRaceInfoList(optionValueVo.getPageInfo().getType());
        return BaseResult.ok("获取联赛比赛信息列表数据成功", PageData.create(raceInfos, total));
    }


    @ApiOperation(value = "获取某场比赛详情所有数据")
    @GetMapping(value = "/queryRaceRateDetailAll")
    public BaseResult queryRaceRateDetailAll(
            @RequestParam(required = true,
                    defaultValue = "#AC#B1#C1#D8#E79321987#F3#R0#P^14#Q^37628399#",
                    value = "raceId") String raceId ) {
        Map<String, Object> result = raceInfoService.queryRaceRateDetail(raceId);
        return BaseResult.ok("获取成功！", result);
    }


    @ApiOperation(value = "获取该场比赛基础项赔率数据")
    @GetMapping(value = "/queryRaceRateBasic")
    public BaseResult queryRaceRateBasic(
        @RequestParam(required = true,
                defaultValue = "#AC#B1#C1#D8#E79321987#F3#R0#P^14#Q^37628399#",
                value = "raceId") String raceId) {
        RaceRateBasic raceRateBasic = raceInfoService.queryRaceRateBasic(raceId);
        return BaseResult.ok("获取比赛id为[ " + raceId + " ]的比赛基础项赔率数据成功", raceRateBasic);
    }

    @ApiOperation(value = "获取该场比赛半全场进球数赔率数据")
    @GetMapping(value = "/queryRaceRateNum")
    public BaseResult queryRaceRateNum(
            @RequestParam(required = true,
                defaultValue = "#AC#B1#C1#D8#E79321987#F3#R0#P^14#Q^37628399#",
                value = "raceId")String raceId) {
        List<RaceRateNum> raceRateNums = raceInfoService.queryRaceRateNum(raceId);
        return BaseResult.ok("获取成功", raceRateNums);
    }

    @ApiOperation(value = "获取该场比赛半全场正确比分2串1赔率数据")
    @GetMapping(value = "/queryRaceRateScoreAnd")
    public BaseResult queryRaceRateScoreAnd(
            @RequestParam(required = true,
                    defaultValue = "#AC#B1#C1#D8#E79321987#F3#R0#P^14#Q^37628399#",
                    value = "raceId")String raceId) {
        RaceRateScoreAnd raceRateScoreAnd = raceInfoService.queryRaceRateScoreAnd(raceId);
        return BaseResult.ok("获取成功", raceRateScoreAnd);
    }

    @ApiOperation(value = "获取该场比赛半全场正确比分分别赔率数据")
    @GetMapping(value = "/queryRaceRateScoreOr")
    public BaseResult queryRaceRateScoreOr(
            @RequestParam(required = true,
                    defaultValue = "#AC#B1#C1#D8#E79321987#F3#R0#P^14#Q^37628399#",
                    value = "raceId")String raceId) {
        List<RaceRateScoreOr> raceRateScoreOrs = raceInfoService.queryRaceRateScoreOr(raceId);
        return BaseResult.ok("获取成功", raceRateScoreOrs);
    }

    @ApiOperation(value = "抓取更新某联赛比赛信息列表数据")
    @GetMapping(value = "/fetchRaceInfoList")
    public BaseResult fetchRaceInfoList(@RequestParam(required = true, defaultValue = "1", value = "type") Integer type) throws Exception {
        List<RaceInfo> raceInfos = raceInfoService.fetchRaceInfoList(type);
        return BaseResult.ok("抓取更新联赛比赛信息列表数据成功", raceInfos);
    }

    @ApiOperation(value = "抓取更新某场比赛 [ 主要盘口 ] 数据")
    @GetMapping(value = "/fetchMainPanData")
    public BaseResult fetchMainPanData(
            @RequestParam(required = true,
                    defaultValue = "#AC#B1#C1#D8#E79321987#F3#R0#P^14#Q^37628399#",
                    value = "raceId") String raceId) {
        mainPanDataService.fetchMainPanData(raceId);
        return BaseResult.ok("抓取更新某场比赛 [ 主要盘口 ] 数据成功");
    }

    @ApiOperation(value = "抓取更新某场比赛 [ 上下场 ] 数据")
    @GetMapping(value = "/fetchUpDownSectionData")
    public BaseResult fetchUpDownSectionData(
            @RequestParam(required = true,
                    defaultValue = "#AC#B1#C1#D8#E79321987#F3#R0#P^14#Q^37628399#",
                    value = "raceId") String raceId) throws SpiderException {
        upDownSectionDataService.fetchMainData(raceId);
        return BaseResult.ok("抓取更新某场比赛 [ 上下场 ] 数据成功");
    }

    @ApiOperation(value = "抓取更新某场比赛 [ 进球 ] 数据")
    @GetMapping(value = "/fetchEnterBallData")
    public BaseResult fetchEnterBallData(
            @RequestParam(required = true,
                    defaultValue = "#AC#B1#C1#D8#E79321987#F3#R0#P^14#Q^37628399#",
                    value = "raceId") String raceId) throws SpiderException {
        enterBallDataService.fetchMainData(raceId);
        return BaseResult.ok("抓取更新某场比赛 [ 进球 ] 数据成功");
    }
}
