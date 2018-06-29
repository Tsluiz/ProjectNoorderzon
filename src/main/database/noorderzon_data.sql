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
  `idartiest` int(11) NOT NULL AUTO_INCREMENT,
  `naam` varchar(45) DEFAULT NULL,
  `genre` varchar(45) DEFAULT NULL,
  `naam_voorstelling` varchar(45) DEFAULT NULL,
  `locatie_idlocatie` int(11) NOT NULL,
  PRIMARY KEY (`idartiest`),
  KEY `fk_artiest_locatie1_idx` (`locatie_idlocatie`),
  CONSTRAINT `fk_artiest_locatie1` FOREIGN KEY (`locatie_idlocatie`) REFERENCES `locatie` (`idlocatie`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artiest`
--

LOCK TABLES `artiest` WRITE;
/*!40000 ALTER TABLE `artiest` DISABLE KEYS */;
INSERT INTO `artiest` VALUES (1,'Dans Marike','dans','de dansende slofjes',0),(2,'gitaar Gerrit','muziek','gitaren rammen',0),(3,'Toms theater','theater','hard en zacht',0);
/*!40000 ALTER TABLE `artiest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locatie`
--

DROP TABLE IF EXISTS `locatie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `locatie` (
  `idlocatie` int(11) NOT NULL,
  `naam` varchar(45) DEFAULT NULL,
  `capaciteit` int(11) DEFAULT NULL,
  PRIMARY KEY (`idlocatie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locatie`
--

LOCK TABLES `locatie` WRITE;
/*!40000 ALTER TABLE `locatie` DISABLE KEYS */;
INSERT INTO `locatie` VALUES (1,'container',15),(2,'mainstage',500),(3,'tent',100);
/*!40000 ALTER TABLE `locatie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tijd`
--

DROP TABLE IF EXISTS `tijd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tijd` (
  `idtijd` int(11) NOT NULL AUTO_INCREMENT,
  `dag` varchar(45) DEFAULT NULL,
  `tijdstip` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtijd`)
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
  `idvoorstelling` int(11) NOT NULL,
  `resterende_plaatsen` int(11) DEFAULT NULL,
  `artiest_idartiest` int(11) NOT NULL,
  `tijd_idtijd` int(11) NOT NULL,
  PRIMARY KEY (`idvoorstelling`),
  KEY `fk_voorstelling_artiest_idx` (`artiest_idartiest`),
  KEY `fk_voorstelling_tijd1_idx` (`tijd_idtijd`),
  CONSTRAINT `fk_voorstelling_artiest` FOREIGN KEY (`artiest_idartiest`) REFERENCES `artiest` (`idartiest`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_voorstelling_tijd1` FOREIGN KEY (`tijd_idtijd`) REFERENCES `tijd` (`idtijd`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `voorstelling`
--

LOCK TABLES `voorstelling` WRITE;
/*!40000 ALTER TABLE `voorstelling` DISABLE KEYS */;
INSERT INTO `voorstelling` VALUES (1,500,1,1),(2,500,1,2),(3,500,1,3),(4,500,1,4),(5,500,1,5),(6,500,1,6),(7,500,1,7),(8,500,1,8),(9,500,1,9),(10,500,1,10),(11,500,1,11),(12,500,1,12),(13,100,1,1),(14,100,2,2),(15,100,2,3),(16,100,2,4),(17,100,2,5),(18,100,2,6),(19,100,2,7),(20,100,2,8),(21,100,2,9),(22,100,2,10),(23,100,2,11),(24,100,2,12),(25,15,2,1),(26,15,3,2),(27,15,3,3),(28,15,3,4),(29,15,3,5),(30,15,3,6),(31,15,3,7),(32,15,3,8),(33,15,3,9),(34,15,3,10),(35,15,3,11),(36,15,3,12);
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

-- Dump completed on 2018-06-29 11:51:37
