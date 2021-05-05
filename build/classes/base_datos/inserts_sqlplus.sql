insert into usuarios ( nombre, apellido1,apellido2,f_nacimiento,num_telefono,sexo,mail,nick,contrasena)
values ('alex','gallego','elena',TO_DATE('1996-07-05','YYYY-MM-DD'),'662474055','h','froggygallego@gmail.com','froggie','123123as');



insert into usuarios ( nombre, apellido1,apellido2,f_nacimiento,num_telefono,sexo,mail,nick,contrasena)
values ('Victor','Mari','Rodriguez',TO_DATE('1996-12-30','YYYY-MM-DD'),'662404755','h','victorinopanyvino@gmail.com','labosis','123123as');

insert into usuarios ( nombre, apellido1,apellido2,f_nacimiento,num_telefono,sexo,mail,nick,contrasena)
values ('Alberto','Ramirez','Gallegos',TO_DATE('1996-8-15','YYYY-MM-DD'),'662404754','m','albertoRamirezjamau@gmail.com','xteru','158964sad');


create table fotos_vivienda(
id_vivienda number not null,
foto_url varchar2(300) not null,
primary key(id_vivienda,foto_url)
foreign key(id_vivienda)references viviendas(id)
);



insert into viviendas(calle,descripcion,)
values('Calle arcoiris','Bonita casa de perro, diseñada como la de paris Hilton, por solo tres millones euros')

SQL> insert into viviendas(calle,descripcion)
  2  values('Calle arcoiris','Bonita casa de perro, diseñada como la de paris Hilton, por solo tres millones euros');

SQL> insert into fotos_vivienda
  2  values(1,'casa_perro1.jpg');

1 fila creada.

SQL> insert into fotos_vivienda
  2  values(1,'casa_perro2.jpg');

1 fila creada.