use artgallerysystem;
select * from product;
select * from reviews;
select * from checkout;
alter table checkout rename column addtocart_date to checkout_date;
insert into reviews values(101,"mohit@gmail.com",Now(),5.0,3,"good");
insert into reviews values(102,"arsh@gmail.com",Now(),4.5,1,"awesome");
insert into product values(1,"Crystal","Ankita","Digital Art",10,7,"Digital Art","");
insert into product values(2,"AutumnPathWay","Ankita","Spray Art",10,7,"Spray Art","");
insert into product values(3,"TraditionalArt","Ankita","Mandala Art",10,7,"Mandala Art","");
insert into product values(4,"Puzzle","Ankita","Digital Art",10,7,"Digital Art","");
insert into product values(5,"WalkInThePark","Ankita","Mandala Art",10,7,"Mandala Art","");
insert into product values(6,"WomanWithPeacock","Ankita","Spray Art",10,7,"Spray Art","")