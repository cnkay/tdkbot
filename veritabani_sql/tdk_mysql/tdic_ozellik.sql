-- MySQL dump 10.13  Distrib 5.7.27, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: tdic
-- ------------------------------------------------------
-- Server version	5.7.27-0ubuntu0.18.04.1

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
-- Table structure for table `ozellik`
--

DROP TABLE IF EXISTS `ozellik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ozellik` (
  `ozellik_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `kisa_ad` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `tam_ad` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `tur` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`ozellik_id`)
) ENGINE=MyISAM AUTO_INCREMENT=66 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ozellik`
--

LOCK TABLES `ozellik` WRITE;
/*!40000 ALTER TABLE `ozellik` DISABLE KEYS */;
INSERT INTO `ozellik` VALUES (1,'a.','isim','3'),(2,'db.','dil bilgisi','1'),(3,'mat.','matematik','1'),(4,'esk.','eskimiş','4'),(5,'sf.','sıfat','3'),(6,'kim.','kimya','1'),(7,'hlk.','halk ağzında','4'),(8,'müz.','müzik','1'),(9,'bit. b.','bitki bilimi','1'),(10,'nsz','nesnesiz','3'),(11,'-i','-i','3'),(12,'hay. b.','hayvan bilimi','1'),(13,'din b.','din bilgisi','1'),(14,'argo','argo','4'),(15,'tıp','tıp','1'),(16,'gök b.','gök bilimi','1'),(17,'tar.','tarih','1'),(18,'ünl.','ünlem','3'),(19,'tkz.','teklifsiz konuşmada','4'),(20,'alay','alay yollu','4'),(21,'mec.','mecaz','4'),(22,'şaka','şaka yollu','4'),(23,'kaba','kaba konuşmada','4'),(24,'min.','mineraloji','1'),(25,'ekon.','ekonomi','1'),(26,'fiz.','fizik','1'),(27,'sp.','spor','1'),(28,'fel.','felsefe','1'),(29,'zf.','zarf','3'),(30,'anat.','anatomi','1'),(31,'coğ.','coğrafya','1'),(32,'jeol.','jeoloji','1'),(33,'ed.','edebiyat','1'),(34,'biy.','biyoloji','1'),(35,'zm.','zamir','3'),(36,'ask.','askerlik','1'),(37,'ruh b.','ruh bilimi','1'),(38,'tiy.','tiyatro','1'),(39,'dil b.','dil bilimi','1'),(40,'bağ.','bağlaç','3'),(41,'e.','edat','3'),(42,'mim.','mimarlık','1'),(43,'den.','denizcilik','1'),(44,'top. b.','toplum bilimi','1'),(45,'tek.','teknik','1'),(46,'eğt.','eğitim bilimi','1'),(47,'huk.','hukuk','1'),(48,'-e','-e','3'),(49,'-de','-de','3'),(50,'tic.','ticaret','1'),(51,'-le','-le','3'),(52,'man.','mantık','1'),(53,'-den','-den','3'),(54,'bl.','bilişim','1'),(55,'sin.','sinema','1'),(56,'TV','televizyon','1'),(57,'meteor.','meteoroloji','1'),(58,'mdn.','madencilik','1'),(59,'ant.','antropoloji','1'),(60,'geom.','geometri','1'),(61,'fizy.','fizyoloji','1'),(62,'yar','yardımcı  fiil','3'),(63,'hkr.','hakaret yollu','4'),(64,'tekno.','teknoloji','1'),(65,'mit.','mit.','1');
/*!40000 ALTER TABLE `ozellik` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-08  7:32:52
