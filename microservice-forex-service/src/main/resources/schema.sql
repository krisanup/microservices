
create table exchange_value
(
   id integer not null,
   currency_from varchar(255) not null,
   currency_to varchar(255) not null,
   conversion_multiple  decimal not null,
   port  integer   not null,
   primary key(id)
);

insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port)
values(10001,'USD','INR',65,0);
insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port)
values(10002,'SGD','INR',50,0);
insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port)
values(10003,'AUD','INR',25,0);