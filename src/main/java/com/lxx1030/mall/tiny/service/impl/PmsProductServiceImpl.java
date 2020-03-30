package com.lxx1030.mall.tiny.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxx1030.mall.tiny.mapper.PmsProductMapper;
import com.lxx1030.mall.tiny.pojo.PmsProduct;
import com.lxx1030.mall.tiny.service.PmsProductService;
@Service
public class PmsProductServiceImpl extends ServiceImpl<PmsProductMapper, PmsProduct> implements PmsProductService{

}
