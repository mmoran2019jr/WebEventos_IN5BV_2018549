-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema dbeventos2018549
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema dbeventos2018549
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dbeventos2018549` DEFAULT CHARACTER SET utf8 ;
USE `dbeventos2018549` ;

-- -----------------------------------------------------
-- Table `dbeventos2018549`.`area`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos2018549`.`area` (
  `idarea` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idarea`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos2018549`.`lugarevento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos2018549`.`lugarevento` (
  `idlugarevento` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  `Area_idArea` INT NOT NULL,
  PRIMARY KEY (`idlugarevento`),
  INDEX `fk_lugarevento_Area1_idx` (`Area_idArea` ASC) VISIBLE,
  CONSTRAINT `fk_lugarevento_Area1`
    FOREIGN KEY (`Area_idArea`)
    REFERENCES `dbeventos2018549`.`area` (`idarea`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos2018549`.`evento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos2018549`.`evento` (
  `idevento` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NULL,
  PRIMARY KEY (`idevento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos2018549`.`cotizacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos2018549`.`cotizacion` (
  `idcotizacion` INT NOT NULL AUTO_INCREMENT,
  `nombrecotizacion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idcotizacion`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos2018549`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos2018549`.`cliente` (
  `idcliente` INT NOT NULL AUTO_INCREMENT,
  `nombres` VARCHAR(100) NOT NULL,
  `apellidos` VARCHAR(100) NOT NULL,
  `telefono` VARCHAR(10) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `dpi` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idcliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos2018549`.`reservacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos2018549`.`reservacion` (
  `idreservacion` INT NOT NULL AUTO_INCREMENT,
  `horainicio` DATETIME NOT NULL,
  `horafin` DATETIME NOT NULL,
  `descripcion` VARCHAR(100) NOT NULL,
  `lugarEvento_idlugarEvento` INT NOT NULL,
  `area_idarea` INT NOT NULL,
  `evento_idevento` INT NOT NULL,
  `cotizacion_idcotizacion` INT NOT NULL,
  `cliente_idcliente` INT NOT NULL,
  PRIMARY KEY (`idreservacion`),
  INDEX `fk_reservacion_lugarEvento1_idx` (`lugarEvento_idlugarEvento` ASC) VISIBLE,
  INDEX `fk_reservacion_area1_idx` (`area_idarea` ASC) VISIBLE,
  INDEX `fk_reservacion_evento1_idx` (`evento_idevento` ASC) VISIBLE,
  INDEX `fk_reservacion_cotizacion1_idx` (`cotizacion_idcotizacion` ASC) VISIBLE,
  INDEX `fk_reservacion_cliente1_idx` (`cliente_idcliente` ASC) VISIBLE,
  CONSTRAINT `fk_reservacion_lugarEvento1`
    FOREIGN KEY (`lugarEvento_idlugarEvento`)
    REFERENCES `dbeventos2018549`.`lugarevento` (`idlugarevento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_reservacion_area1`
    FOREIGN KEY (`area_idarea`)
    REFERENCES `dbeventos2018549`.`area` (`idarea`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_reservacion_evento1`
    FOREIGN KEY (`evento_idevento`)
    REFERENCES `dbeventos2018549`.`evento` (`idevento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_reservacion_cotizacion1`
    FOREIGN KEY (`cotizacion_idcotizacion`)
    REFERENCES `dbeventos2018549`.`cotizacion` (`idcotizacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_reservacion_cliente1`
    FOREIGN KEY (`cliente_idcliente`)
    REFERENCES `dbeventos2018549`.`cliente` (`idcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos2018549`.`tipoproducto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos2018549`.`tipoproducto` (
  `idtipoproducto` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idtipoproducto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos2018549`.`productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos2018549`.`productos` (
  `idproductos` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NULL,
  `precioVenta` DOUBLE NULL,
  `tipoproducto_idtipoproducto` INT NOT NULL,
  PRIMARY KEY (`idproductos`),
  INDEX `fk_productos_tipoproducto1_idx` (`tipoproducto_idtipoproducto` ASC) VISIBLE,
  CONSTRAINT `fk_productos_tipoproducto1`
    FOREIGN KEY (`tipoproducto_idtipoproducto`)
    REFERENCES `dbeventos2018549`.`tipoproducto` (`idtipoproducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos2018549`.`facturacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos2018549`.`facturacion` (
  `idfacturacion` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  `nombrefactura` DATETIME NOT NULL,
  `total` DOUBLE NOT NULL,
  `productos_idproductos` INT NOT NULL,
  `cotizacion_idcotizacion` INT NOT NULL,
  `idcliente` INT NOT NULL,
  PRIMARY KEY (`idfacturacion`),
  INDEX `fk_facturacion_cotizacion1_idx` (`cotizacion_idcotizacion` ASC) VISIBLE,
  INDEX `fk_facturacion_idcliente_idx` (`idcliente` ASC) VISIBLE,
  CONSTRAINT `fk_facturacion_cotizacion1`
    FOREIGN KEY (`cotizacion_idcotizacion`)
    REFERENCES `dbeventos2018549`.`cotizacion` (`idcotizacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_facturacion_idcliente`
    FOREIGN KEY (`idcliente`)
    REFERENCES `dbeventos2018549`.`cliente` (`idcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos2018549`.`detallefacturacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos2018549`.`detallefacturacion` (
  `iddetallefacturacion` INT NOT NULL AUTO_INCREMENT,
  `productos_idproductos` INT NOT NULL,
  `cantidad` VARCHAR(45) NOT NULL,
  `precioventa` DOUBLE NOT NULL,
  `facturacion_idfacturacion` INT NOT NULL,
  PRIMARY KEY (`iddetallefacturacion`),
  INDEX `fk_detallefacturacion_productos1_idx` (`productos_idproductos` ASC) VISIBLE,
  INDEX `fk_detallefacturacion_facturacion1_idx` (`facturacion_idfacturacion` ASC) VISIBLE,
  CONSTRAINT `fk_detallefacturacion_productos1`
    FOREIGN KEY (`productos_idproductos`)
    REFERENCES `dbeventos2018549`.`productos` (`idproductos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_detallefacturacion_facturacion1`
    FOREIGN KEY (`facturacion_idfacturacion`)
    REFERENCES `dbeventos2018549`.`facturacion` (`idfacturacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos2018549`.`detallecotizacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos2018549`.`detallecotizacion` (
  `iddetallecotizacion` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  `cantidad` VARCHAR(45) NOT NULL,
  `precioventa` VARCHAR(45) NOT NULL,
  `productos_idproductos` INT NOT NULL,
  `cotizacion_idcotizacion` INT NOT NULL,
  PRIMARY KEY (`iddetallecotizacion`),
  INDEX `fk_detallecotizacion_productos1_idx` (`productos_idproductos` ASC) VISIBLE,
  INDEX `fk_detallecotizacion_cotizacion1_idx` (`cotizacion_idcotizacion` ASC) VISIBLE,
  CONSTRAINT `fk_detallecotizacion_productos1`
    FOREIGN KEY (`productos_idproductos`)
    REFERENCES `dbeventos2018549`.`productos` (`idproductos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_detallecotizacion_cotizacion1`
    FOREIGN KEY (`cotizacion_idcotizacion`)
    REFERENCES `dbeventos2018549`.`cotizacion` (`idcotizacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
