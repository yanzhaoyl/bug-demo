package com.yanzhaoyl.bug.demo.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-07-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("taobao_coupon")
public class TaobaoCoupon implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 优惠券主键ID
     */
    @TableId
    private String couponId;

    /**
     * 商品ID(外表关联)
     */
    private Long itemId;
    /**
     * 优惠券开始时间
     */
    private String couponStartTime;

    /**
     * 优惠券结束时间
     */
    private String couponEndTime;

    /**
     * 优惠券总量
     */
    private Integer couponTotalCount;

    /**
     * 优惠券剩余量
     */
    private Integer couponRemainCount;

    /**
     * 优惠券满减信息
     */
    private String couponInfo;

    /**
     * 优惠券起用门槛
     */
    private String couponStartFee;


}
