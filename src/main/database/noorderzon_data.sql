-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: noorderzon_data
-- ------------------------------------------------------
-- Server version	5.7.21-log

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
-- Table structure for table `artiest`
--

DROP TABLE IF EXISTS `artiest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `artiest` (
  `naam` varchar(45) NOT NULL,
  `genre` varchar(45) DEFAULT NULL,
  `naam_voorstelling` varchar(45) DEFAULT NULL,
  `locatie_naam` varchar(45) NOT NULL,
  PRIMARY KEY (`naam`),
  KEY `fk_artiest_locatie1_idx` (`locatie_naam`),
  CONSTRAINT `fk_artiest_locatie1` FOREIGN KEY (`locatie_naam`) REFERENCES `locatie` (`naam`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artiest`
--

LOCK TABLES `artiest` WRITE;
/*!40000 ALTER TABLE `artiest` DISABLE KEYS */;
INSERT INTO `artiest` VALUES ('Dans Marike','dans','de dansende slofjes','mainstage'),('gitaar Gerrit','muziek','gitaren rammen','tent'),('Toms theater','theater','hard en zacht','container');
/*!40000 ALTER TABLE `artiest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locatie`
--

DROP TABLE IF EXISTS `locatie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `locatie` (
  `naam` varchar(45) NOT NULL,
  `capaciteit` int(11) NOT NULL,
  PRIMARY KEY (`naam`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locatie`
--

LOCK TABLES `locatie` WRITE;
/*!40000 ALTER TABLE `locatie` DISABLE KEYS */;
INSERT INTO `locatie` VALUES ('container',15),('mainstage',500),('tent',100);
/*!40000 ALTER TABLE `locatie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tijd`
--

DROP TABLE IF EXISTS `tijd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tijd` (
  `iddag` int(11) NOT NULL AUTO_INCREMENT,
  `dag` varchar(45) NOT NULL,
  `tijdstip` varchar(45) NOT NULL,
  PRIMARY KEY (`iddag`),
  UNIQUE KEY `idx_tijd_iddag` (`iddag`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tijd`
--

LOCK TABLES `tijd` WRITE;
/*!40000 ALTER TABLE `tijd` DISABLE KEYS */;
INSERT INTO `tijd` VALUES (1,'dinsdag','18.00'),(2,'dinsdag','19.00'),(3,'dinsdag','20.00'),(4,'woensdag','18.00'),(5,'woensdag','19.00'),(6,'woensdag','20.00'),(7,'donderdag','18.00'),(8,'donderdag','19.00'),(9,'donderdag','20.00'),(10,'vrijdag','18.00'),(11,'vrijdag','19.00'),(12,'vrijdag','20.00');
/*!40000 ALTER TABLE `tijd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `voorstelling`
--

DROP TABLE IF EXISTS `voorstelling`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `voorstelling` (
  `idvoorstelling` int(11) NOT NULL AUTO_INCREMENT,
  `resterende_plaatsen` int(11) DEFAULT NULL,
  `artiest_naam` varchar(45) NOT NULL,
  `tijd_iddag` int(11) NOT NULL,
  PRIMARY KEY (`idvoorstelling`),
  KEY `fk_voorstelling_artiest1_idx` (`artiest_naam`),
  KEY `fk_voorstelling_tijd1_idx` (`tijd_iddag`),
  CONSTRAINT `fk_voorstelling_artiest1` FOREIGN KEY (`artiest_naam`) REFERENCES `artiest` (`naam`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_voorstelling_tijd1` FOREIGN KEY (`tijd_iddag`) REFERENCES `tijd` (`iddag`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `voorstelling`
--

LOCK TABLES `voorstelling` WRITE;
/*!40000 ALTER TABLE `voorstelling` DISABLE KEYS */;
INSERT INTO `voorstelling` VALUES (1,500,'dans Marike',1),(2,500,'dans Marike',2),(3,500,'dans Marike',3),(4,500,'dans Marike',4),(5,500,'dans Marike',5),(6,500,'dans Marike',6),(7,500,'dans Marike',7),(8,500,'dans Marike',8),(9,500,'dans Marike',9),(10,500,'dans Marike',10),(11,500,'dans Marike',11),(12,500,'dans Marike',12),(13,100,'Toms theater',1),(14,100,'Toms theater',2),(15,100,'Toms theater',3),(16,100,'Toms theater',4),(17,100,'Toms theater',5),(18,100,'Toms theater',6),(19,100,'Toms theater',7),(20,100,'Toms theater',8),(21,100,'Toms theater',9),(22,100,'Toms theater',10),(23,100,'Toms theater',11),(24,100,'Toms theater',12),(25,15,'gitaar Gerrit',1),(26,15,'gitaar Gerrit',2),(27,15,'gitaar Gerrit',3),(28,15,'gitaar Gerrit',4),(29,15,'gitaar Gerrit',5),(30,15,'gitaar Gerrit',6),(31,15,'gitaar Gerrit',7),(32,15,'gitaar Gerrit',8),(33,15,'gitaar Gerrit',9),(34,15,'gitaar Gerrit',10),(35,15,'gitaar Gerrit',11),(36,15,'gitaar Gerrit',12);
/*!40000 ALTER TABLE `voorstelling` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-27 20:48:36
