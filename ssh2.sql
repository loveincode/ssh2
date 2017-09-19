/*
Navicat MySQL Data Transfer

Source Server         : loclhost
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : ssh2

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2017-09-19 15:45:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `hibernate_sequence`
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('1');
INSERT INTO `hibernate_sequence` VALUES ('1');

-- ----------------------------
-- Table structure for `news`
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` int(11) NOT NULL,
  `begintime` datetime DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------

-- ----------------------------
-- Table structure for `t_newstype`
-- ----------------------------
DROP TABLE IF EXISTS `t_newstype`;
CREATE TABLE `t_newstype` (
  `id` int(11) NOT NULL,
  `Uuid` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `deleted` bit(1) NOT NULL DEFAULT b'0',
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_newstype
-- ----------------------------
