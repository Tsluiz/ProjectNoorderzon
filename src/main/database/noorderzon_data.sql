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
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `naam` varchar(45) DEFAULT NULL,
  `genre` varchar(45) DEFAULT NULL,
  `naam_voorstelling` varchar(45) DEFAULT NULL,
  `locatie_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_artiest_locatie1_idx` (`locatie_id`),
  CONSTRAINT `fk_artiest_locatie1` FOREIGN KEY (`locatie_id`) REFERENCES `locatie` (id) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artiest`
--

LOCK TABLES `artiest` WRITE;
/*!40000 ALTER TABLE `artiest` DISABLE KEYS */;
INSERT INTO `artiest` VALUES (1,'Dans Marike','dans','de dansende slofjes',1),(2,'gitaar Gerrit','muziek','gitaren rammen',2),(3,'Toms theater','theater','hard en zacht',3);
/*!40000 ALTER TABLE `artiest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locatie`
--

DROP TABLE IF EXISTS `locatie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `locatie` (
  `id` int(11) NOT NULL,
  `naam` varchar(45) DEFAULT NULL,
  `capaciteit` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
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

DROP TABLE IF EXISTS `tijdstip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tijdstip` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dag` varchar(45) DEFAULT NULL,
  `tijd` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tijdstip`
--

LOCK TABLES `tijdstip` WRITE;
/*!40000 ALTER TABLE `tijdstip` DISABLE KEYS */;
INSERT INTO tijdstip VALUES (1,'dinsdag','18.00'),(2,'dinsdag','19.00'),(3,'dinsdag','20.00'),(4,'woensdag','18.00'),(5,'woensdag','19.00'),(6,'woensdag','20.00'),(7,'donderdag','18.00'),(8,'donderdag','19.00'),(9,'donderdag','20.00'),(10,'vrijdag','18.00'),(11,'vrijdag','19.00'),(12,'vrijdag','20.00');
/*!40000 ALTER TABLE `tijdstip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `voorstelling`
--

DROP TABLE IF EXISTS `voorstelling`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `voorstelling` (
  `id` int(11) NOT NULL,
  `resterende_plaatsen` int(11) DEFAULT NULL,
  `artiest_id` int(11) NOT NULL,
  `tijdstip_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_voorstelling_artiest_idx` (`artiest_id`),
  KEY `fk_voorstelling_tijd1_idx` (`tijdstip_id`),
  CONSTRAINT `fk_voorstelling_artiest` FOREIGN KEY (`artiest_id`) REFERENCES `artiest` (id) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_voorstelling_tijd1` FOREIGN KEY (`tijdstip_id`) REFERENCES tijdstip (id) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `voorstelling`
--

LOCK TABLES `voorstelling` WRITE;
/*!40000 ALTER TABLE `voorstelling` DISABLE KEYS */;
INSERT INTO `voorstelling` VALUES (1,0,1,1),(2,0,1,2),(3,0,1,3),(4,0,1,4),(5,0,1,5),(6,0,1,6),(7,0,1,7),(8,0,1,8),(9,0,1,9),(10,0,1,10),(11,0,1,11),(12,0,1,12),(13,0,2,1),(14,0,2,2),(15,0,2,3),(16,0,2,4),(17,0,2,5),(18,0,2,6),(19,0,2,7),(20,0,2,8),(21,0,2,9),(22,0,2,10),(23,0,2,11),(24,0,2,12),(25,0,3,1),(26,0,3,2),(27,0,3,3),(28,0,3,4),(29,0,3,5),(30,0,3,6),(31,0,3,7),(32,0,3,8),(33,0,3,9),(34,0,3,10),(35,0,3,11),(36,0,3,12);
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

UPDATE voorstelling v
INNER JOIN artiest a ON v.artiest_id = a.id
JOIN locatie l ON l.id = a.locatie_id
SET v.resterende_plaatsen = l.capaciteit;
