REM   Script: Activity7
REM   Aggregate functions

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

insert all  
into salesman values(5001,'James Hoog','New York',15)  
into salesman values(5002,'Nail Knite','Paris',13)  
into salesman values(5005,'Pit Alex','London',11)  
into salesman values(5006,'McLyon','Paris',14)  
into salesman values(5007,'Paul Adam','Rome',13)  
into salesman values(5003,'Lauson Hen','San Jose',12)  
select 1 from dual;

describe salesman


insert all  
into salesman values(5001,'James Hoog','New York',15)  
into salesman values(5002,'Nail Knite','Paris',13)  
into salesman values(5005,'Pit Alex','London',11)  
into salesman values(5006,'McLyon','Paris',14)  
into salesman values(5007,'Paul Adam','Rome',13)  
into salesman values(5003,'Lauson Hen','San Jose',12) 
into salesman values(100) 
select 1 from dual;

insert all  
into salesman values(5001,'James Hoog','New York',15)  
into salesman values(5002,'Nail Knite','Paris',13)  
into salesman values(5005,'Pit Alex','London',11)  
into salesman values(5006,'McLyon','Paris',14)  
into salesman values(5007,'Paul Adam','Rome',13)  
into salesman values(5003,'Lauson Hen','San Jose',12) 
into salesman values(100) 
select 1 from dual;

insert all  
into salesman values(5001,'James Hoog','New York',15,100)  
into salesman values(5002,'Nail Knite','Paris',13,100)  
into salesman values(5005,'Pit Alex','London',11,100)  
into salesman values(5006,'McLyon','Paris',14,100)  
into salesman values(5007,'Paul Adam','Rome',13,100)  
into salesman values(5003,'Lauson Hen','San Jose',12,100) 
 
select 1 from dual;

select * from salesman;

update salesman set grade =200 where salesman_city='Rome';

update salesman set grade =300 where salesman_name='James Hoog';

update salesman set salesman_name ='Pierre' where salesman_name='McLyon';

select * from salesman;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select distinct salesman_id from orders;

select order_no from orders order by order_date desc;

select order_no from orders order by purchase_amount desc;

select * from orders where purchase_amount<5000;

select * from orders where purchase_amount between 1000 and 2000;

select distinct salesman_id from orders;

select order_no,order_date from orders order by order_date desc;

select order_no,purchase_amount from orders order by purchase_amount desc;

select * from orders where purchase_amount<5000;

select * from orders where purchase_amount between 1000 and 2000;

select * from orders 
;

select * from orders 
;

select * from orders 
;

select * from orders 
;

select * from orders 
;

select * from orders;

select sum(purchase_amount) as totalpurchaseamount from orders group by order_no;

select avg(purchase_amount) as averagepurchaseamount from orders group by order_no;

select max(purchase_amount) as maximumpurchaseamount from orders group by order_no;

select min(purchase_amount) as minimumpurchaseamount from orders group by order_no;

select count(Salesman_id)as totalcount from orders;

select * from orders;

select sum(purchase_amount) as totalpurchaseamount from orders;

select avg(purchase_amount) as averagepurchaseamount from orders;

select max(purchase_amount) as maximumpurchaseamount from orders;

select min(purchase_amount) as minimumpurchaseamount from orders;

select count(Salesman_id)as totalcount from orders;

