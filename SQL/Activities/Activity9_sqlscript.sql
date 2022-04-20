REM   Script: Activity9
REM   Joins

insert all 
into salesman values(5001,James Hoog,New York,15) 
into salesman values(5002,Nail Knite,Paris,13) 
into salesman values(5005,Pit Alex,London,11) 
into salesman values(5006,McLyon,Paris,14) 
into salesman values(5007,Paul Adam,Rome,13) 
into salesman values(5003,Lauson Hen,San Jose,12) ;

insert all 
into salesman values(5001,James Hoog,New York,15) 
into salesman values(5002,Nail Knite,Paris,13) 
into salesman values(5005,Pit Alex,London,11) 
into salesman values(5006,McLyon,Paris,14) 
into salesman values(5007,Paul Adam,Rome,13) 
into salesman values(5003,Lauson Hen,San Jose,12) 
select 1 from dual;

insert all 
into salesman values(5001,'James Hoog','New York',15) 
into salesman values(5002,'Nail Knite','Paris',13) 
into salesman values(5005,'Pit Alex','London',11) 
into salesman values(5006,'McLyon','Paris',14) 
into salesman values(5007,'Paul Adam','Rome',13) 
into salesman values(5003,'Lauson Hen','San Jose',12) 
select 1 from dual;

select * from salesman;

select * from salesman;

select * from salesman;

select * from salesman;

select * from orders;

select * from salesman;

select * from orders;

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

INSERT ALL 
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001) 
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001) 
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002) 
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002) 
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

select * from salesman;

select * from orders;

select * from customers;

select sm.salesman_name,c.customer_name from salesman sm, customers c 
where sm.salesman_id=c.salesman_id;

select * from salesman;

select * from orders;

select * from customers;

select  sm.salesman_name,c.customer_name,c.grade from salesman sm, customers c, orders o 
where sm.salesman_id=c.salesman_id and sm.salesman_id=o.salesman_id 
and c.grade<300 order by c.customer_name asc;

select  sm.salesman_name,c.customer_name,c.grade from salesman sm, customers c 
where sm.salesman_id=c.salesman_id  
and c.grade<300 order by c.customer_name asc;

select  sm.salesman_name,c.customer_name,c.grade from salesman sm, customers c 
where sm.salesman_id=c.salesman_id  
and c.grade<300 order by c.customer_name asc;

SELECT a.customer_name, a.city, a.grade, b.name AS "Salesman", b.city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

select * from salesman;

select  sm.salesman_name,c.customer_name,c.grade from salesman sm, customers c 
where sm.salesman_id=c.salesman_id  
and c.grade<300 order by c.customer_name asc;

SELECT a.customer_name, a.city, a.grade, b.name AS "Salesman", b.salesman_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

select  sm.salesman_name,c.customer_name,c.grade from salesman sm, customers c 
where sm.salesman_id=c.salesman_id  
and c.grade<300 order by c.customer_name asc;

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.salesman_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

select sm.salesman_name,c.customer_name from salesman sm, customers c 
where sm.salesman_id=c.salesman_id where sm.comission>12;

select sm.salesman_name,c.customer_name from salesman sm, customers c 
where sm.salesman_id=c.salesman_id and sm.comission>12 ;

select sm.salesman_name,c.customer_name from salesman sm, customers c 
where sm.salesman_id=c.salesman_id and sm.commission>12 ;

select sm.salesman_name,c.customer_name from salesman sm, customers c 
where sm.salesman_id=c.salesman_id and sm.commission>12 ;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id  
WHERE b.commission>12;

select * from orders;

select o.order_no,o.order_date,o.purchase_amount,c.customer_name,sm.salesman_name,sm.commission from from salesman sm, customers c, orders o 
where sm.salesman_id=c.salesman_id and c.salesman_id=o.salesman_id;

select * from salesman;

select * from orders;

select * from customers;

select o.order_no,o.order_date,o.purchase_amount,c.customer_name,sm.salesman_name,sm.commission  from salesman sm, customers c, orders o 
where sm.salesman_id=c.salesman_id and c.salesman_id=o.salesman_id;

select o.order_no,o.order_date,o.purchase_amount,c.customer_name,sm.salesman_name,sm.commission  from salesman sm, customers c, orders o 
where sm.salesman_id=c.salesman_id and c.salesman_id=o.salesman_id;

SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.name AS "Salesman", c.commission FROM orders a  
INNER JOIN customers b ON a.customer_id=b.customer_id  
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;

select o.order_no,o.order_date,o.purchase_amount,c.customer_name,sm.salesman_name,sm.commission  from salesman sm, customers c, orders o 
where sm.salesman_id=c.salesman_id and c.salesman_id=o.salesman_id;

SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.salesman_name AS "Salesman", c.commission FROM orders a  
INNER JOIN customers b ON a.customer_id=b.customer_id  
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;

