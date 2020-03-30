package com.lxx1030.mall.tiny.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxx1030.mall.tiny.mapper.PmsBrandMapper;
import com.lxx1030.mall.tiny.pojo.PmsBrand;
import com.lxx1030.mall.tiny.service.PmsBrandService;

@Service
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandMapper, PmsBrand> implements PmsBrandService {
    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return pmsBrandMapper.selectList(null);
    }

    @Override
    public List<PmsBrand> getBrandByName(String name) {
        return pmsBrandMapper.selectByName(name);
    }
}
