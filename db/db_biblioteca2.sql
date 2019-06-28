CREATE DATABASE  IF NOT EXISTS `db_biblioteca` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `db_biblioteca`;
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
INSERT INTO `autor` VALUES (10001,'Stephen King'),(10002,'Yukio Mishima'),(10003,'DH Lawrence'),(10004,'Haruki Murakami'),(10005,'Edgar Allan Poe'),(10006,'Osamu Dazai'),(10007,'JRR Tolkien'),(10008,'Jane Austen'),(10009,'Gabriel Márquez'),(10010,'William Shakespeare');
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
INSERT INTO `cliente` VALUES (4800872,'Alcides Vera'),(4895461,'Matias Perez'),(4998124,'Jorge Jorge');
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
INSERT INTO `editorial` VALUES (30001,'Alba','Direccion1',123456789),(30002,'Alianza','Direccion2',987654321),(30003,'Caja Negra','Direccion3',147258369),(30004,'Debolsillo','Direccion4',544662189),(30005,'Library of America','Direccion5',114121946),(30006,'Nevsky','Direccion6',458912548),(30007,'Penguin Books','Direccion7',547861234),(30008,'Planeta','Direccion8',648941354),(30009,'Satori','Direccion9',648964147),(30010,'Trotta','Direccion10',128695413);
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
INSERT INTO `genero` VALUES (20001,'Aventura'),(20002,'Ciencia Ficción'),(20003,'Cuentos'),(20004,'Gótica'),(20005,'Policíaca'),(20006,'Paranormal'),(20007,'Fantástica'),(20008,'Distópica'),(20009,'Épica'),(20010,'Dramática');
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
INSERT INTO `libros` VALUES ('isbn111','100 Años de Soledad','Gabriel Márquez','Dramática','Alianza','1998-01-05','20'),('isbn222','Señor de los Anillos','JRR Tolkien','Fantástica','Nevsky','1987-05-16','10'),('isbn333','Indigno de Ser Humano','Osamu Dazai','Dramática','Alianza','1889-01-01','15');
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamos`
--

LOCK TABLES `prestamos` WRITE;
/*!40000 ALTER TABLE `prestamos` DISABLE KEYS */;
INSERT INTO `prestamos` VALUES (10,'Jorge Jorge','Indigno de Ser Humano',1,'Señor de los Anillos',2,'100 Años de Soledad',3,'2000-11-12','2000-11-16');
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
INSERT INTO `usuario` VALUES (111234,'master69','123456789');
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

-- Dump completed on 2019-06-21 16:16:42
