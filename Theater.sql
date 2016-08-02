/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  JamesEich
 */

create table Theater (
  name varchar(50) not null,
  zip int not null, 
  address varchar(100) not null, 
  theaterId int not null,
  constraint pkTheater primary key (theaterId)
);

create table Theater_Movies (
  imdbId varchar(15) not null,
  theaterId integer not null,
  movieTime varchar(5) not null,
  constraint pkTheater_Movies primary key (imdbId, theaterId, movieTime)
);




insert into Theater values (
    'Sunnytown', 75080, '2020 Force Lane, Richardson, TX, ', 205);
insert into Theater values (
    'Bright Cinemas', 75080, '8675 Three o Nine Alley, Richardson TX, ', 206);
insert into Theater values (
    'Cinemark', 75085, '909 Haunted Hill Avenue, Richardson TX, ', 207);

insert into Theater_Movies values (
  'tt2277860', 205, "2:45pm");

