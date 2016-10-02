create database micomunidad;
use micomunidad;
/*
Navicat MySQL Data Transfer

Source Server         : prueba
Source Server Version : 50532
Source Host           : localhost:3306
Source Database       : micomunidad

Target Server Type    : MYSQL
Target Server Version : 50532
File Encoding         : 65001

Date: 2014-06-19 15:34:33
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `piso`
-- ----------------------------
DROP TABLE IF EXISTS `piso`;
CREATE TABLE `piso` (
  `idpiso` int(3) NOT NULL AUTO_INCREMENT,
  `metroscuadrados` int(5) DEFAULT NULL,
  `numero` int(2) DEFAULT NULL,
  `letra` varchar(1) DEFAULT NULL,
  `planta` int(3) DEFAULT NULL,
  `ubicacion` varchar(50) DEFAULT NULL,
  `calidad` varchar(20) DEFAULT NULL,
  `numhabitaciones` int(2) DEFAULT NULL,
  `garaje` tinyint(1) DEFAULT NULL,
  `precio` int(10) DEFAULT NULL,
  `orientacion` varchar(8) DEFAULT NULL,
  `dnivecino` varchar(9) DEFAULT NULL,
  PRIMARY KEY (`idpiso`),
  KEY `FK_piso1` (`dnivecino`),
  CONSTRAINT `FK_piso1` FOREIGN KEY (`dnivecino`) REFERENCES `vecino` (`dnivecino`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of piso
-- ----------------------------
INSERT INTO `piso` VALUES ('1', '65', '1', 'A', '1', 'Sevilla', 'Alta', '5', '1', '70000', 'Norte', '30267767c');

-- ----------------------------
-- Table structure for `recibo`
-- ----------------------------
DROP TABLE IF EXISTS `recibo`;
CREATE TABLE `recibo` (
  `idrecibo` int(5) NOT NULL,
  `idpiso` int(3) NOT NULL,
  `dnivecino` varchar(9) NOT NULL,
  `mes` varchar(10) DEFAULT NULL,
  `importe` int(3) DEFAULT NULL,
  PRIMARY KEY (`idrecibo`),
  KEY `FK_recibo` (`dnivecino`),
  KEY `FK_recibo1` (`idpiso`),
  CONSTRAINT `FK_recibo33` FOREIGN KEY (`dnivecino`) REFERENCES `piso` (`dnivecino`),
  CONSTRAINT `FK_recibo11` FOREIGN KEY (`idpiso`) REFERENCES `piso` (`idpiso`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of recibo
-- ----------------------------
INSERT INTO `recibo` VALUES ('1', '1', '30267767c', 'Enero', '200');

-- ----------------------------
-- Table structure for `vecino`
-- ----------------------------
DROP TABLE IF EXISTS `vecino`;
CREATE TABLE `vecino` (
  `dnivecino` varchar(9) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `fechanacimiento` varchar(10) DEFAULT NULL,
  `sexo` varchar(6) DEFAULT NULL,
  `edad` int(3) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `codpostal` int(5) DEFAULT NULL,
  `ciudad` varchar(50) DEFAULT NULL,
  `telefono` int(9) DEFAULT NULL,
  PRIMARY KEY (`dnivecino`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of vecino
-- ----------------------------
INSERT INTO `vecino` VALUES ('11111111x', 'Laura', 'Sanchez Terrero', '14/07/1990', 'Mujer', '23', 'Calle Betis', '41010', 'Sevilla', '954443456');
INSERT INTO `vecino` VALUES ('30267767c', 'Miguel Angel', 'Sigüenza Márquez', '16/07/1992', 'Varón', '21', 'Avenida del Deporte', '41020', 'Sevilla', '954440479');
