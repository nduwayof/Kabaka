CREATE DATABASE  IF NOT EXISTS `rebero` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `rebero`;
-- MySQL dump 10.13  Distrib 5.6.17, for osx10.6 (i386)
--
-- Host: localhost    Database: rebero
-- ------------------------------------------------------
-- Server version	5.6.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `individual`
--

DROP TABLE IF EXISTS `individual`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `individual` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ownerSurname` varchar(50) DEFAULT NULL,
  `ownerFirstName` varchar(50) DEFAULT NULL,
  `dob` varchar(50) DEFAULT NULL,
  `deceadDate` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `occupation` varchar(50) DEFAULT NULL,
  `nationality` varchar(50) DEFAULT NULL,
  `nationalId` varchar(50) DEFAULT NULL,
  `socialSecurityNumber` varchar(50) DEFAULT NULL,
  `passport` varchar(50) DEFAULT NULL,
  `homePhone` varchar(50) DEFAULT NULL,
  `workPhone` varchar(50) DEFAULT NULL,
  `cellPhone` varchar(50) DEFAULT NULL,
  `faxNo` varchar(50) DEFAULT NULL,
  `resident` tinyint(1) DEFAULT NULL,
  `countryOfResidence` varchar(50) DEFAULT NULL,
  `taxpayerType` int(11) DEFAULT NULL,
  `taxType` int(11) DEFAULT NULL,
  `civilStatus` varchar(50) DEFAULT NULL,
  `mariageName` varchar(50) DEFAULT NULL,
  `mariageSurname` varchar(50) DEFAULT NULL,
  `mariageDob` varchar(50) DEFAULT NULL,
  `plotNo` varchar(50) DEFAULT NULL,
  `street` varchar(50) DEFAULT NULL,
  `cellule` varchar(50) DEFAULT NULL,
  `sector` varchar(50) DEFAULT NULL,
  `district` varchar(50) DEFAULT NULL,
  `province` varchar(50) DEFAULT NULL,
  `mailingAddress` varchar(50) DEFAULT NULL,
  `mailHouseNo` varchar(50) DEFAULT NULL,
  `mailStreet` varchar(50) DEFAULT NULL,
  `mailPoBox` varchar(50) DEFAULT NULL,
  `mailCity` varchar(50) DEFAULT NULL,
  `mailCellule` varchar(50) DEFAULT NULL,
  `mailSector` varchar(50) DEFAULT NULL,
  `mailDistrict` varchar(50) DEFAULT NULL,
  `mailProvince` varchar(50) DEFAULT NULL,
  `taxpayerRepresentativeName` varchar(50) DEFAULT NULL,
  `representativeTitle` varchar(50) DEFAULT NULL,
  `representativePhoneNo` varchar(50) DEFAULT NULL,
  `contactName` varchar(50) DEFAULT NULL,
  `contactTitle` varchar(50) DEFAULT NULL,
  `contactPhoneNo` varchar(50) DEFAULT NULL,
  `doneAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `doneBy` varchar(50) DEFAULT NULL,
  `deletedStatus` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `taxpayerType` (`taxpayerType`),
  KEY `taxType` (`taxType`),
  CONSTRAINT `individual_ibfk_1` FOREIGN KEY (`taxpayerType`) REFERENCES `taxPayerType` (`id`),
  CONSTRAINT `individual_ibfk_2` FOREIGN KEY (`taxType`) REFERENCES `taxType` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `individual`
--

