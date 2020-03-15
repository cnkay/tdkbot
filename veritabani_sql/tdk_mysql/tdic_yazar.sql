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
-- Table structure for table `yazar`
--

DROP TABLE IF EXISTS `yazar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yazar` (
  `yazar_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `kisa_ad` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `tam_ad` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`yazar_id`),
  UNIQUE KEY `UK_so55jug2epxl30jrdabe1343y` (`tam_ad`)
) ENGINE=MyISAM AUTO_INCREMENT=245 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yazar`
--

LOCK TABLES `yazar` WRITE;
/*!40000 ALTER TABLE `yazar` DISABLE KEYS */;
INSERT INTO `yazar` VALUES (1,'H. Taner','Haldun Taner'),(2,'E. Şafak','Elif Şafak'),(3,'H. E. Adıvar','Halide Edip Adıvar'),(4,'A. Ağaoğlu','Adalet Ağaoğlu'),(5,'N. Hikmet','Nazım Hikmet'),(6,'M. İzgü','Muzaffer İzgü'),(7,'P. Safa','Peyami Safa'),(8,'O. V. Kanık','Orhan Veli Kanık'),(9,'A. Ümit','Ahmet Ümit'),(10,'H. Z. Uşaklıgil','Halit Ziya Uşaklıgil'),(11,'A. Kabaklı','Ahmet Kabaklı'),(12,'Gevheri','Gevheri'),(13,'Ö. Seyfettin','Ömer Seyfettin'),(14,'A. İlhan','Attila İlhan'),(15,'N. F. Kısakürek','Necip Fazıl Kısakürek'),(16,'B. Necatigil','Behçet Necatigil'),(17,'A. Kulin','Ayşe Kulin'),(18,'M. Ş. Esendal','Memduh Şevket Esendal'),(19,'İ. Aral','İnci Aral'),(20,'M. Kaplan','Mehmet Kaplan'),(21,'C. Uçuk','Cahit Uçuk'),(22,'S. Dölek','Sulhi Dölek'),(23,'N. Uygur','Nermi Uygur'),(24,'E. Işınsu','Emine Işınsu'),(25,'S. F. Abasıyanık','Sait Faik Abasıyanık'),(26,'Y. K. Karaosmanoğlu','Yakup Kadri Karaosmanoğlu '),(27,'Ç. Altan','Çetin Altan'),(28,'S. M. Alus','Sermet Muhtar Alus'),(29,'A. Gündüz','Aka Gündüz'),(30,'İ. Özel','İsmet Özel'),(31,'Y. K. Beyatlı','Yahya Kemal Beyatlı'),(32,'Anayasa','Anayasa'),(33,'A. Kutlu','Ayla Kutlu'),(34,'B. R. Eyuboğlu','Bedri Rahmi Eyuboğlu'),(35,'Yunus Emre','Yunus Emre'),(36,'E. İ. Benice','Etem İzzet Benice'),(37,'N. Cumalı','Necati Cumalı'),(38,'F. Otyam','Fikret Otyam'),(39,'N. Nâzım','Nabizade Nâzım'),(40,'B. Felek','Burhan Felek'),(41,'T. Oflazoğlu','Turan Oflazoğlu'),(42,'A. Ş. Hisar','Abdülhak Şinasi Hisar'),(43,'F. R. Atay','Falih Rıfkı Atay'),(44,'Y. Z. Ortaç','Yusuf Ziya Ortaç'),(45,'R. N. Güntekin','Reşat Nuri Güntekin'),(46,'T. Buğra','Tarık Buğra'),(47,'İ. O. Anar','İhsan Oktay Anar'),(48,'H. C. Yalçın','Hüseyin Cahit Yalçın'),(49,'K. Korcan','Kerim Korcan'),(50,'N. Ataç','Nurullah Ataç'),(51,'S. Birsel','Salâh Birsel'),(52,'A. Boysan','Aydın Boysan'),(53,'R. H. Karay','Refik Halit Karay'),(54,'N. Eray','Nazlı Eray'),(55,'F. İz','Fahir İz'),(56,'F. N. Çamlıbel','Faruk Nafiz Çamlıbel'),(57,'Z. Gökalp','Ziya Gökalp'),(58,'O. Kemal','Orhan Kemal'),(59,'R. Enis','Reşat Enis'),(60,'A. H. Tanpınar','Ahmet Hamdi Tanpınar'),(61,'A. H. Çelebi','Asaf Halet Çelebi'),(62,'M. A. Ersoy','Mehmet Akif Ersoy'),(63,'S. İleri','Selim İleri'),(64,'Halikarnas Balıkçısı','Halikarnas Balıkçısı'),(65,'Halk türküsü','Halk türküsü'),(66,'M. Yesari','Mahmut Yesari'),(67,'O. Atay','Oğuz Atay'),(68,'H. R. Gürpınar','Hüseyin Rahmi Gürpınar'),(69,'E. M. Karakurt','Esat Mahmut Karakurt'),(70,'C. S. Tarancı','Cahit Sıtkı Tarancı'),(71,'Z. Selimoğlu','Zeyyat Selimoğlu'),(72,'İ. H. Baltacıoğlu','İsmail Hakkı Baltacıoğlu'),(73,'O. C. Kaygılı','Osman Cemal Kaygılı'),(74,'K. Tahir','Kemal Tahir'),(75,'A. Haşim','Ahmet Haşim'),(76,'H. F. Ozansoy','Halit Fahri Ozansoy'),(77,'Pir Sultan Abdal','Pir Sultan Abdal'),(78,'A. Erhat','Azra Erhat'),(79,'Bahai','Bahai'),(80,'E. Atasü','Erendiz Atasü'),(81,'Y. Atılgan','Yusuf Atılgan'),(82,'Ü. Dökmen','Üstün Dökmen'),(83,'E. E. Talu','Ercüment Ekrem Talu'),(84,'Ş. Rado','Şevket Rado'),(85,'Atatürk','Atatürk'),(86,'M. E. Yurdakul','Mehmet Emin Yurdakul'),(87,'R. E. Ünaydın','Ruşen Eşref Ünaydın'),(88,'M. C. Anday','Melih Cevdet Anday'),(89,'B. K. Çağlar','Behçet Kemal Çağlar'),(90,'C. Meriç','Cemil Meriç'),(91,'M. Mungan','Murathan Mungan'),(92,'N. Atsız','Nihal Atsız'),(93,'A. Rasim','Ahmet Rasim'),(94,'N. Araz','Nezihe Araz'),(95,'N. Meriç','Nezihe Meriç'),(96,'K. Bilbaşar','Kemal Bilbaşar'),(97,'E. B. Koryürek','Enis Behiç Koryürek'),(98,'T. Uyar','Tomris Uyar'),(99,'O. S. Orhon','Orhan Seyfi Orhon'),(100,'A. M. Dranas','Ahmet Muhip Dranas'),(101,'R. Erduran','Refik Erduran'),(102,'L. Tekin','Lâtife Tekin'),(103,'Karacaoğlan','Karacaoğlan'),(104,'F. F. Tülbentçi','Feridun Fazıl Tülbentçi'),(105,'R. Ilgaz','Rıfat Ilgaz'),(106,'O. Aysu','Osman Aysu'),(107,'T. Yücel','Tahsin Yücel'),(108,'B. Günel','Burhan Günel'),(109,'Y. Kemal','Yaşar Kemal'),(110,'S. Eyuboğlu','Sabahattin Eyuboğlu'),(111,'A. N. Asya','Arif Nihat Asya'),(112,'S. Ayverdi','Samiha Ayverdi'),(113,'E. C. Güney','Eflâtun Cem Güney'),(114,'M. C. Kuntay','Mithat Cemal Kuntay'),(115,'T. Halman','Talât Halman'),(116,'T. Dursun K','Tarık Dursun K.'),(117,'N. Kurşunlu','Nazım Kurşunlu'),(118,'B. Akyavaş','Beynun Akyavaş'),(119,'A. Sayar','Abbas Sayar'),(120,'A. K. Tecer','Ahmet Kutsi Tecer'),(121,'F. Baykurt','Fakir Baykurt'),(122,'H. Topuz','Hıfzı Topuz'),(123,'A. Midhat','Ahmet Midhat'),(124,'C. Külebi','Cahit Külebi'),(125,'Emrah','Emrah'),(126,'M. Kutlu','Mustafa Kutlu'),(127,'Z. O. Saba','Ziya Osman Saba'),(128,'H. S. Tanrıöver','Hamdullah Suphi Tanrıöver'),(129,'A. Cemal','Ahmet Cemal'),(130,'H. Bayaz','Hüseyin Bayaz'),(131,'İ. A. Gövsa','İbrahim Alâeddin Gövsa'),(132,'M. And','Metin And'),(133,'F. Köprülü','Fuat Köprülü'),(134,'S. Erez','Selçuk Erez'),(135,'A. H. Müftüoğlu','Ahmet Hikmet Müftüoğlu'),(136,'R. Mağden','Reha Mağden'),(137,'Evliya Çelebi','Evliya Çelebi'),(138,'A. N. Karacan','Ali Naci Karacan'),(139,'A. Altan','Ahmet Altan'),(140,'G. Sazak','Gürbüz Sazak'),(141,'E. Bener','Erhan Bener'),(142,'H. Birand','Hikmet Birand'),(143,'S. Kocagöz','Samim Kocagöz'),(144,'S. Hilav','Selâhattin Hilav'),(145,'Âşık Veysel','Âşık Veysel'),(146,'N. Kemal','Namık Kemal'),(147,'O. Rifat','Oktay Rifat'),(148,'M. Seyda','Mehmet Seyda'),(149,'F. H. Dağlarca','Fazıl Hüsnü Dağlarca'),(150,'Divanü Lügati\'t-Türk','Divanü Lügati\'t-Türk'),(151,'Y. N. Nayır','Yaşar Nabi Nayır'),(152,'N. Nadi','Nadir Nadi'),(153,'S. Ertem','Sadri Ertem'),(154,'M. Rona','Mustafa Rona'),(155,'M. N. Sepetçioğlu','Mustafa Necati Sepetçioğlu'),(156,'Dede Korkut','Dede Korkut'),(157,'Şeyh Galip','Şeyh Galip'),(158,'Âşık Ali İzzet','Âşık Ali İzzet'),(159,'A. Dino','Abidin Dino'),(160,'M. Uyguner','Muzaffer Uyguner'),(161,'N. Üstün','Nevzat Üstün'),(162,'M. S. Sutüven','Mustafa Seyit Sutüven'),(163,'Baki','Baki'),(164,'O. Pamuk','Orhan Pamuk'),(165,'Y. Koray','Yaman Koray'),(166,'Y. Z. Bahadınlı','Yusuf Ziya Bahadınlı'),(167,'S. Şengil','Salim Şengil'),(168,'A. İ. Özkan','Ali İzzet Özkan'),(169,'N. H. Onan','Necmettin Halil Onan'),(170,'S. Çokum','Sevinç Çokum'),(171,'B. S. Erdoğan','Bekir Sıtkı Erdoğan'),(172,'O. Hançerlioğlu','Orhan Hançerlioğlu'),(173,'Âşık Ömer','Âşık Ömer'),(174,'F. Celâlettin','Fahri Celâlettin'),(175,'T. Fikret','Tevfik Fikret'),(176,'N. S. Örik','Nahid Sırrı Örik'),(177,'Muhibbi','Muhibbi'),(178,'A. Özakın','Aysel Özakın'),(179,'Ö. B. Uşaklı','Ömer Bedrettin Uşaklı'),(180,'Seyrani','Seyrani'),(181,'K. Kamu','Kemalettin Kamu'),(182,'R. C. Ulunay','Ref\'i Cevat Ulunay'),(183,'P. Celal','Peride Celal'),(184,'İ. Tarus','İlhan Tarus'),(185,'Ruhsati','Ruhsati'),(186,'F. Erdinç','Fahri Erdinç'),(187,'M. Başaran','Mehmet Başaran'),(188,'Fuzuli','Fuzuli'),(189,'Süruri','Süruri'),(190,'Ruhi','Ruhi'),(191,'H. Aytekin','Halil Aytekin'),(192,'A. Nesin','Aziz Nesin'),(193,'S. Derviş','Suat Derviş'),(194,'Anonim şiir','Anonim şiir'),(195,'A. H. Tarhan','Abdülhak Hamit Tarhan'),(196,'Kul Mustafa','Kul Mustafa'),(197,'Cem Sultan','Cem Sultan'),(198,'Erzurumlu Emrah','Erzurumlu Emrah'),(199,'Fürüzan','Fürüzan'),(200,'K. Hulûsi','Kenan Hulûsi'),(201,'R. Çalapala','Rakım Çalapala'),(202,'H. Pulur','Hasan Pulur'),(203,'N. Neyzi','Nezih Neyzi'),(204,'Dadaloğlu','Dadaloğlu'),(205,'Nefi','Nefi'),(206,'M. Buyrukçu','Muzaffer Buyrukçu'),(207,'S. Ali','Sabahattin Ali'),(208,'S. Sema','Sadri Sema'),(209,'Şemsettin Sami','Şemseddin Sami'),(210,'F. Edgü','Ferit Edgü'),(211,'İ. Sarıer','İlker Sarıer'),(212,'C. Şehabettin','Cenap Şehabettin'),(213,'Neyzen Tevfik','Neyzen Tevfik'),(214,'Diyojen','Diyojen'),(215,'R. Akyavaş','Ragıp Akyavaş'),(216,'Nedim','Nedim'),(217,'O. N. Akın','Osman Nihat Akın'),(218,'A. Kilimci','Ayşe Kilimci'),(219,'N. Bezmen','Nermin Bezmen'),(220,'Süleyman Çelebi','Süleyman Çelebi'),(221,'M. Çınarlı','Mehmet Çınarlı'),(222,'İ. Sağır','İbrahim Sağır'),(223,'Dertli','Dertli'),(224,'H. A. Yücel','Hasan Âli Yücel'),(225,'Koca Ragıp Paşa','Koca Ragıp Paşa'),(226,'Rasih','Rasih'),(227,'Ziya Paşa','Ziya Paşa'),(228,'H. M. Ebcioğlu','Hikmet Münir Ebcioğlu'),(229,'Marş','Marş'),(230,'M. Celâl','Müsahipzade Celâl'),(231,'Şarkı','Şarkı'),(232,'R. T. Bölükbaşı','Rıza Tevfik Bölükbaşı'),(233,'L. Erbil','Leylâ Erbil'),(234,'Enderunlu Vasıf','Enderunlu Vasıf'),(235,'Atai','Atai'),(236,'Bayburtlu Zihni','Bayburtlu Zihni'),(237,'İrfani','İrfani'),(238,'O. Asena','Orhan Asena'),(239,'Z. Ö. Defne','Zeki Ömer Defne'),(240,'C. Bayar','Celal Bayar'),(241,'S. Taşer','Suat Taşer'),(242,'Yavuz Sultan Selim','Yavuz Sultan Selim'),(243,'M. İlhan','Mustafa İlhan'),(244,'S. Batu','Selâhattin Batu');
/*!40000 ALTER TABLE `yazar` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-08  7:32:51
