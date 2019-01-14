-- MySQL dump 10.13  Distrib 5.1.73, for Win32 (ia32)
--
-- Host: localhost    Database: mb11_new
-- ------------------------------------------------------
-- Server version	5.1.73-community

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
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL,
  `address1` varchar(100) DEFAULT NULL,
  `address2` varchar(100) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `pincode` varchar(100) DEFAULT NULL,
  `state` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (3,'test','test','test','test','test','test'),(4,'test1','test','test','test','test','test');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (6),(6),(6),(6),(6),(6),(6),(6),(6),(6),(6),(6),(6);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `match_team_link`
--

DROP TABLE IF EXISTS `match_team_link`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `match_team_link` (
  `id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `match_team_link`
--

LOCK TABLES `match_team_link` WRITE;
/*!40000 ALTER TABLE `match_team_link` DISABLE KEYS */;
/*!40000 ALTER TABLE `match_team_link` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `match_team_link_mid`
--

DROP TABLE IF EXISTS `match_team_link_mid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `match_team_link_mid` (
  `match_team_link_id` bigint(20) NOT NULL,
  `mid_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_67nx4tkqwhm8sb53lq7u8fu6t` (`mid_id`),
  KEY `FKib63id70h90bxfjai1j38057a` (`match_team_link_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `match_team_link_mid`
--

LOCK TABLES `match_team_link_mid` WRITE;
/*!40000 ALTER TABLE `match_team_link_mid` DISABLE KEYS */;
/*!40000 ALTER TABLE `match_team_link_mid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `match_team_link_seriesteamlinkid`
--

DROP TABLE IF EXISTS `match_team_link_seriesteamlinkid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `match_team_link_seriesteamlinkid` (
  `match_team_link_id` bigint(20) NOT NULL,
  `seriesteamlinkid_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_1h2ymadfhox3ufr9ufqxanm7d` (`seriesteamlinkid_id`),
  KEY `FK9c4qgwqs1e38mwpvt7n9ou0ap` (`match_team_link_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `match_team_link_seriesteamlinkid`
--

LOCK TABLES `match_team_link_seriesteamlinkid` WRITE;
/*!40000 ALTER TABLE `match_team_link_seriesteamlinkid` DISABLE KEYS */;
/*!40000 ALTER TABLE `match_team_link_seriesteamlinkid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `matches`
--

DROP TABLE IF EXISTS `matches`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `matches` (
  `id` bigint(20) NOT NULL,
  `matchname` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matches`
--

LOCK TABLES `matches` WRITE;
/*!40000 ALTER TABLE `matches` DISABLE KEYS */;
/*!40000 ALTER TABLE `matches` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `matches_series`
--

DROP TABLE IF EXISTS `matches_series`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `matches_series` (
  `match_id` bigint(20) NOT NULL,
  `series_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_dxbn2m0j5qfqi47eltoaexb7n` (`series_id`),
  KEY `FK2itbg06j866h8l9dj5i61jb5x` (`match_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matches_series`
--

LOCK TABLES `matches_series` WRITE;
/*!40000 ALTER TABLE `matches_series` DISABLE KEYS */;
/*!40000 ALTER TABLE `matches_series` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `minvite_platform`
--

DROP TABLE IF EXISTS `minvite_platform`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `minvite_platform` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_4x2jl270i0vgpq6hnn2e58cib` (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `minvite_platform`
--

LOCK TABLES `minvite_platform` WRITE;
/*!40000 ALTER TABLE `minvite_platform` DISABLE KEYS */;
/*!40000 ALTER TABLE `minvite_platform` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mteam`
--

DROP TABLE IF EXISTS `mteam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mteam` (
  `id` bigint(20) NOT NULL,
  `sporttype` int(11) NOT NULL,
  `teamname` varchar(255) NOT NULL,
  `mteam` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_l79hvnokabnnpm5evtp46nvjw` (`teamname`),
  KEY `FKcb48lrjb9brqic6d5fqlfd8sc` (`mteam`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mteam`
--

LOCK TABLES `mteam` WRITE;
/*!40000 ALTER TABLE `mteam` DISABLE KEYS */;
INSERT INTO `mteam` VALUES (1,2,'Myteam1',NULL),(2,0,'Myteam2',NULL);
/*!40000 ALTER TABLE `mteam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mteam_team_players`
--

DROP TABLE IF EXISTS `mteam_team_players`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mteam_team_players` (
  `mteam_id` bigint(20) NOT NULL,
  `team_players_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_ggflm7lpqkoi01980b8owgwqr` (`team_players_id`),
  KEY `FKo8cas5ywk1mys9sr4l6jtdfbt` (`mteam_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mteam_team_players`
--

LOCK TABLES `mteam_team_players` WRITE;
/*!40000 ALTER TABLE `mteam_team_players` DISABLE KEYS */;
/*!40000 ALTER TABLE `mteam_team_players` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `player_credit`
--

DROP TABLE IF EXISTS `player_credit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_credit` (
  `id` bigint(20) NOT NULL,
  `credit` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player_credit`
--

LOCK TABLES `player_credit` WRITE;
/*!40000 ALTER TABLE `player_credit` DISABLE KEYS */;
/*!40000 ALTER TABLE `player_credit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `player_credit_vseries_teamplayerid`
--

DROP TABLE IF EXISTS `player_credit_vseries_teamplayerid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_credit_vseries_teamplayerid` (
  `player_credit_id` bigint(20) NOT NULL,
  `vseries_teamplayerid_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_md72ksbasut4vqwfwlonfadw8` (`vseries_teamplayerid_id`),
  KEY `FKpc5qsgmkaylgole88hgvum171` (`player_credit_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player_credit_vseries_teamplayerid`
--

LOCK TABLES `player_credit_vseries_teamplayerid` WRITE;
/*!40000 ALTER TABLE `player_credit_vseries_teamplayerid` DISABLE KEYS */;
/*!40000 ALTER TABLE `player_credit_vseries_teamplayerid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_user_link`
--

DROP TABLE IF EXISTS `role_user_link`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_user_link` (
  `id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_user_link`
--

LOCK TABLES `role_user_link` WRITE;
/*!40000 ALTER TABLE `role_user_link` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_user_link` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_user_link_roleid`
--

DROP TABLE IF EXISTS `role_user_link_roleid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_user_link_roleid` (
  `role_user_link_id` bigint(20) NOT NULL,
  `roleid_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_53y2lucq99l5yswobybex8ojr` (`roleid_id`),
  KEY `FK1mtbsr1ydgtoa6b5bbfd0m3s3` (`role_user_link_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_user_link_roleid`
--

LOCK TABLES `role_user_link_roleid` WRITE;
/*!40000 ALTER TABLE `role_user_link_roleid` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_user_link_roleid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_user_link_userid`
--

DROP TABLE IF EXISTS `role_user_link_userid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_user_link_userid` (
  `role_user_link_id` bigint(20) NOT NULL,
  `userid_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_pn4wd30elb43165q9sixwicel` (`userid_id`),
  KEY `FKslgbbqh2rs1sh0pkbsqyj0rc6` (`role_user_link_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_user_link_userid`
--

LOCK TABLES `role_user_link_userid` WRITE;
/*!40000 ALTER TABLE `role_user_link_userid` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_user_link_userid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roles` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ofx66keruapi6vyqpv6f2or37` (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `series`
--

DROP TABLE IF EXISTS `series`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `series` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `enddate` datetime NOT NULL,
  `seriesid` varchar(30) NOT NULL,
  `sname` varchar(30) NOT NULL,
  `startdate` datetime NOT NULL,
  `totalmatch` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_3volsljiyv1bjbeb43hapmo6y` (`seriesid`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `series`
--

LOCK TABLES `series` WRITE;
/*!40000 ALTER TABLE `series` DISABLE KEYS */;
INSERT INTO `series` VALUES (1,'2019-01-14 01:32:10','test1','test1','2019-01-14 01:32:10',11),(2,'2019-01-14 01:34:42','test2','test2','2019-01-14 01:34:42',11),(5,'2019-01-14 01:53:53','test5','test5','2019-01-14 01:53:53',11),(6,'2019-01-14 02:03:40','test','test','2019-01-14 02:03:40',11),(7,'2019-01-14 02:06:42','test7','test7','2019-01-14 02:06:42',11);
/*!40000 ALTER TABLE `series` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `series_team_link`
--

DROP TABLE IF EXISTS `series_team_link`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `series_team_link` (
  `id` bigint(20) NOT NULL,
  `mteam` bigint(20) NOT NULL,
  `series` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6j3x6to7tnwwogj6a8l4pcnob` (`series`),
  KEY `FKf67m0mogk8t2nlqwfybre3sow` (`mteam`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `series_team_link`
--

LOCK TABLES `series_team_link` WRITE;
/*!40000 ALTER TABLE `series_team_link` DISABLE KEYS */;
INSERT INTO `series_team_link` VALUES (1,1,1);
/*!40000 ALTER TABLE `series_team_link` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `series_team_link_m_team`
--

DROP TABLE IF EXISTS `series_team_link_m_team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `series_team_link_m_team` (
  `series_team_link_id` bigint(20) NOT NULL,
  `m_team_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_hc5fodxdau4h1hwfc1pdjxw94` (`m_team_id`),
  KEY `FK35ayy5kp09v3ot6hghv2neun6` (`series_team_link_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `series_team_link_m_team`
--

LOCK TABLES `series_team_link_m_team` WRITE;
/*!40000 ALTER TABLE `series_team_link_m_team` DISABLE KEYS */;
/*!40000 ALTER TABLE `series_team_link_m_team` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `series_team_link_series`
--

DROP TABLE IF EXISTS `series_team_link_series`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `series_team_link_series` (
  `series_team_link_id` bigint(20) NOT NULL,
  `series_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_h041b7h2hmyln878i4k55jn8u` (`series_id`),
  KEY `FKdupxv8oqdkxfwqns9euq8ib37` (`series_team_link_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `series_team_link_series`
--

LOCK TABLES `series_team_link_series` WRITE;
/*!40000 ALTER TABLE `series_team_link_series` DISABLE KEYS */;
/*!40000 ALTER TABLE `series_team_link_series` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `series_team_player`
--

DROP TABLE IF EXISTS `series_team_player`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `series_team_player` (
  `id` bigint(20) NOT NULL,
  `sid` bigint(20) NOT NULL,
  `tpid` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4mv4ishknxnwfw5io4yguqj2i` (`tpid`),
  KEY `FKr38jdbfqlgnc3b344njq7n5q4` (`sid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `series_team_player`
--

LOCK TABLES `series_team_player` WRITE;
/*!40000 ALTER TABLE `series_team_player` DISABLE KEYS */;
/*!40000 ALTER TABLE `series_team_player` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `series_team_player_sid`
--

DROP TABLE IF EXISTS `series_team_player_sid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `series_team_player_sid` (
  `series_team_player_id` bigint(20) NOT NULL,
  `sid_id` bigint(20) NOT NULL,
  KEY `FKcd2006biyhw4erdxd004l34xe` (`sid_id`),
  KEY `FKl47b74k7945ssw2w2g6p8h6li` (`series_team_player_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `series_team_player_sid`
--

LOCK TABLES `series_team_player_sid` WRITE;
/*!40000 ALTER TABLE `series_team_player_sid` DISABLE KEYS */;
/*!40000 ALTER TABLE `series_team_player_sid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `series_team_player_tpid`
--

DROP TABLE IF EXISTS `series_team_player_tpid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `series_team_player_tpid` (
  `series_team_player_id` bigint(20) NOT NULL,
  `tpid_id` bigint(20) NOT NULL,
  KEY `FK4xi88xqebme6frhpb9x17kr7w` (`tpid_id`),
  KEY `FK40v3oaho003lq937ukrovxmch` (`series_team_player_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `series_team_player_tpid`
--

LOCK TABLES `series_team_player_tpid` WRITE;
/*!40000 ALTER TABLE `series_team_player_tpid` DISABLE KEYS */;
/*!40000 ALTER TABLE `series_team_player_tpid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team_players`
--

DROP TABLE IF EXISTS `team_players`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `team_players` (
  `id` bigint(20) NOT NULL,
  `firstname` varchar(30) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `middlename` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team_players`
--

LOCK TABLES `team_players` WRITE;
/*!40000 ALTER TABLE `team_players` DISABLE KEYS */;
/*!40000 ALTER TABLE `team_players` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team_players_m_team`
--

DROP TABLE IF EXISTS `team_players_m_team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `team_players_m_team` (
  `team_players_id` bigint(20) NOT NULL,
  `m_team_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_hrq5unhjj8ql6vkb5l974ycp1` (`m_team_id`),
  KEY `FKcfg4yh7pl1jll50g8ylhg57if` (`team_players_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team_players_m_team`
--

LOCK TABLES `team_players_m_team` WRITE;
/*!40000 ALTER TABLE `team_players_m_team` DISABLE KEYS */;
/*!40000 ALTER TABLE `team_players_m_team` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_invite_platform_link`
--

DROP TABLE IF EXISTS `user_invite_platform_link`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_invite_platform_link` (
  `id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_invite_platform_link`
--

LOCK TABLES `user_invite_platform_link` WRITE;
/*!40000 ALTER TABLE `user_invite_platform_link` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_invite_platform_link` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_invite_platform_link_minviteplatformid`
--

DROP TABLE IF EXISTS `user_invite_platform_link_minviteplatformid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_invite_platform_link_minviteplatformid` (
  `user_invite_platform_link_id` bigint(20) NOT NULL,
  `minviteplatformid_id` bigint(20) NOT NULL,
  KEY `FKkrr6vukc2ddq8lgm0p1p2wpgs` (`minviteplatformid_id`),
  KEY `FKgo2dwiadpohd4uval8ft57qt6` (`user_invite_platform_link_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_invite_platform_link_minviteplatformid`
--

LOCK TABLES `user_invite_platform_link_minviteplatformid` WRITE;
/*!40000 ALTER TABLE `user_invite_platform_link_minviteplatformid` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_invite_platform_link_minviteplatformid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_invite_platform_link_userid`
--

DROP TABLE IF EXISTS `user_invite_platform_link_userid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_invite_platform_link_userid` (
  `user_invite_platform_link_id` bigint(20) NOT NULL,
  `userid_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_e2cqqmx9rckumrgb3dfiaajob` (`userid_id`),
  KEY `FKc00pg5xki4vqj3p4pj3qprj9k` (`user_invite_platform_link_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_invite_platform_link_userid`
--

LOCK TABLES `user_invite_platform_link_userid` WRITE;
/*!40000 ALTER TABLE `user_invite_platform_link_userid` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_invite_platform_link_userid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `createtime` datetime NOT NULL,
  `dob` datetime DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `emailverified` bit(1) DEFAULT NULL,
  `firstname` varchar(50) DEFAULT NULL,
  `imageurl` varchar(100) DEFAULT NULL,
  `lastname` varchar(50) DEFAULT NULL,
  `middlename` varchar(50) DEFAULT NULL,
  `mobilenumber` varchar(10) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `providerid` varchar(100) DEFAULT NULL,
  `reffrencecode` varchar(50) DEFAULT NULL,
  `updatetime` datetime NOT NULL,
  `address_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKditu6lr4ek16tkxtdsne0gxib` (`address_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'mb11_new'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-14 13:31:39
