/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : seckill

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-05-29 17:29:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sk_goods
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '商品ID',
    `acts_name` varchar(30) DEFAULT NULL COMMENT '商品名称',
    `acts_title` varchar(64) DEFAULT NULL COMMENT '商品标题',
    `acts_img` varchar(64) DEFAULT NULL COMMENT '商品图片',
    `acts_detail` longtext COMMENT '商品详情',
    `acts_price` decimal(10,2) DEFAULT NULL,
    `acts_stock` int(11) DEFAULT '0' COMMENT '商品库存，-1表示没有限制',
    `sales` int(11) DEFAULT '0' COMMENT '已抢',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sk_goods
-- ----------------------------
INSERT INTO `item` VALUES ('1', 'iphoneX', 'Apple/苹果iPhone X 全网通4G手机苹果X 10', '/img/iphonex.png', 'Apple/苹果iPhone X 全网通4G手机苹果X 10', '7788.00', '100', '1');
INSERT INTO `item` VALUES ('2', '华为 Mate 10', 'Huawei/华为 Mate 10 6G+128G 全网通4G智能手机', '/img/meta10.png', 'Huawei/华为 Mate 10 6G+128G 全网通4G智能手机', '4199.00', '50', '1');


-- ----------------------------
-- Table structure for item_stock
-- ----------------------------
DROP TABLE IF EXISTS `item_stock`;
CREATE TABLE `item_stock` (
                              `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '秒杀商品id',
                              `item_id` bigint(20) DEFAULT NULL COMMENT '商品id',
                              `stock` int(11) DEFAULT NULL COMMENT '库存数量',
                              `version` int(11) DEFAULT NULL COMMENT '并发版本控制',
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item_stock
-- ----------------------------
INSERT INTO `item_stock` VALUES ('1', '1', '8', '0');
INSERT INTO `item_stock` VALUES ('2', '2', '8', '0');


-- ----------------------------
-- Table structure for sk_user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) unsigned NOT NULL COMMENT '用户id',
  `nickname` varchar(255) NOT NULL COMMENT '昵称',
  `password` varchar(32) DEFAULT NULL COMMENT 'MD5(MD5(pass明文+固定salt)+salt',
  `salt` varchar(10) DEFAULT NULL COMMENT '混淆盐',
  `head` varchar(128) DEFAULT NULL COMMENT '头像，云存储的ID',
  `register_date` datetime DEFAULT NULL COMMENT '注册时间',
  `last_login_date` datetime DEFAULT NULL COMMENT '上次登录时间',
  `login_count` int(11) DEFAULT NULL COMMENT '登录次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sk_user
-- ----------------------------
INSERT INTO `user` VALUES ('18181818181', 'jesper', 'b7797cce01b4b131b433b6acf4add449', '1a2b3c4d', null, '2018-05-21 21:10:21', '2018-05-21 21:10:25', '1');
INSERT INTO `user` VALUES ('18217272828', 'jesper', 'b7797cce01b4b131b433b6acf4add449', '1a2b3c4d', null, '2018-05-21 21:10:21', '2018-05-21 21:10:25', '1');

-- ----------------------------
-- Table structure for serial_number
-- ----------------------------
DROP TABLE IF EXISTS `serial_number`;
CREATE TABLE `serial_number` (

                                 `name` varchar(30) DEFAULT NULL COMMENT '商品名称',
                                 `value` int(11) DEFAULT '0' COMMENT '商品库存，-1表示没有限制',
                                 `step` int(11) DEFAULT '0' COMMENT '已抢'
                                     #         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of serial_number
-- ----------------------------


-- ----------------------------
-- Table structure for prompotion
-- ----------------------------
DROP TABLE IF EXISTS `prompotion`;
CREATE TABLE `prompotion` (
                              `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '秒杀商品id',
                              `name` varchar(30) DEFAULT NULL COMMENT '商品名称',
                              `start_date` datetime DEFAULT NULL COMMENT '秒杀开始时间',
                              `end_date` datetime DEFAULT NULL COMMENT '秒杀结束时间',
                              `item_id` bigint(20) DEFAULT NULL COMMENT '商品id',
                              `promotion_price` decimal(10,2) DEFAULT '0.00' COMMENT '秒杀价',
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of prompotion
-- ----------------------------
INSERT INTO `prompotion` VALUES ('1', 'pro1',  '2018-05-22 17:22:52', '2018-05-22 18:23:00', '0','0.00');
INSERT INTO `prompotion` VALUES ('2', 'pro2', '2018-04-29 22:56:10', '2018-05-01 22:56:15', '0','0.00');

DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
                              `id` char(20) NOT NULL,
                              `user_id` bigint(20) DEFAULT NULL,
                              `item_id` bigint(20) DEFAULT NULL,
                              `promotion_id` bigint(20) DEFAULT NULL,
                              `order_price` decimal(10,2) DEFAULT NULL,
                              `order_amount` int(11) DEFAULT NULL,
                              `order_total` int(11) DEFAULT NULL,
                              `order_time` datetime DEFAULT NULL,
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO `order_info` VALUES ('20230306000000000000', '1', '1','1', null, '1', null,'2018-05-29 17:02:00');
