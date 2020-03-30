package com.lxx1030.mall.tiny.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lxx1030.mall.tiny.pojo.PmsBrand;

@Mapper
public interface PmsBrandMapper extends BaseMapper<PmsBrand> {
     List<PmsBrand> selectByName(@Param("name")String name);


}