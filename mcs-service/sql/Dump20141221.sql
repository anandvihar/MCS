CREATE DATABASE  IF NOT EXISTS `MCS` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `MCS`;
-- MySQL dump 10.13  Distrib 5.6.19, for osx10.7 (i386)
--
-- Host: localhost    Database: MCS
-- ------------------------------------------------------
-- Server version	5.7.1-m11

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
-- Table structure for table `breakdown_priority`
--

DROP TABLE IF EXISTS `breakdown_priority`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `breakdown_priority` (
  `priority_id` int(11) NOT NULL,
  `priority_label` varchar(45) NOT NULL,
  PRIMARY KEY (`priority_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `breakdown_priority`
--

LOCK TABLES `breakdown_priority` WRITE;
/*!40000 ALTER TABLE `breakdown_priority` DISABLE KEYS */;
INSERT INTO `breakdown_priority` VALUES (10,'High'),(20,'Medium'),(30,'Low');
/*!40000 ALTER TABLE `breakdown_priority` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `breakdown_request_view`
--

DROP TABLE IF EXISTS `breakdown_request_view`;
/*!50001 DROP VIEW IF EXISTS `breakdown_request_view`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `breakdown_request_view` AS SELECT 
 1 AS `id`,
 1 AS `machine_id`,
 1 AS `machine_name`,
 1 AS `section_id`,
 1 AS `section_name`,
 1 AS `breakdown_due_date_time`,
 1 AS `requested_by`,
 1 AS `requested_designation_id`,
 1 AS `description`,
 1 AS `created_by`,
 1 AS `creation_time`,
 1 AS `status`,
 1 AS `status_message`,
 1 AS `breakdown_scheduled_end_time`,
 1 AS `breakdown_start_time`,
 1 AS `breakdown_end_time`,
 1 AS `priority_id`,
 1 AS `priority_label`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `breakdown_requests`
--

DROP TABLE IF EXISTS `breakdown_requests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `breakdown_requests` (
  `id` int(11) NOT NULL,
  `machine_id` varchar(60) DEFAULT NULL,
  `section_id` varchar(60) DEFAULT NULL,
  `breakdown_due_date_time` timestamp NULL DEFAULT NULL,
  `requested_by` varchar(120) DEFAULT NULL,
  `requested_designation_id` varchar(60) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `created_by` varchar(120) DEFAULT NULL,
  `creation_time` timestamp NULL DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `status_message` varchar(1000) DEFAULT NULL,
  `breakdown_scheduled_end_time` timestamp NULL DEFAULT NULL,
  `breakdown_start_time` timestamp NULL DEFAULT NULL,
  `breakdown_end_time` timestamp NULL DEFAULT NULL,
  `priority_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `breakdown_requests`
--

LOCK TABLES `breakdown_requests` WRITE;
/*!40000 ALTER TABLE `breakdown_requests` DISABLE KEYS */;
INSERT INTO `breakdown_requests` VALUES (2,'machine_id','section_id','2014-12-14 01:25:50','Sahl','designation_name','Everything will be good','admin','2014-12-13 12:27:31','open',NULL,NULL,NULL,NULL,10);
/*!40000 ALTER TABLE `breakdown_requests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `designations`
--

DROP TABLE IF EXISTS `designations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `designations` (
  `designation_name` varchar(60) NOT NULL,
  `designation_alt_name` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`designation_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `designations`
--

LOCK TABLES `designations` WRITE;
/*!40000 ALTER TABLE `designations` DISABLE KEYS */;
INSERT INTO `designations` VALUES ('designation_name','designation_alt_name');
/*!40000 ALTER TABLE `designations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `machines`
--

DROP TABLE IF EXISTS `machines`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `machines` (
  `machine_name` varchar(120) NOT NULL,
  `machine_alt_name` varchar(45) DEFAULT NULL,
  `machine_id` varchar(45) NOT NULL,
  PRIMARY KEY (`machine_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `machines`
--

LOCK TABLES `machines` WRITE;
/*!40000 ALTER TABLE `machines` DISABLE KEYS */;
INSERT INTO `machines` VALUES ('machine_name','machine_alt_id','machine_id');
/*!40000 ALTER TABLE `machines` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sections`
--

DROP TABLE IF EXISTS `sections`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sections` (
  `section_name` varchar(50) NOT NULL,
  `section_alt_name` varchar(45) DEFAULT NULL,
  `section_id` varchar(45) NOT NULL,
  PRIMARY KEY (`section_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sections`
--

LOCK TABLES `sections` WRITE;
/*!40000 ALTER TABLE `sections` DISABLE KEYS */;
INSERT INTO `sections` VALUES ('section_name','section_alt_name','section_id');
/*!40000 ALTER TABLE `sections` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_role` (
  `role_id` int(11) NOT NULL,
  `role_name` varchar(45) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role_map`
--

DROP TABLE IF EXISTS `user_role_map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_role_map` (
  `user_id` int(11) NOT NULL,
  `role_id` varchar(45) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role_map`
--

LOCK TABLES `user_role_map` WRITE;
/*!40000 ALTER TABLE `user_role_map` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_role_map` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `name` varchar(120) NOT NULL,
  `user_id` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL,
  `email` varchar(120) DEFAULT NULL,
  `phone_no` varchar(120) DEFAULT NULL,
  `designation` varchar(60) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  `company` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('admin','admin','admin','admin@abc.com','9810402070','designation','delhi','role','mcs');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `breakdown_request_view`
--

/*!50001 DROP VIEW IF EXISTS `breakdown_request_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `breakdown_request_view` AS select `a`.`id` AS `id`,`a`.`machine_id` AS `machine_id`,`b`.`machine_name` AS `machine_name`,`a`.`section_id` AS `section_id`,`c`.`section_name` AS `section_name`,`a`.`breakdown_due_date_time` AS `breakdown_due_date_time`,`a`.`requested_by` AS `requested_by`,`a`.`requested_designation_id` AS `requested_designation_id`,`a`.`description` AS `description`,`a`.`created_by` AS `created_by`,`a`.`creation_time` AS `creation_time`,`a`.`status` AS `status`,`a`.`status_message` AS `status_message`,`a`.`breakdown_scheduled_end_time` AS `breakdown_scheduled_end_time`,`a`.`breakdown_start_time` AS `breakdown_start_time`,`a`.`breakdown_end_time` AS `breakdown_end_time`,`a`.`priority_id` AS `priority_id`,`e`.`priority_label` AS `priority_label` from (((`breakdown_requests` `a` left join `machines` `b` on((`a`.`machine_id` = `b`.`machine_id`))) left join `sections` `c` on((`a`.`section_id` = `c`.`section_id`))) left join `breakdown_priority` `e` on((`a`.`priority_id` = `e`.`priority_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-12-21 21:27:32
