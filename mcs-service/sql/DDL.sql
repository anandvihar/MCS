CREATE  TABLE `MCS`.`users` (
  `name` VARCHAR(120) NOT NULL ,
  `user_id` VARCHAR(60) NOT NULL ,
  `password` VARCHAR(60) NOT NULL ,
  `email` VARCHAR(120) NULL ,
  `phone_no` VARCHAR(120) NULL ,
  `designation` VARCHAR(60) NULL ,
  `location` VARCHAR(45) NULL ,
  `role` VARCHAR(45) NULL ,
  `company` VARCHAR(45) NULL ,
  PRIMARY KEY (`user_id`) );
  
  
  CREATE  TABLE `MCS`.`machines` (
  `machine_name` VARCHAR(120) NOT NULL ,
  `machine_alt_name` VARCHAR(45) NULL ,
  PRIMARY KEY (`machine_name`) );
  
  CREATE  TABLE `MCS`.`sections` (
  `section_name` VARCHAR(45) NOT NULL ,
  `section_alt_name` VARCHAR(45) NULL ,
  PRIMARY KEY (`section_name`) );
  
  ALTER TABLE `MCS`.`sections` ADD COLUMN `section_id` VARCHAR(45) NOT NULL  AFTER `section_alt_name` 
, DROP PRIMARY KEY 
, ADD PRIMARY KEY (`section_id`) ;

ALTER TABLE `MCS`.`machines` ADD COLUMN `machine_id` VARCHAR(45) NOT NULL  AFTER `machine_alt_name` 
, DROP PRIMARY KEY 
, ADD PRIMARY KEY (`machine_id`) ;


CREATE TABLE `MCS`.`designations` (
  `designation_name` varchar(60) NOT NULL,
  `designation_alt_name` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`designation_name`)
);


CREATE  TABLE `MCS`.`user_role` (
  `role_id` INT NOT NULL ,
  `role_name` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`role_id`) );

CREATE  TABLE `MCS`.`user_role_map` (
  `user_id` INT NOT NULL ,
  `role_id` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`user_id`, `role_id`) );
  
  CREATE  TABLE `MCS`.`breakdown_priority` (
  `priority_id` INT NOT NULL ,
  `priority_label` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`priority_id`) );




