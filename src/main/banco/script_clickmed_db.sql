-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema clickmed_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema clickmed_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `clickmed_db` DEFAULT CHARACTER SET utf8 ;
USE `clickmed_db` ;

-- -----------------------------------------------------
-- Table `clickmed_db`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clickmed_db`.`usuarios` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(255) NOT NULL,
  `permissao` VARCHAR(255) NULL DEFAULT NULL,
  `senha` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `UK_kfsp0s1tflm1cwlj8idhqsad0` (`email` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 20
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `clickmed_db`.`medicos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clickmed_db`.`medicos` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `crm` VARCHAR(255) NOT NULL,
  `especialidade` LONGTEXT NULL DEFAULT NULL,
  `experienciaProfissional` LONGTEXT NULL DEFAULT NULL,
  `foto` LONGTEXT NULL DEFAULT NULL,
  `horarioAtendimento` VARCHAR(255) NULL DEFAULT NULL,
  `nome` VARCHAR(255) NULL DEFAULT NULL,
  `sobrenome` VARCHAR(255) NULL DEFAULT NULL,
  `telefone1` INT(11) NOT NULL,
  `telefone2` INT(11) NOT NULL,
  `usuario_id` BIGINT(20) NULL DEFAULT NULL,
  `cidade` VARCHAR(255) NULL DEFAULT NULL,
  `estado` VARCHAR(255) NULL DEFAULT NULL,
  `numero` VARCHAR(255) NULL DEFAULT NULL,
  `rua` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKa0dd5a1r4o7vgnqr0aigr69td` (`usuario_id` ASC),
  CONSTRAINT `FKa0dd5a1r4o7vgnqr0aigr69td`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `clickmed_db`.`usuarios` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `clickmed_db`.`clinicas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clickmed_db`.`clinicas` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `cep` VARCHAR(255) NULL DEFAULT NULL,
  `cidade` VARCHAR(255) NULL DEFAULT NULL,
  `cnpj` VARCHAR(30) NULL DEFAULT NULL,
  `email` VARCHAR(255) NULL DEFAULT NULL,
  `estado` VARCHAR(255) NULL DEFAULT NULL,
  `foto` VARCHAR(255) NULL DEFAULT NULL,
  `localAtendimento` VARCHAR(255) NULL DEFAULT NULL,
  `nomeFantasia` VARCHAR(255) NULL DEFAULT NULL,
  `numero` VARCHAR(255) NULL DEFAULT NULL,
  `razaoSocial` VARCHAR(255) NOT NULL,
  `rua` VARCHAR(255) NULL DEFAULT NULL,
  `site` VARCHAR(255) NULL DEFAULT NULL,
  `telefone1` VARCHAR(20) NOT NULL,
  `telefone2` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `UK_61qxyvlu93rcr1pa9auc7l68k` (`razaoSocial` ASC),
  UNIQUE INDEX `UK_4grrphddw3v9abj71t6or7190` (`cnpj` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `clickmed_db`.`clinica_has_medicos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clickmed_db`.`clinica_has_medicos` (
  `clinica_id` BIGINT(20) NOT NULL,
  `medico_id` BIGINT(20) NOT NULL,
  INDEX `FK8l5or1g447khluvlsk4onktpp` (`medico_id` ASC),
  INDEX `FKqkoljy99nlgtdjuc1jxw8fpmd` (`clinica_id` ASC),
  CONSTRAINT `FK8l5or1g447khluvlsk4onktpp`
    FOREIGN KEY (`medico_id`)
    REFERENCES `clickmed_db`.`medicos` (`id`),
  CONSTRAINT `FKqkoljy99nlgtdjuc1jxw8fpmd`
    FOREIGN KEY (`clinica_id`)
    REFERENCES `clickmed_db`.`clinicas` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `clickmed_db`.`convenios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clickmed_db`.`convenios` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `codConvenio` VARCHAR(255) NOT NULL,
  `nome` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `clickmed_db`.`especialidades`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clickmed_db`.`especialidades` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `UK_jb1x3h2l419rof0qqbx95lvl4` (`nome` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `clickmed_db`.`medicos_has_convenios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clickmed_db`.`medicos_has_convenios` (
  `medico_id` BIGINT(20) NOT NULL,
  `convenio_id` BIGINT(20) NOT NULL,
  INDEX `FKam8bjp6432wyyj5fi2ijeds2o` (`convenio_id` ASC),
  INDEX `FKkrek5kyalcrs3hpdevuodovby` (`medico_id` ASC),
  CONSTRAINT `FKam8bjp6432wyyj5fi2ijeds2o`
    FOREIGN KEY (`convenio_id`)
    REFERENCES `clickmed_db`.`convenios` (`id`),
  CONSTRAINT `FKkrek5kyalcrs3hpdevuodovby`
    FOREIGN KEY (`medico_id`)
    REFERENCES `clickmed_db`.`medicos` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `clickmed_db`.`pacientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clickmed_db`.`pacientes` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `cep` VARCHAR(255) NULL DEFAULT NULL,
  `cidade` VARCHAR(255) NULL DEFAULT NULL,
  `cpf` VARCHAR(255) NOT NULL,
  `dataNascimento` DATETIME NULL DEFAULT NULL,
  `estado` VARCHAR(255) NULL DEFAULT NULL,
  `foto` LONGTEXT NULL DEFAULT NULL,
  `nome` VARCHAR(255) NOT NULL,
  `nomeRua` VARCHAR(255) NULL DEFAULT NULL,
  `numero` VARCHAR(255) NULL DEFAULT NULL,
  `sexo` VARCHAR(255) NULL DEFAULT NULL,
  `sobrenome` VARCHAR(255) NOT NULL,
  `telefone1` VARCHAR(255) NULL DEFAULT NULL,
  `telefone2` VARCHAR(255) NULL DEFAULT NULL,
  `usuario_id` BIGINT(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK96vvhaactwhv7l8ymuq6b4r6j` (`usuario_id` ASC),
  CONSTRAINT `FK96vvhaactwhv7l8ymuq6b4r6j`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `clickmed_db`.`usuarios` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 17
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `clickmed_db`.`pesquisas_pacientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clickmed_db`.`pesquisas_pacientes` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `avaliacao` LONGTEXT NULL DEFAULT NULL,
  `comentario` LONGTEXT NULL DEFAULT NULL,
  `descricao` LONGTEXT NULL DEFAULT NULL,
  `pergunta1` DOUBLE NOT NULL,
  `pergunta2` DOUBLE NOT NULL,
  `pergunta3` DOUBLE NOT NULL,
  `pergunta4` DOUBLE NOT NULL,
  `pergunta5` DOUBLE NOT NULL,
  `medico_id` BIGINT(20) NULL DEFAULT NULL,
  `paciente_id` BIGINT(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKb0a8gmmyp6ncb0c2xs147p8r2` (`medico_id` ASC),
  INDEX `FK7t8j2j53sdsy4inc3n46eww36` (`paciente_id` ASC),
  CONSTRAINT `FK7t8j2j53sdsy4inc3n46eww36`
    FOREIGN KEY (`paciente_id`)
    REFERENCES `clickmed_db`.`pacientes` (`id`),
  CONSTRAINT `FKb0a8gmmyp6ncb0c2xs147p8r2`
    FOREIGN KEY (`medico_id`)
    REFERENCES `clickmed_db`.`medicos` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `clickmed_db`.`teste`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clickmed_db`.`teste` (
  `idteste` INT(11) NOT NULL AUTO_INCREMENT,
  `texto` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`idteste`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