LOCK TABLES `individual` WRITE;
/*!40000 ALTER TABLE `individual` DISABLE KEYS */;
/*!40000 ALTER TABLE `individual` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nonindividual`
--

DROP TABLE IF EXISTS `nonindividual`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nonindividual` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `enterpriseType` varchar(50) DEFAULT NULL,
  `incBenefitsInvestment` varchar(50) DEFAULT NULL,
  `noOfExpiration` varchar(50) DEFAULT NULL,
  `expirationDate` varchar(30) DEFAULT NULL,
  `registeredName` varchar(50) DEFAULT NULL,
  `registrationDate` varchar(30) DEFAULT NULL,
  `comRegistrationNo` varchar(50) DEFAULT NULL,
  `resident` tinyint(1) DEFAULT NULL,
  `countryOfResidence` varchar(50) DEFAULT NULL,
  `entrepriseEmail` varchar(50) DEFAULT NULL,
  `nssfRegistrationNo` varchar(50) DEFAULT NULL,
  `entreprisePhoneNo` varchar(50) DEFAULT NULL,
  `entrepriseFaxNo` varchar(50) DEFAULT NULL,
  `startDate` varchar(30) DEFAULT NULL,
  `closeDate` varchar(30) DEFAULT NULL,
  `noOfShares` varchar(50) DEFAULT NULL,
  `sharesValue` varchar(50) DEFAULT NULL,
  `taxpayerType` int(11) DEFAULT NULL,
  `taxType` int(11) DEFAULT NULL,
  `plotNo` varchar(50) DEFAULT NULL,
  `street` varchar(50) DEFAULT NULL,
  `cellule` varchar(50) DEFAULT NULL,
  `sector` varchar(50) DEFAULT NULL,
  `district` varchar(50) DEFAULT NULL,
  `province` varchar(50) DEFAULT NULL,
  `mailingAddress` varchar(50) DEFAULT NULL,
  `mailPlotNo` varchar(50) DEFAULT NULL,
  `mailingStreet` varchar(50) DEFAULT NULL,
  `mailingPoBox` varchar(50) DEFAULT NULL,
  `mailingCity` varchar(50) DEFAULT NULL,
  `mailingCellule` varchar(50) DEFAULT NULL,
  `malingSector` varchar(50) DEFAULT NULL,
  `malingDistrict` varchar(50) DEFAULT NULL,
  `malingProvince` varchar(50) DEFAULT NULL,
  `taxpayerRepresentativeName` varchar(50) DEFAULT NULL,
  `represntativeTitle` varchar(50) DEFAULT NULL,
  `representativePhoneNo` varchar(50) DEFAULT NULL,
  `contactName` varchar(50) DEFAULT NULL,
  `contactTitle` varchar(50) DEFAULT NULL,
  `contactPhone` varchar(50) DEFAULT NULL,
  `doneBy` varchar(50) DEFAULT NULL,
  `doneAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `taxpayerType` (`taxpayerType`),
  KEY `taxType` (`taxType`),
  CONSTRAINT `nonindividual_ibfk_1` FOREIGN KEY (`taxpayerType`) REFERENCES `taxPayerType` (`id`),
  CONSTRAINT `nonindividual_ibfk_2` FOREIGN KEY (`taxType`) REFERENCES `taxType` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nonindividual`
--

LOCK TABLES `nonindividual` WRITE;
/*!40000 ALTER TABLE `nonindividual` DISABLE KEYS */;
/*!40000 ALTER TABLE `nonindividual` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taxType`
--

DROP TABLE IF EXISTS `taxType`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `taxType` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `taxType` varchar(50) DEFAULT NULL,
  `doneAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `doneBy` varchar(50) DEFAULT NULL,
  `deletedStatus` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taxType`
--

LOCK TABLES `taxType` WRITE;
/*!40000 ALTER TABLE `taxType` DISABLE KEYS */;
INSERT INTO `taxType` VALUES (1,'VAT','2015-03-05 20:56:12','Djuma',0),(2,'PAYE','2015-03-05 20:56:47','Djuma',0),(3,'CIT','2015-03-05 20:57:00','Djuma',0),(4,'PIT','2015-03-05 20:57:19','Djuma',0);
/*!40000 ALTER TABLE `taxType` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taxpayerType`
--

DROP TABLE IF EXISTS `taxpayerType`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `taxpayerType` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `taxpayerType` varchar(50) DEFAULT NULL,
  `doneAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `doneBy` varchar(50) DEFAULT NULL,
  `deletedStatus` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taxpayerType`
--

LOCK TABLES `taxpayerType` WRITE;
/*!40000 ALTER TABLE `taxpayerType` DISABLE KEYS */;
INSERT INTO `taxpayerType` VALUES (1,'Small','2015-03-05 20:53:45','Djuma',0),(2,'Medium','2015-03-05 20:55:18','Djuma',0);
/*!40000 ALTER TABLE `taxpayerType` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-03-05 23:24:13
