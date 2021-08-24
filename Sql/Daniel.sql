/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : daniel

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 24/08/2021 10:19:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for code_library
-- ----------------------------
DROP TABLE IF EXISTS `code_library`;
CREATE TABLE `code_library`  (
  `codeno` int(0) NOT NULL,
  `codename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `codevalue` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`codeno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of code_library
-- ----------------------------
INSERT INTO `code_library` VALUES (0, '0', '未知');
INSERT INTO `code_library` VALUES (1, '1', '男');
INSERT INTO `code_library` VALUES (2, '2', '女');

-- ----------------------------
-- Table structure for student_info
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info`  (
  `stuId` int(0) NOT NULL,
  `stuName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stuAge` int(0) NULL DEFAULT NULL,
  `stuSex` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`stuId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO `student_info` VALUES (10001, '张三', 22, 1);
INSERT INTO `student_info` VALUES (10002, '李四', 22, 1);
INSERT INTO `student_info` VALUES (10003, '林夕', 22, 2);
INSERT INTO `student_info` VALUES (10004, '王五', 22, 1);
INSERT INTO `student_info` VALUES (10005, '梦星', 22, 2);
INSERT INTO `student_info` VALUES (10006, '林云梦', 22, 2);
INSERT INTO `student_info` VALUES (10007, '张宇', 22, 1);
INSERT INTO `student_info` VALUES (10008, '赵琳', 22, 2);
INSERT INTO `student_info` VALUES (10009, '陈三龙', 22, 1);
INSERT INTO `student_info` VALUES (10010, '王旭清', 22, 1);

SET FOREIGN_KEY_CHECKS = 1;
