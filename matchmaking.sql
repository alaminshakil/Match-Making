-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema matchmaking
--

CREATE DATABASE IF NOT EXISTS matchmaking;
USE matchmaking;

--
-- Definition of table `profile`
--

DROP TABLE IF EXISTS `profile`;
CREATE TABLE `profile` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `fullname` varchar(45) NOT NULL,
  `age` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `profession` varchar(45) NOT NULL,
  `father_name` varchar(45) NOT NULL,
  `father_profession` varchar(45) NOT NULL,
  `mother_name` varchar(45) NOT NULL,
  `mother_profession` varchar(145) NOT NULL,
  `education` varchar(45) NOT NULL,
  `height` double NOT NULL,
  `address` varchar(45) NOT NULL,
  `about` varchar(200) NOT NULL,
  PRIMARY KEY  (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profile`
--

/*!40000 ALTER TABLE `profile` DISABLE KEYS */;
INSERT INTO `profile` (`username`,`password`,`fullname`,`age`,`city`,`gender`,`profession`,`father_name`,`father_profession`,`mother_name`,`mother_profession`,`education`,`height`,`address`,`about`) VALUES 
 ('alaminshakil','123','Al Amin Shakil','28','Comilla','male','IT Expert','Abbas Ali','Teacher','Mohsena Begum','Housewife','MBA',5.3,'Dhaka','Looking for a soulmate'),
 ('lamhaislam','123','Lamha Islam','28','Comilla','female','Banker','Abdus Salam','Teacher','Lamia Islam','Lamia Islam','Kazi Nazrul College',5.3,'2/A, Polashpur, Donia, Dhaka','I\'m searching for a good boy'),
 ('lata','123','Lutfun Nahar Lata','26','Noakhali','female','Teacher','Abdul Latif','Private Service','Shefali Begum','Job','BBA',5.1,'Mirpur','Looking for My dear Al Amin');
/*!40000 ALTER TABLE `profile` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY  (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`username`,`password`) VALUES 
 ('alaminshakil','123'),
 ('lamha','123'),
 ('lata','123'),
 ('saiful','123');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
