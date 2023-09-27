drop database if exists DAWIICL1QAErick;
create database DAWIICL1QAErick;
use DAWIICL1QAErick;

create table Publicacion(
pub_id int primary key auto_increment,
pub_nom varchar(30) not null,
pub_con varchar(40) not null,
pub_fch date not null
);
create table Etiqueta(
eti_id int primary key auto_increment,
eti_nom varchar(30) not null,
eti_fch date not null,
pub_id int not null,
foreign key(pub_id) references Publicacion(pub_id)
);
create table Comentario(
com_id int primary key auto_increment,
com_con varchar(40) not null,
com_fch date not null,
pub_id int not null,
foreign key(pub_id) references Publicacion(pub_id)
);

select * from Publicacion;
select * from Etiqueta;
select * from Comentario;