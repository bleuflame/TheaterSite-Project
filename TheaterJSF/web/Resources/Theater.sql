/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  JamesEich
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




insert into Theater values (
    'Sunnytown', '75080', '2020 Force Lane, Richardson, TX, ', '205');
insert into Theater values (
    'Bright Cinemas', '75080', '8675 Three o Nine Alley, Richardson TX, ', '206');
insert into Theater values (
    'Cinemark', '75085', '909 Haunted Hill Avenue, Richardson TX, ', '207');

insert into Theater_Movies values (
  'tt2277860', '205', '2:45pm');

