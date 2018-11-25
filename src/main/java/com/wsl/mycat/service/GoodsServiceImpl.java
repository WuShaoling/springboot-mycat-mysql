package com.wsl.mycat.service;

import com.wsl.mycat.dao.entity.Goods;
import com.wsl.mycat.dao.mapper.GoodsMapper;
import com.wsl.mycat.service.interfaces.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public String addData() {
        for (int i = 1; i <= 20; i++) {
            Goods goods = new Goods();
            goods.setName("good" + i);
            goodsMapper.insertSelective(goods);
        }
        return "ok";
    }

    @Override
    public List<Goods> queryData() {
        return goodsMapper.selectAll();
    }
}
