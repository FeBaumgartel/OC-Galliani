-- MySQL Script generated by MySQL Workbench
-- Wed Jan 23 14:39:06 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Pessoa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Pessoa` (
  `id_pessoa` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  `cpf` VARCHAR(14) NOT NULL,
  `rg` VARCHAR(13) NOT NULL,
  `nascimento` DATE NOT NULL,
  `telefone` VARCHAR(13) NOT NULL,
  `celular` VARCHAR(14) NULL,
  `email` VARCHAR(60) NULL,
  PRIMARY KEY (`id_pessoa`),
  UNIQUE INDEX `id_pessoa_UNIQUE` (`id_pessoa` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Funcionario` (
  `id_funcionario` INT NOT NULL AUTO_INCREMENT,
  `data_contratacao` DATE NOT NULL,
  `salario` DECIMAL(6,2) NOT NULL,
  `cargo` VARCHAR(45) NOT NULL,
  `usuario` VARCHAR(30) NOT NULL,
  `senha` VARCHAR(30) NOT NULL,
  `Pessoa_id_pessoa` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_funcionario`),
  INDEX `fk_Funcionario_Pessoa_idx` (`Pessoa_id_pessoa` ASC) VISIBLE,
  UNIQUE INDEX `id_funcionario_UNIQUE` (`id_funcionario` ASC) VISIBLE,
  CONSTRAINT `fk_Funcionario_Pessoa`
    FOREIGN KEY (`Pessoa_id_pessoa`)
    REFERENCES `mydb`.`Pessoa` (`id_pessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cliente` (
  `id_cliente` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `Pessoa_id_pessoa` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_cliente`),
  INDEX `fk_Cliente_Pessoa1_idx` (`Pessoa_id_pessoa` ASC) VISIBLE,
  UNIQUE INDEX `id_cliente_UNIQUE` (`id_cliente` ASC) VISIBLE,
  CONSTRAINT `fk_Cliente_Pessoa1`
    FOREIGN KEY (`Pessoa_id_pessoa`)
    REFERENCES `mydb`.`Pessoa` (`id_pessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Fornecedor` (
  `id_Fornecedor` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `nome_fantasia` VARCHAR(100) NOT NULL,
  `cnpj` VARCHAR(45) NOT NULL,
  `telefone` VARCHAR(13) NULL,
  `email` VARCHAR(60) NULL,
  `inscricao_estadual` VARCHAR(45) NOT NULL,
  `ramo_negocio` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_Fornecedor`),
  UNIQUE INDEX `id_Fornecedor_UNIQUE` (`id_Fornecedor` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Marca`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Marca` (
  `id_Marca` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(50) NOT NULL,
  `Endereco_eletronico` VARCHAR(100) NULL,
  PRIMARY KEY (`id_Marca`),
  UNIQUE INDEX `id_Marca_UNIQUE` (`id_Marca` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Unidade_de_Medida`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Unidade_de_Medida` (
  `id_Unidade_de_Medida` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_Unidade_de_Medida`),
  UNIQUE INDEX `id_Unidade_de_Medida_UNIQUE` (`id_Unidade_de_Medida` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Produto` (
  `id_Produto` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  `codigo_de_barras` VARCHAR(45) NOT NULL,
  `valor_unitario` DECIMAL(6,2) NOT NULL,
  `categoria` VARCHAR(45) NOT NULL,
  `id_Marca` INT UNSIGNED NOT NULL,
  `id_Fornecedor` INT UNSIGNED NOT NULL,
  `id_Unidade_de_Medida` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_Produto`),
  UNIQUE INDEX `id_Produto_UNIQUE` (`id_Produto` ASC) VISIBLE,
  INDEX `fk_Produto_Marca1_idx` (`id_Marca` ASC) VISIBLE,
  INDEX `fk_Produto_Fornecedor1_idx` (`id_Fornecedor` ASC) VISIBLE,
  INDEX `fk_Produto_Unidade_de_Medida1_idx` (`id_Unidade_de_Medida` ASC) VISIBLE,
  CONSTRAINT `fk_Produto_Marca1`
    FOREIGN KEY (`id_Marca`)
    REFERENCES `mydb`.`Marca` (`id_Marca`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Produto_Fornecedor1`
    FOREIGN KEY (`id_Fornecedor`)
    REFERENCES `mydb`.`Fornecedor` (`id_Fornecedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Produto_Unidade_de_Medida1`
    FOREIGN KEY (`id_Unidade_de_Medida`)
    REFERENCES `mydb`.`Unidade_de_Medida` (`id_Unidade_de_Medida`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;