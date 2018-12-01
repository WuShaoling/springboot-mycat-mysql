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
        int n = 20;

        for (int i = 1; i <= n; i++) {
            Goods goods = new Goods();
            goods.setName("good" + i);
            goods.setId(Long.valueOf(i));
            goods.setTypes(i % 3);
            goodsMapper.insertSelective(goods);
        }
        return "插入" + n + "条 Goods 数据成功";
    }

    @Override
    public List<Goods> queryData() {
        return goodsMapper.selectAll();
    }

    @Override
    public List<Goods> queryRangeData() {
        return goodsMapper.selectRange();
    }
}
