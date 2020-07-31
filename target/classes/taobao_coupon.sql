/*
Navicat MySQL Data Transfer

Source Server         : 39.105.89.88/shop
Source Server Version : 50646
Source Host           : 39.105.89.88:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50646
File Encoding         : 65001

Date: 2020-07-31 15:29:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `taobao_coupon`
-- ----------------------------
DROP TABLE IF EXISTS `taobao_coupon`;
CREATE TABLE `taobao_coupon` (
  `coupon_id` varchar(32) NOT NULL COMMENT '优惠券主键ID',
  `item_id` bigint(20) DEFAULT NULL COMMENT '商品ID(外表关联)',
  `coupon_start_time` varchar(10) DEFAULT NULL COMMENT '优惠券开始时间',
  `coupon_end_time` varchar(10) DEFAULT NULL COMMENT '优惠券结束时间',
  `coupon_total_count` int(20) DEFAULT NULL COMMENT '优惠券总量',
  `coupon_remain_count` int(20) DEFAULT '0' COMMENT '优惠券剩余量',
  `coupon_info` varchar(50) DEFAULT NULL COMMENT '优惠券满减信息',
  `coupon_start_fee` varchar(50) DEFAULT NULL COMMENT '优惠券起用门槛',
  PRIMARY KEY (`coupon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of taobao_coupon
-- ----------------------------
