-- Crear base de datos
create database libreriaGrupo41;

-- Usar base de datos para poderla operar
use libreriaGrupo41;

create table Libro (
	libId int(13) not null primary key,
    libNombre varchar(50) not null,
    libPub int(4)
);

/* Autogenerado
Por SQL

CREATE TABLE `libreriagrupo41`.`libro` (
  `libId` INT NOT NULL,
  `libNombre` VARCHAR(50) NOT NULL,
  `libPub` INT NULL,
  PRIMARY KEY (`libId`));

*/

