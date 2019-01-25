CREATE SCHEMA IF NOT EXISTS `distribuidorasenai` DEFAULT CHARACTER SET utf8 ;
USE `distribuidorasenai` ;

CREATE TABLE IF NOT EXISTS `distribuidorasenai`.`Pessoa` (
  `id_pessoa` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  `cpf` VARCHAR(14) NOT NULL,
  `rg` VARCHAR(13) NOT NULL,
  `nascimento` DATE NOT NULL,
  `telefone` VARCHAR(13) NOT NULL,
  `celular` VARCHAR(14) NULL,
  `email` VARCHAR(60) NULL,

  `foto` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id_pessoa`),
  UNIQUE INDEX `id_pessoa_UNIQUE` (`id_pessoa` ASC));

CREATE TABLE IF NOT EXISTS `distribuidorasenai`.`Funcionario` (
  `id_funcionario` INT NOT NULL AUTO_INCREMENT,
  `data_contratacao` DATE NOT NULL,
  `salario` DECIMAL(6,2) NOT NULL,
  `cargo` VARCHAR(45) NOT NULL,
  `usuario` VARCHAR(30) NOT NULL,
  `senha` VARCHAR(30) NOT NULL,
  `Pessoa_id_pessoa` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_funcionario`),
  INDEX `fk_Funcionario_Pessoa_idx` (`Pessoa_id_pessoa` ASC),
  UNIQUE INDEX `id_funcionario_UNIQUE` (`id_funcionario` ASC),
  CONSTRAINT `fk_Funcionario_Pessoa`
    FOREIGN KEY (`Pessoa_id_pessoa`)
    REFERENCES `distribuidorasenai`.`Pessoa` (`id_pessoa`));

CREATE TABLE IF NOT EXISTS `distribuidorasenai`.`Cliente` (
  `id_cliente` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `Pessoa_id_pessoa` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_cliente`),
  INDEX `fk_Cliente_Pessoa1_idx` (`Pessoa_id_pessoa` ASC),
  UNIQUE INDEX `id_cliente_UNIQUE` (`id_cliente` ASC),
  CONSTRAINT `fk_Cliente_Pessoa1`
    FOREIGN KEY (`Pessoa_id_pessoa`)
    REFERENCES `distribuidorasenai`.`Pessoa` (`id_pessoa`));

CREATE TABLE IF NOT EXISTS `distribuidorasenai`.`Fornecedor` (
  `id_Fornecedor` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `nome_fantasia` VARCHAR(100) NOT NULL,
  `cnpj` VARCHAR(45) NOT NULL,
  `telefone` VARCHAR(13) NULL,
  `email` VARCHAR(60) NULL,
  `inscricao_estadual` VARCHAR(45) NOT NULL,
  `ramo_negocio` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_Fornecedor`),
  UNIQUE INDEX `id_Fornecedor_UNIQUE` (`id_Fornecedor` ASC));

CREATE TABLE IF NOT EXISTS `distribuidorasenai`.`Marca` (
  `id_Marca` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(50) NOT NULL,
  `Endereco_eletronico` VARCHAR(100) NULL,
  PRIMARY KEY (`id_Marca`),
  UNIQUE INDEX `id_Marca_UNIQUE` (`id_Marca` ASC));

CREATE TABLE IF NOT EXISTS `distribuidorasenai`.`Unidade_de_Medida` (
  `id_Unidade_de_Medida` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_Unidade_de_Medida`),
  UNIQUE INDEX `id_Unidade_de_Medida_UNIQUE` (`id_Unidade_de_Medida` ASC));

CREATE TABLE IF NOT EXISTS `distribuidorasenai`.`Produto` (
  `id_Produto` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  `codigo_de_barras` VARCHAR(45) NOT NULL,
  `valor_unitario` DECIMAL(6,2) NOT NULL,
  `categoria` VARCHAR(45) NOT NULL,
  `foto` VARCHAR(200) NOT NULL,
  `id_Marca` INT UNSIGNED NOT NULL,
  `id_Fornecedor` INT UNSIGNED NOT NULL,
  `id_Unidade_de_Medida` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_Produto`),
  UNIQUE INDEX `id_Produto_UNIQUE` (`id_Produto` ASC),
  INDEX `fk_Produto_Marca1_idx` (`id_Marca` ASC),
  INDEX `fk_Produto_Fornecedor1_idx` (`id_Fornecedor` ASC),
  INDEX `fk_Produto_Unidade_de_Medida1_idx` (`id_Unidade_de_Medida` ASC),
  CONSTRAINT `fk_Produto_Marca1`
    FOREIGN KEY (`id_Marca`)
    REFERENCES `distribuidorasenai`.`Marca` (`id_Marca`),
  CONSTRAINT `fk_Produto_Fornecedor1`
    FOREIGN KEY (`id_Fornecedor`)
    REFERENCES `distribuidorasenai`.`Fornecedor` (`id_Fornecedor`),
  CONSTRAINT `fk_Produto_Unidade_de_Medida1`
    FOREIGN KEY (`id_Unidade_de_Medida`)
    REFERENCES `distribuidorasenai`.`Unidade_de_Medida` (`id_Unidade_de_Medida`));

	INSERT INTO pessoa(nome, cpf, rg, nascimento, telefone, celular, email, foto) VALUES ('adm','123','123','1212/12/12','123','123','adm','asdf123');
    INSERT INTO funcionario(data_contratacao, salario, cargo, usuario, senha, Pessoa_id_pessoa) VALUES ('1212/12/12',12.12,'Gerente','adm','adm',1);
	
	INSERT INTO unidade_de_medida(nome) VALUES ('kg');
	INSERT INTO unidade_de_medida(nome) VALUES ('g');
	INSERT INTO unidade_de_medida(nome) VALUES ('t');
	INSERT INTO unidade_de_medida(nome) VALUES ('l');
	INSERT INTO unidade_de_medida(nome) VALUES ('ml');
