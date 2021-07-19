drop table if exists list_of_values; 

create table list_of_values (
id int auto_increment primary key,
category_type int not null,
item_id int not null,
description varchar(50) not null
);

create index list_of_values_idx1 on list_of_values(category_type);

drop table if exists invoice_item; 

create table invoice_item (
id int auto_increment primary key,
product_id int not null,
quantity decimal(10,2) not null,
unit_value decimal(10,2) not null
);

-- category: 1-Product
insert into list_of_values(category_type, item_id, description) values (1, 1, 'Product 1');
insert into list_of_values(category_type, item_id, description) values (1, 2, 'Product 2');
insert into list_of_values(category_type, item_id, description) values (1, 8, 'Product 8');

-- category: 2-Country
insert into list_of_values(category_type, item_id, description) values (2, 1, 'Brazil');
insert into list_of_values(category_type, item_id, description) values (2, 2, 'USA');
insert into list_of_values(category_type, item_id, description) values (2, 3, 'Canadá');
insert into list_of_values(category_type, item_id, description) values (2, 4, 'Argentina');
