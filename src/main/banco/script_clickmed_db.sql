-- MySQL dump 10.13  Distrib 5.7.26, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: clickmed_db
-- ------------------------------------------------------
-- Server version	5.7.26-0ubuntu0.18.04.1

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
-- Table structure for table `clinica_has_medicos`
--

DROP TABLE IF EXISTS `clinica_has_medicos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clinica_has_medicos` (
  `clinica_id` bigint(20) NOT NULL,
  `medico_id` bigint(20) NOT NULL,
  KEY `FK8l5or1g447khluvlsk4onktpp` (`medico_id`),
  KEY `FKqkoljy99nlgtdjuc1jxw8fpmd` (`clinica_id`),
  CONSTRAINT `FK8l5or1g447khluvlsk4onktpp` FOREIGN KEY (`medico_id`) REFERENCES `medicos` (`id`),
  CONSTRAINT `FKqkoljy99nlgtdjuc1jxw8fpmd` FOREIGN KEY (`clinica_id`) REFERENCES `clinicas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `clinicas`
--

DROP TABLE IF EXISTS `clinicas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clinicas` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cep` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `cnpj` varchar(30) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `foto` longtext,
  `nomeFantasia` varchar(255) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `razaoSocial` varchar(255) NOT NULL,
  `rua` varchar(255) DEFAULT NULL,
  `site` varchar(255) DEFAULT NULL,
  `telefone1` varchar(20) NOT NULL,
  `telefone2` varchar(20) NOT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_61qxyvlu93rcr1pa9auc7l68k` (`razaoSocial`),
  UNIQUE KEY `UK_4grrphddw3v9abj71t6or7190` (`cnpj`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `convenios`
--

DROP TABLE IF EXISTS `convenios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `convenios` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `codConvenio` varchar(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `especialidades`
--

DROP TABLE IF EXISTS `especialidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `especialidades` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `outros` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_jb1x3h2l419rof0qqbx95lvl4` (`nome`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `medicos`
--

DROP TABLE IF EXISTS `medicos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `crm` varchar(255) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `sobrenome` varchar(255) DEFAULT NULL,
  `sexo` varchar(255) DEFAULT NULL,
  `experienciaProfissional` longtext,
  `formacaoAcademica` longtext,
  `planosConvenio` longtext,
  `foto` longtext,
  `horaInicioAtendimento` varchar(255) DEFAULT NULL,
  `horaFimAtendimento` varchar(255) DEFAULT NULL,
  `diasAtendimento` varchar(255) DEFAULT NULL,
  `telefone1` varchar(255) NOT NULL,
  `telefone2` varchar(255) NOT NULL,
  `usuario_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKa0dd5a1r4o7vgnqr0aigr69td` (`usuario_id`),
  CONSTRAINT `FKa0dd5a1r4o7vgnqr0aigr69td` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `medicos_has_clinicas`
--

DROP TABLE IF EXISTS `medicos_has_clinicas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicos_has_clinicas` (
  `medico_id` bigint(20) NOT NULL,
  `clinica_id` bigint(20) NOT NULL,
  KEY `FKaovkr2mw6h46w1shwe8vijb87` (`clinica_id`),
  KEY `FKmf5qds8uoejk37pcru9qrkn` (`medico_id`),
  CONSTRAINT `FKaovkr2mw6h46w1shwe8vijb87` FOREIGN KEY (`clinica_id`) REFERENCES `clinicas` (`id`),
  CONSTRAINT `FKmf5qds8uoejk37pcru9qrkn` FOREIGN KEY (`medico_id`) REFERENCES `medicos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `medicos_has_convenios`
--

DROP TABLE IF EXISTS `medicos_has_convenios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicos_has_convenios` (
  `medico_id` bigint(20) NOT NULL,
  `convenio_id` bigint(20) NOT NULL,
  KEY `FKam8bjp6432wyyj5fi2ijeds2o` (`convenio_id`),
  KEY `FKkrek5kyalcrs3hpdevuodovby` (`medico_id`),
  CONSTRAINT `FKam8bjp6432wyyj5fi2ijeds2o` FOREIGN KEY (`convenio_id`) REFERENCES `convenios` (`id`),
  CONSTRAINT `FKkrek5kyalcrs3hpdevuodovby` FOREIGN KEY (`medico_id`) REFERENCES `medicos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `medicos_has_especialidades`
--

DROP TABLE IF EXISTS `medicos_has_especialidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicos_has_especialidades` (
  `medico_id` bigint(20) NOT NULL,
  `especialidades_id` bigint(20) NOT NULL,
  KEY `FK1lkarunm9suprci3htle7d0eo` (`especialidades_id`),
  KEY `FKt13vdaemlm2op6q0p6q49sga9` (`medico_id`),
  CONSTRAINT `FK1lkarunm9suprci3htle7d0eo` FOREIGN KEY (`especialidades_id`) REFERENCES `especialidades` (`id`),
  CONSTRAINT `FKt13vdaemlm2op6q0p6q49sga9` FOREIGN KEY (`medico_id`) REFERENCES `medicos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `pacientes`
--

DROP TABLE IF EXISTS `pacientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pacientes` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cep` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `cpf` varchar(255) NOT NULL,
  `dataNascimento` datetime DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `foto` longtext,
  `nome` varchar(255) NOT NULL,
  `nomeRua` varchar(255) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `sexo` varchar(255) DEFAULT NULL,
  `sobrenome` varchar(255) NOT NULL,
  `telefone1` varchar(255) DEFAULT NULL,
  `telefone2` varchar(255) DEFAULT NULL,
  `usuario_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK96vvhaactwhv7l8ymuq6b4r6j` (`usuario_id`),
  CONSTRAINT `FK96vvhaactwhv7l8ymuq6b4r6j` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `pesquisas_pacientes`
--

DROP TABLE IF EXISTS `pesquisas_pacientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pesquisas_pacientes` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `avaliacao` longtext,
  `comentario` longtext,
  `descricao` longtext,
  `pergunta1` double NOT NULL,
  `pergunta2` double NOT NULL,
  `pergunta3` double NOT NULL,
  `pergunta4` double NOT NULL,
  `pergunta5` double NOT NULL,
  `medico_id` bigint(20) DEFAULT NULL,
  `paciente_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKb0a8gmmyp6ncb0c2xs147p8r2` (`medico_id`),
  KEY `FK7t8j2j53sdsy4inc3n46eww36` (`paciente_id`),
  CONSTRAINT `FK7t8j2j53sdsy4inc3n46eww36` FOREIGN KEY (`paciente_id`) REFERENCES `pacientes` (`id`),
  CONSTRAINT `FKb0a8gmmyp6ncb0c2xs147p8r2` FOREIGN KEY (`medico_id`) REFERENCES `medicos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `teste`
--

DROP TABLE IF EXISTS `teste`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teste` (
  `idteste` int(11) NOT NULL AUTO_INCREMENT,
  `texto` varchar(255) NOT NULL,
  PRIMARY KEY (`idteste`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `permissao` varchar(255) DEFAULT NULL,
  `senha` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_kfsp0s1tflm1cwlj8idhqsad0` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping events for database 'clickmed_db'
--

--
-- Dumping routines for database 'clickmed_db'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-28 10:12:52
