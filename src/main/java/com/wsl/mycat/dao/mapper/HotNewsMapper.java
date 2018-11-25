package com.wsl.mycat.dao.mapper;

import com.wsl.mycat.dao.entity.HotNews;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HotNewsMapper {

    List<HotNews> selectAll();

    int deleteByPrimaryKey(Long id);

    int insert(HotNews record);

    int insertSelective(HotNews record);

    HotNews selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HotNews record);

    int updateByPrimaryKey(HotNews record);
}