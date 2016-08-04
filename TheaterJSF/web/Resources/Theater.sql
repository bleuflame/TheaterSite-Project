/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  JamesEich, Kameron Freitag
 */

DROP TABLE Theater;
DROP TABLE Theater_Movies;

create table Theater (
  theater_name varchar(50) not null,
  zip varchar(5) not null, 
  address varchar(100) not null, 
  theaterId varchar(15) not null,
  constraint pkTheater primary key (theaterId)
);

create table Theater_Movies (
  imdbId varchar(15) not null,
  theaterId varchar(15) not null,
  movieTime varchar(15) not null,
  constraint pkTheater_Movies primary key (imdbId, theaterId, movieTime),
  FOREIGN KEY (theaterId) REFERENCES Theater(theaterId)
);


insert into Theater (theater_name, zip, address, theaterId) 
values (  'Sunnytown', '75080', '5050 Force Lane, Richardson, TX, ', '205');
insert into Theater (theater_name, zip, address, theaterId) 
values (  'Brighthouse Cinemas', '75080', '8675 Three o Nine Alley, Richardson, TX, ', '206');
insert into Theater (theater_name, zip, address, theaterId) 
values (  'Cinemars', '75080', '909 Haunted Hill Avenue, Richardson, TX, ', '207');

insert into Theater (theater_name, zip, address, theaterId) 
values (  'Lighthouse Theafter', '75070', '404 Lost Lane, McKinney, TX, ', '208');
insert into Theater (theater_name, zip, address, theaterId) 
values (  'Studio Movie Wok', '75070', '42 Meaning Street, McKinney TX, ', '209');


insert into Theater (theater_name, zip, address, theaterId) 
values (  'Brighthouse Cinemas', '75075', '39 Thanks Park, Plano, TX, ', '210');
insert into Theater (theater_name, zip, address, theaterId) 
values (  'Studio Movie Wok', '75075', '4 Tenshi Street, Plano TX, ', '211');


insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '205', '2:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '206', '2:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '207', '2:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '208', '2:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '209', '2:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '210', '2:15pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '211', '5:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '205', '5:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '206', '5:15pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '207', '5:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '208', '5:15pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '209', '5:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '210', '5:15pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '211', '5:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '205', '8:15pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '206', '8:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '207', '9:10pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '208', '8:30pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '209', '7:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '210', '8:15pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2277860', '211', '7:45pm');

insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '205', '2:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '206', '2:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '207', '2:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '208', '2:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '209', '2:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '210', '2:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '211', '5:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '205', '5:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '206', '5:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '207', '5:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '208', '5:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '209', '5:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '210', '5:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '211', '5:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '205', '8:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '206', '9:05pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '207', '9:20pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '208', '8:40pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '209', '7:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '210', '8:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2948356', '211', '7:55pm');

insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '205', '1:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '206', '1:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '207', '1:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '208', '1:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '209', '1:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '210', '1:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '211', '4:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '205', '4:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '206', '4:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '207', '4:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '208', '4:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '209', '4:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '210', '4:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '211', '4:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '205', '7:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '206', '8:05pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '207', '8:20pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '208', '7:40pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '209', '6:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '210', '7:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2709768', '211', '8:55pm');

insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '205', '3:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '206', '3:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '207', '3:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '208', '3:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '209', '3:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '210', '3:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '211', '6:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '205', '6:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '206', '6:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '207', '6:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '208', '6:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '209', '6:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '210', '6:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '211', '6:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '205', '9:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '206', '10:05pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '207', '10:20pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '208', '9:40pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '209', '8:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '210', '9:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '211', '10:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '205', '12:25am');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '206', '12:05am');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '207', '12:20am');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '208', '11:40pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '209', '10:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '210', '11:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt1386697', '211', '12:55am');



insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '206', '4:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '207', '3:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '208', '4:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '209', '4:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '210', '4:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '211', '7:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '206', '7:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '207', '6:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '208', '6:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '209', '6:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '210', '6:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '211', '7:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '206', '10:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '207', '11:20pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '208', '10:40pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '209', '9:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '210', '9:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '211', '10:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '206', '12:15am');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '207', '12:30am');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '208', '11:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '209', '11:30pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '210', '10:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt2660888', '211', '1:55am');

insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '205', '3:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '207', '3:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '208', '3:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '209', '3:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '210', '3:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '211', '6:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '205', '6:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '207', '6:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '208', '6:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '209', '7:05pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '210', '6:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '211', '7:05pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '205', '9:35pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '207', '9:50pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '208', '9:55pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '209', '8:45pm');
insert into Theater_Movies (imdbId, theaterId, movieTime) 
values ('tt3416828', '210', '8:25pm');
insert into Theater_Movies (imdbId, theaterId, movieTime)
values ('tt3416828', '211', '10:45pm');










