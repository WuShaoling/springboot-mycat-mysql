package com.wsl.mycat.service;

import com.wsl.mycat.dao.entity.HotNews;
import com.wsl.mycat.dao.mapper.HotNewsMapper;
import com.wsl.mycat.service.interfaces.HotNewsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class HotNewsServiceImpl implements HotNewsService {

    @Autowired
    HotNewsMapper hotNewsMapper;

    @Override
    public String addData() {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            HotNews hotNews = new HotNews();
            hotNews.setTitle("title" + i);
            hotNewsMapper.insertSelective(hotNews);
        }
        return "插入" + n + "条 HotNews 数据成功";
    }

    @Override
    public List<HotNews> queryData() {
        return hotNewsMapper.selectAll();
    }
}
