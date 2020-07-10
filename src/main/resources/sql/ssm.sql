/*
 Navicat MySQL Data Transfer

 Source Server         : localCnnection
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : ssm

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 10/07/2020 17:50:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu`  (
  `menu_id` bigint(64) NOT NULL,
  `menu_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `menu_url` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `parent_menu_id` bigint(64) NOT NULL,
  `menu_priority` int(32) NOT NULL,
  `is_leaf_menu` int(32) NOT NULL,
  `create_time` date NOT NULL,
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `role_id` bigint(64) NOT NULL,
  `role_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_time` date NOT NULL,
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` bigint(64) NOT NULL,
  `login_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `login_password` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `last_login_time` date NULL DEFAULT NULL,
  `login_count` int(64) NULL DEFAULT NULL,
  `email` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mobile` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1281485030320902144, 'q1234560', '123456', '测试user0', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485032938147840, 'q1234561', '123456', '测试user1', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033013645312, 'q1234563', '123456', '测试user3', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033030422528, 'q1234564', '123456', '测试user4', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033047199744, 'q1234565', '123456', '测试user5', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033059782656, 'q1234566', '123456', '测试user6', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033076559872, 'q1234567', '123456', '测试user7', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033093337088, 'q1234568', '123456', '测试user8', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033105920000, 'q1234569', '123456', '测试user9', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033122697216, 'q12345610', '123456', '测试user10', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033135280128, 'q12345611', '123456', '测试user11', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033152057344, 'q12345612', '123456', '测试user12', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033164640256, 'q12345613', '123456', '测试user13', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033181417472, 'q12345614', '123456', '测试user14', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033210777600, 'q12345615', '123456', '测试user15', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033240137728, 'q12345616', '123456', '测试user16', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033252720640, 'q12345617', '123456', '测试user17', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033269497856, 'q12345618', '123456', '测试user18', NULL, NULL, '123@XXX.com', '123321');
INSERT INTO `user` VALUES (1281485033282080768, 'q12345619', '123456', '测试user19', NULL, NULL, '123@XXX.com', '123321');

SET FOREIGN_KEY_CHECKS = 1;
