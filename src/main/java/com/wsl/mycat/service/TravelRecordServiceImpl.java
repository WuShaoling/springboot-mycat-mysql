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
        for (int i = 1; i <= 20; i++) {
            TravelRecord travelRecord = new TravelRecord();
            travelRecord.setArea(i % 5);
            travelRecordMapper.insertSelective(travelRecord);
        }
        return "ok";
    }

    @Override
    public List<TravelRecord> queryData() {
        return travelRecordMapper.selectAll();
    }
}
