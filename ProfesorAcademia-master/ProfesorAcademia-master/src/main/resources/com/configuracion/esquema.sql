/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  admin
 * Created: 28/09/2018
 */

drop table if exists persona;

create table persona(

idPersona identity primary key,

nombres varchar(30) not null,

apellidos varchar(30) not null,

direccionDomicilio varchar(30) not null

);