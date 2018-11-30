create database db_sync;
USE db_sync

DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `attributes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `orders_ID_uindex` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


create database db_business;
USE db_business

DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `company_ID_uindex` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `hotnews`;
CREATE TABLE `hotnews` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `table_name_hotnews_uindex` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `travelrecord`;
CREATE TABLE `travelrecord` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `area` int(11) DEFAULT 10000,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `travelrecord_id_uindex` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `goods_ID_uindex` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `gender` int(11) DEFAULT 0,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `customer_addr`;
CREATE TABLE `customer_addr` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_id` bigint(20) DEFAULT NULL,
  `addr` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `customer_addr_ID_uindex` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
