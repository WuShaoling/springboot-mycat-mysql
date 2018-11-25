package com.wsl.mycat.service.interfaces;

import com.wsl.mycat.dao.entity.TravelRecord;

import java.util.List;

public interface TravelRecordService {
    String addData();

    List<TravelRecord> queryData();
}
