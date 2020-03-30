package com.lxx1030.mall.tiny.service;

import java.util.List;

import com.lxx1030.mall.tiny.pojo.PmsBrand;
import com.baomidou.mybatisplus.extension.service.IService;
public interface PmsBrandService extends IService<PmsBrand>{
    /**
     * 查询所有的品牌
     * @return
     */
    List<PmsBrand> listAllBrand();
}
