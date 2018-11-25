package com.wsl.mycat.dao.mapper;

import com.wsl.mycat.dao.entity.TravelRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TravelRecordMapper {

    List<TravelRecord> selectAll();

    int deleteByPrimaryKey(Long id);

    int insert(TravelRecord record);

    int insertSelective(TravelRecord record);

    TravelRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TravelRecord record);

    int updateByPrimaryKey(TravelRecord record);
}