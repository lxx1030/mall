package com.lxx1030.mall.tiny.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
    * 品牌表
    */
@ApiModel(value="com-lxx1030-mall-tiny-pojo-PmsBrand")
@Data
@Builder
@TableName(value = "pms_brand")
public class PmsBrand {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="ID")
    private Integer id;

    /**
     * 品牌名称
     */
    @TableField(value = "name")
    @ApiModelProperty(value="品牌名称")
    private String name;

    /**
     * 首字母
     */
    @TableField(value = "first_letter")
    @ApiModelProperty(value="首字母")
    private String firstLetter;

    /**
     * 排序
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="排序")
    private Integer sort;

    /**
     * 是否为品牌制造商：0->不是；1->是
     */
    @TableField(value = "factory_status")
    @ApiModelProperty(value="是否为品牌制造商：0->不是；1->是")
    private Integer factoryStatus;

    /**
     * 是否显示：0->不是；1->是
     */
    @TableField(value = "show_status")
    @ApiModelProperty(value="是否显示：0->不是；1->是")
    private Integer showStatus;

    /**
     * 产品数量
     */
    @TableField(value = "product_count")
    @ApiModelProperty(value="产品数量")
    private Integer productCount;

    /**
     * 产品评论数量
     */
    @TableField(value = "product_comment_count")
    @ApiModelProperty(value="产品评论数量")
    private Integer productCommentCount;

    /**
     * 品牌logo
     */
    @TableField(value = "logo")
    @ApiModelProperty(value="品牌logo")
    private String logo;

    /**
     * 专区大图
     */
    @TableField(value = "big_pic")
    @ApiModelProperty(value="专区大图")
    private String bigPic;

    /**
     * 品牌故事
     */
    @TableField(value = "brand_story")
    @ApiModelProperty(value="品牌故事")
    private String brandStory;
}