package com.wsl.mycat.service;

import com.wsl.mycat.dao.entity.TravelRecord;
import com.wsl.mycat.dao.mapper.TravelRecordMapper;
import com.wsl.mycat.service.interfaces.TravelRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TravelRecordServiceImpl implements TravelRecordService {

    @Autowired
    TravelRecordMapper travelRecordMapper;

    @Override
    public String addData() {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            TravelRecord travelRecord = new TravelRecord();
            travelRecord.setArea(i % 5);
            travelRecordMapper.insertSelective(travelRecord);
        }
        return "插入" + n + "条 TravelRecord 数据成功";
    }

    @Override
    public List<TravelRecord> queryData() {
        return travelRecordMapper.selectAll();
    }
}
