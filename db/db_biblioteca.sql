-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_biblioteca
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `autor`
--

DROP TABLE IF EXISTS `autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `autor` (
  `idAutor` int(11) NOT NULL,
  `nombreAutor` varchar(20) NOT NULL,
  PRIMARY KEY (`idAutor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autor`
--

LOCK TABLES `autor` WRITE;
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
INSERT INTO `autor` VALUES (10001,'Autor1'),(10002,'Autor2'),(10003,'Autor3'),(10004,'Autor4');
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cliente` (
  `ciCliente` int(11) NOT NULL,
  `nombreCliente` varchar(20) NOT NULL,
  PRIMARY KEY (`ciCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (216210,'ohjnla'),(216549,'daasfff');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `editorial`
--

DROP TABLE IF EXISTS `editorial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `editorial` (
  `idEditorial` int(11) NOT NULL,
  `nombreEditorial` varchar(30) NOT NULL,
  `direccEditorial` longtext NOT NULL,
  `telefEditorial` int(20) NOT NULL,
  PRIMARY KEY (`idEditorial`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `editorial`
--

LOCK TABLES `editorial` WRITE;
/*!40000 ALTER TABLE `editorial` DISABLE KEYS */;
INSERT INTO `editorial` VALUES (30001,'Editorial1','Direccion1',123456789),(30002,'Editorial2','Direccion2',987654321),(30003,'Editorial3','Direccion3',147258369),(30004,'Editorial5','Direccion5',5446);
/*!40000 ALTER TABLE `editorial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genero`
--

DROP TABLE IF EXISTS `genero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `genero` (
  `idGenero` int(11) NOT NULL,
  `descGenero` varchar(20) NOT NULL,
  PRIMARY KEY (`idGenero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genero`
--

LOCK TABLES `genero` WRITE;
/*!40000 ALTER TABLE `genero` DISABLE KEYS */;
INSERT INTO `genero` VALUES (20001,'Genero1'),(20002,'Genero2'),(20003,'Genero3'),(20004,'Genero4');
/*!40000 ALTER TABLE `genero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libros`
--

DROP TABLE IF EXISTS `libros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `libros` (
  `idLibro` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `tituloLibro` varchar(40) NOT NULL,
  `autor` varchar(20) NOT NULL,
  `genero` varchar(20) NOT NULL,
  `editorial` varchar(30) NOT NULL,
  `anhoPublic` date NOT NULL,
  `stock` varchar(3) NOT NULL,
  PRIMARY KEY (`idLibro`),
  UNIQUE KEY `idLibro_UNIQUE` (`idLibro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libros`
--

LOCK TABLES `libros` WRITE;
/*!40000 ALTER TABLE `libros` DISABLE KEYS */;
INSERT INTO `libros` VALUES ('isbn111','Titulo1','Autor 2','Genero3','Editorial1','2000-12-11','12'),('isbn222','Titulo2','Autor 3','Genero3','Editorial1','1999-11-05','46'),('isbn333','Titulo5','Autor 2','Genero3','Editorial3','1889-01-01','15');
/*!40000 ALTER TABLE `libros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamos`
--

DROP TABLE IF EXISTS `prestamos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `prestamos` (
  `idPrestamo` int(11) NOT NULL AUTO_INCREMENT,
  `cliente` varchar(45) NOT NULL,
  `libroPrest1` varchar(40) DEFAULT NULL,
  `cantidadL1` int(11) DEFAULT NULL,
  `libroPrest2` varchar(40) DEFAULT NULL,
  `cantidadL2` int(11) DEFAULT NULL,
  `libroPrest3` varchar(40) DEFAULT NULL,
  `cantidadL3` int(11) DEFAULT NULL,
  `fechaPrestamo` date NOT NULL,
  `fechaDevolucion` date NOT NULL,
  PRIMARY KEY (`idPrestamo`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamos`
--

LOCK TABLES `prestamos` WRITE;
/*!40000 ALTER TABLE `prestamos` DISABLE KEYS */;
INSERT INTO `prestamos` VALUES (1,'456216','Titulo1',2,'Libro2',4,'Titulo3',1,'2019-06-17','2019-06-19'),(2,'sdgsdgjja','Titulo2',1,'Titulo1',1,'Titulo2',2,'2019-11-12','2019-11-12'),(3,'tunarizpormibola','Titulo2',2,'Titulo2',1,'Titulo2',4,'2019-06-20','2019-06-22'),(6,'fsdfgdsg','Titulo2',54,'Titulo2',1,'Titulo5',1,'1987-12-11','1987-12-12'),(7,'daasfff','Titulo2',1,'Titulo2',1,'Titulo1',1,'1897-11-11','1897-11-11'),(8,'ohjnla','Titulo2',4,'Titulo1',5,'Titulo5',4,'2000-05-05','2000-05-05');
/*!40000 ALTER TABLE `prestamos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL,
  `nombreUsuario` varchar(10) NOT NULL,
  `contrasenha` varchar(12) NOT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (46,'sdgs','dfgd6.'),(216,'sdgsd','ghd6'),(1234,'usuario1','aqo104578'),(1478,'usuari26','ggs104578'),(4662,'sgsa62f','sgsd126'),(5641,'ola','qtal6969');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-20  9:58:59
