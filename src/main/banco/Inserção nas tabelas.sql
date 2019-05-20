insert into clickmed_teste.especialidades (id, nome)
values (1, 'Acupuntura');
insert into clickmed_teste.especialidades (id, nome)
values (2, 'Alergias');
insert into clickmed_teste.especialidades (id, nome)
values (3, 'Cancerologia');
insert into clickmed_teste.especialidades (id, nome)
values (4, 'Cardiologia');
insert into clickmed_teste.especialidades (id, nome)
values (5, 'Cirurgias');
insert into clickmed_teste.especialidades (id, nome)
values (6, 'Dermatologia');
insert into clickmed_teste.especialidades (id, nome)
values (7, 'Endoscopia');
insert into clickmed_teste.especialidades (id, nome)
values (8, 'Gastroenterologia');
insert into clickmed_teste.especialidades (id, nome)
values (9, 'Ginecologia');
insert into clickmed_teste.especialidades (id, nome)
values (10, 'Infectologia');
insert into clickmed_teste.especialidades (id, nome)
values (11, 'Medicina Esportiva');
insert into clickmed_teste.especialidades (id, nome)
values (12, 'Medicina Intensiva');
insert into clickmed_teste.especialidades (id, nome)
values (13, 'Medicina Nuclear');
insert into clickmed_teste.especialidades (id, nome)
values (14, 'Neurocirurgia');
insert into clickmed_teste.especialidades (id, nome)
values (15, 'Neurologia');
insert into clickmed_teste.especialidades (id, nome)
values (16, 'Ortopedia');
insert into clickmed_teste.especialidades (id, nome)
values (17, 'Otorrinolaringologia');
insert into clickmed_teste.especialidades (id, nome)
values (18, 'Patologia');
insert into clickmed_teste.especialidades (id, nome)
values (19, 'Psicologia');
insert into clickmed_teste.especialidades (id, nome)
values (20, 'Psiquiatria');
insert into clickmed_teste.especialidades (id, nome)
values (21, 'Radiologia');
insert into clickmed_teste.especialidades (id, nome)
values (22, 'Traumatologia');


select * 
from clickmed_teste.medicos
inner join clickmed_teste.medicos_has_especialidades
on clickmed_teste.medicos.id = clickmed_teste.medicos_has_especialidades.medico_id
inner join clickmed_teste.especialidades
on clickmed_teste.especialidades.id = clickmed_teste.medicos_has_especialidades.especialidades_id
where clickmed_teste.especialidades.nome = 'Psiquiatria';
