insert into route (number_route) values (1);
insert into route (number_route) values (2);
insert into route (number_route) values (3);
insert into route (number_route) values (4);

insert into passenger (name,age) values ('Bob',44);
insert into passenger (name,age) values ('Alex',23);
insert into passenger (name,age) values ('John',31);
insert into passenger (name,age) values ('Kate',18);

insert into train (train_number,id_route) values('AAA',1);
insert into train (train_number,id_route) values('BBB',2);
insert into train (train_number,id_route) values('CCC',3);
insert into train (train_number,id_route) values('EEE',4);

insert into station (station_name) values('Ufa');
insert into station (station_name) values('SPb');
insert into station (station_name) values('Moscow');
insert into station (station_name) values('Rostov');

insert into schedule (id_station, arrival_time,departure_time,id_route) values(1,'14:30:00','14:35:00',1);
insert into schedule (id_station, arrival_time,departure_time,id_route) values(2,'18:30:00','18:55:00',2);
insert into schedule (id_station, arrival_time,departure_time,id_route) values(3,'22:15:00','22:35:00',3);
insert into schedule (id_station, arrival_time,departure_time,id_route) values(4,'23:30:00','23:55:00',4);

insert into ticket (id_pass,id_schedule,id_train) values (1,1,1);
insert into ticket (id_pass,id_schedule,id_train) values (2,2,2);
insert into ticket (id_pass,id_schedule,id_train) values (3,3,3);
insert into ticket (id_pass,id_schedule,id_train) values (4,4,4);






