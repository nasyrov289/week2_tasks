-- MySQL Script generated by MySQL Workbench
-- Вс 23 июн 2019 13:52:17
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema onlineshopdb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema onlineshopdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `onlineshopdb` DEFAULT CHARACTER SET utf8 ;
USE `onlineshopdb` ;

-- -----------------------------------------------------
-- Table `onlineshopdb`.`Admin`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `onlineshopdb`.`Admin` (
  `userID` INT NOT NULL AUTO_INCREMENT,
  `loginStatus` VARCHAR(32) NOT NULL,
  `adminName` VARCHAR(32) NOT NULL,
  `email` VARCHAR(32) NOT NULL,
  `password` VARCHAR(16) NOT NULL,
  `address` VARCHAR(70) NOT NULL,
  PRIMARY KEY (`userID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `onlineshopdb`.`OrderDetails`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `onlineshopdb`.`OrderDetails` (
  `orderID` INT NOT NULL AUTO_INCREMENT,
  `productID` INT NOT NULL,
  `productName` VARCHAR(32) NOT NULL,
  `unitCost` DECIMAL NOT NULL,
  `quantity` INT NOT NULL,
  `total` DECIMAL NOT NULL,
  PRIMARY KEY (`orderID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `onlineshopdb`.`ShippingInfo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `onlineshopdb`.`ShippingInfo` (
  `shippingID` INT NOT NULL AUTO_INCREMENT,
  `shippingInfo` VARCHAR(32) NOT NULL,
  `shippingCost` DECIMAL NOT NULL,
  `shippingRegion` VARCHAR(32) NOT NULL,
  PRIMARY KEY (`shippingID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `onlineshopdb`.`Order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `onlineshopdb`.`Order` (
  `orderID` INT NOT NULL AUTO_INCREMENT,
  `userID` INT NOT NULL,
  `shippingID` INT NOT NULL,
  `dateCreated` DATE NOT NULL,
  `dateShipped` DATE NOT NULL,
  `customerName` VARCHAR(32) NOT NULL,
  `OrderDetails_orderID` INT NOT NULL,
  `ShippingInfo_shippingID` INT NOT NULL,
  PRIMARY KEY (`orderID`),
  INDEX `fk_Order_OrderDetails1_idx` (`OrderDetails_orderID` ASC),
  INDEX `fk_Order_ShippingInfo1_idx` (`ShippingInfo_shippingID` ASC),
  CONSTRAINT `fk_Order_OrderDetails1`
    FOREIGN KEY (`OrderDetails_orderID`)
    REFERENCES `onlineshopdb`.`OrderDetails` (`orderID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Order_ShippingInfo1`
    FOREIGN KEY (`ShippingInfo_shippingID`)
    REFERENCES `onlineshopdb`.`ShippingInfo` (`shippingID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `onlineshopdb`.`ShoppingCart`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `onlineshopdb`.`ShoppingCart` (
  `cartID` INT NOT NULL AUTO_INCREMENT,
  `productID` INT NOT NULL,
  `quantity` INT NOT NULL,
  `dateAdded` DATE NOT NULL,
  PRIMARY KEY (`cartID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `onlineshopdb`.`Customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `onlineshopdb`.`Customer` (
  `userID` INT NOT NULL AUTO_INCREMENT,
  `loginStatus` VARCHAR(32) NOT NULL,
  `customerName` VARCHAR(32) NOT NULL,
  `email` VARCHAR(32) NOT NULL,
  `password` VARCHAR(16) NOT NULL,
  `address` VARCHAR(70) NOT NULL,
  `accountBalance` DECIMAL NOT NULL,
  `shippingInfo` VARCHAR(32) NOT NULL,
  `Order_orderID` INT NOT NULL,
  `ShoppingCart_cartID` INT NOT NULL,
  PRIMARY KEY (`userID`),
  INDEX `fk_Customer_Order1_idx` (`Order_orderID` ASC),
  INDEX `fk_Customer_ShoppingCart1_idx` (`ShoppingCart_cartID` ASC),
  CONSTRAINT `fk_Customer_Order1`
    FOREIGN KEY (`Order_orderID`)
    REFERENCES `onlineshopdb`.`Order` (`orderID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Customer_ShoppingCart1`
    FOREIGN KEY (`ShoppingCart_cartID`)
    REFERENCES `onlineshopdb`.`ShoppingCart` (`cartID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
