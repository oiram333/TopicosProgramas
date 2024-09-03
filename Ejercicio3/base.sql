create table carrera(cveCarrera varchar(2) not null, nombre varchar(15), 
                    cveOficial varchar(10) not null, 
                    constraint carreraPK primary key (cveCarrera));

create table materia(cveMat varchar(4) not null, nombre varchar(25), HorTeo int, HorPrac int,
                     Creditos int,
                     constraint materiaPK primary key (cveMat),
                     constraint materiaCK1 check(HorTeo between 0 and 10),
                     constraint materiaCK2 check(HorPrac between 0 and 10),
                     constraint materiaCK3 check(Creditos between 0 and 10));

create table oportunidad(noOpor int not null,
                         descripcion varchar(20),
                         constraint oportunidadPK primary key (noOpor),
                         constraint oportunidadCK1 check (noOpor between 1 and 5));

create table formadaPor(cveCarrera varchar(2) not null,
                        cveMat varchar(4) not null,
						constraint formadaPorPK primary key (cveCarrera,cveMat),
                        Constraint formadaPorFK1 foreign key (cveCarrera) references carrera(cveCarrera),
                        Constraint formadaPorFK2 foreign key (cveMat) references materia(cveMat));

create table alumno(noCont varchar(4) not null,
                    nombre varchar(30),
					genero varchar(1),
					fechaNac date,
					cveCarrera varchar(2),
					constraint alumnoPK primary key (noCont),
					Constraint alumnoFK1 foreign key (cveCarrera) references carrera(cveCarrera),
					Constraint alumnoCK1 check (genero = 'F' or genero = 'M'));

create table maestro(cveMae varchar(4) not null ,
                     nombre varchar(30),
                     cveCarrera varchar(2),
                     constraint maestroPK primary key (cveMae),
                     Constraint maestroFK1 foreign key (cveCarrera) references carrera(cveCarrera));

create table grupo(cveMat varchar(4) not null,
                   noGpo int not null,
                   cveMae varchar(4),
                   horario varchar(5),
                   salon varchar(3),
                   constraint grupoPK primary key (cveMat,noGpo),
                   Constraint grupoFK1 foreign key (cveMat) references materia(cveMat),
				   Constraint grupoFK2 foreign key (cveMae) references maestro(cveMae));

create table lista(cveMat varchar(4) not null,
                   noGpo int not null,
                   noCont varchar(4) not null,
                   constraint listaPK primary key (cveMat,noGpo,noCont),
                   Constraint listaFK1 foreign key (cveMat,noGpo) references grupo(cveMat,noGpo),
                   Constraint listaFK2 foreign key (noCont) references alumno(noCont));

create table kardex(cveMat varchar(4) not null,
                    noCont varchar(4) not null,
                    noOpor int not null, 
                    calificacion int,
                    constraint kardexPK primary key (cveMat,noCont,noOpor),
                    Constraint kardexFK1 foreign key (cveMat) references materia(cveMat),
                    Constraint kardexFK2 foreign key (noCont) references alumno(noCont),
                    Constraint kardexFK3 foreign key (noOpor) references oportunidad(noOpor),
                    Constraint kardexCK1 check (calificacion between 0 and 100));

create table preRequisitos(cveMat varchar(4) not null,
						   cveMatPreRequisto varchar(4) not null,
                           constraint preRequisitoPK primary key (cveMat,cveMatpreRequisto),
                           Constraint preRequisitoFK1 foreign key (cveMat) references materia(cveMat),
                           Constraint preRequisitoFK2 foreign key (cveMatPreRequisto) references materia(cveMat));
                          
                          
