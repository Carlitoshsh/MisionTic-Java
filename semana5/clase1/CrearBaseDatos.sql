-- Crear base de datos
create database libreriaGrupo41;

-- Usar base de datos para poderla operar
use libreriaGrupo41;

/*

Otra forma de usar la primary key, es al final
con la siguiente sintaxis:

primary key(libId)
*/

CREATE TABLE `editorial` (
  `idEditorial` int NOT NULL AUTO_INCREMENT,
  `EditorialNombre` varchar(45) NOT NULL,
  `EditorialPais` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idEditorial`)
);

create table Libro (
	libId int(13) not null primary key,
    libNombre varchar(50) not null,
    libPub int(4),
    libPais varchar(50) default 'Colombia' not null,
    libEstado enum('Nuevo', 'Alquiler', 'Usado') not null,
    idEditorial int not null,
    foreign key(idEditorial) references editorial(idEditorial)
);

show tables;

SHOW COLUMNS FROM editorial;

create table autor(
	idAutor int not null primary key,
    nombre varchar(50) not null,
    nacionalidad varchar(50)
);

drop table autor;

-- Insertar valores
INSERT INTO editorial
values (
	1,
	'Norma',
    'España'
);

INSERT INTO editorial
(EditorialNombre,
EditorialPais)
values (
	'Alfaguara',
    'Argentina'
);

insert into editorial(editorialNombre,editorialPais)
values (	
	'Planeta',
    'Italia'
);

insert into editorial
values(
	45,
    'GyG editores',
    'Venezuela'
    );
    
select * from editorial;

insert into editorial
(editorialNombre, editorialPais)
values (
	'Larousse', 'Estados Unidos'
);

select * from editorial;

insert into editorial
(editorialNombre, editorialPais)
values (
	'Penguin', 'Reino Unido'
);

-- Actualizar informacion
Update editorial
set editorialPais = 'Mexico'
where idEditorial = 3;

select * from editorial;



