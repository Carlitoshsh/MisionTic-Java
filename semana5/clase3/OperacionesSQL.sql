-- Actualizar informacion
Update editorial
set editorialPais = 'Mexico'
where idEditorial = 1;

-- Borrar el id 45
delete from editorial
where idEditorial = 45;

-- Borrar tabla por completo
-- drop table editorial;

-- Agregar columna
Alter table editorial
add column EditorialCiudad varchar(40);

-- Borrar columna agregada
alter table editorial
drop EditorialCiudad;

-- Cambiar nombre de columna
alter table editorial
rename column EditorialPais to EditorialPaisRegistro;

-- Select con wheree
select * from editorial where idEditorial in (1, 48);

/* OPERACIONES EN CONSULTA 
NOTA: Ver diapositivas en caso de querer ir a fondo con el 
algebra relacional
*/

-- Proyeccion: Consultar la tabla indicando cuales columnas recuperar.
select EditorialNombre, EditorialPais from editorial;

-- Seleccion: Consultar la tabla usando una condicion (WHERE)
select * from editorial
where EditorialPais in ('Italia', 'Argentina');

select * from editorial
where EditorialNombre like '%u%' 
	or EditorialNombre like 'N%';
    
select * from editorial
where EditorialNombre like '%u%' 
	and EditorialNombre not like 'A%';

insert into editorial
values(65, 'Años de letras', 'Argentina');

insert into editorial
values(66, 'Amos lectores', 'Chile');

select * from editorial
where EditorialNombre like '%A_os%';

-- Composicion: Usar la proyeccion y la seleccion al tiempo
Select IdEditorial, EditorialNombre from editorial
where EditorialNombre not like '%u%';

-- ORDENAR por una columna
select * from editorial
order by EditorialNombre;

select * from editorial
order by EditorialNombre desc;

-- Ejemplo de agregacion
select count(IdEditorial) from editorial
where EditorialPais = 'Argentina';

-- Renombrar: renombrar columnas y tablas en la consulta
select
	e.IdEditorial as 'Codigo de la editorial', 
	e.EditorialNombre as 'Nombre'
 from editorial as e;
 
 -- Producto cartesiano:
 -- obtener el producto de las filas de las dos tablas

 
 select count(IdEditorial) from editorial;
 
 
 insert into libro values 
 (1, 'Cien años de soledad', 1999, 'Colombia', 'Nuevo', 1);
 
  insert into libro values 
 (66, 'El gato con botas', 1999, 'Panama', 'Nuevo', 1);
 
 select * from editorial, libro;
 
 -- APlicar where
 select * from editorial as ed, libro as l
 where ed.IdEditorial = l.idEditorial;
 
select ed.EditorialNombre, l.libNombre
  from editorial as ed, libro as l
 where ed.IdEditorial = l.idEditorial;
 