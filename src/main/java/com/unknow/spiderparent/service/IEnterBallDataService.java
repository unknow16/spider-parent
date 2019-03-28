package com.unknow.spiderparent.service;

import com.unknow.spiderparent.common.SpiderException;

public interface IEnterBallDataService {

    void fetchMainData(String raceId)  throws SpiderException;
}
