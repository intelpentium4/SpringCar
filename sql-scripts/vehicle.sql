CREATE DATABASE  IF NOT EXISTS `vehicle_directory`;
USE `vehicle_directory`;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;

CREATE TABLE `vehicle` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `model_year` int(11) DEFAULT NULL,
  `brand` varchar(45) DEFAULT NULL,
  `model_name` varchar(45) DEFAULT NULL,
  `horsepower` int(11) DEFAULT NULL,
  `avg_mpg` int(11) DEFAULT NULL,
  `msrp` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `vehicle`
--

INSERT INTO `vehicle` VALUES 
	(1,2020,'Toyota','Camry',203,32,24425),
	(2,2020,'Hyundai','Veloster',147,29,18800),
    (3,2019,'Toyota','Prius',121,52,24325),
    (4,2020,'Ford','F-150',250,24,28495),
    (5,2020,'Volkswagen','Tiguan',184,23,24945);

