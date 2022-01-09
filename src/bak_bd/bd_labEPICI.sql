CREATE TABLE public.computadora
(
  serie 	character(8) NOT NULL,
  marca 	character varying(30) NOT NULL,
  color 	character varying(30) NOT NULL,
  año 		integer NOT NULL,
  estado 	character varying(15) NOT NULL,
  num_lab 	character(5),
  CONSTRAINT 	pk_computadora PRIMARY KEY (serie)
)
WITH (
  OIDS=FALSE
);

ALTER TABLE public.computadora
  OWNER TO postgres;


insert into computadora(serie,marca, color,año,estado,num_lab)
values ('45345-13','HP','NEGRO',2016,'OPERATIVO','LAB01');
insert into computadora(serie,marca, color,año,estado,num_lab)
values ('55645-13','LENOVO','BLANCO',2015,'OPERATIVO','LAB01');
insert into computadora(serie,marca, color,año,estado,num_lab)
values ('56678-13','COMPAQ','PLOMO',2017,'OPERATIVO','LAB02');



CREATE TABLE public.usuario
(
  usuario integer NOT NULL,
  clave character(32) NOT NULL,
  CONSTRAINT pk_usuario PRIMARY KEY (usuario)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.usuario
  OWNER TO postgres;





select * from computadora

insert into usuario
(
codigo_usuario,
dni_usuario,
clave,
estado
)
values
(1,'11223344',MD5('123456'),'A');


select * from personal

select * from usuario
