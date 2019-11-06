
CREATE TABLE category( 
id IDENTITY,
name VARCHAR(50),
DESCRIPTION VARCHAR(255),
image_url VARCHAR(50),
is_active BOOLEAN,


CONSTRAINT pk_category_id PRIMARY KEY (id)

);

insert into category(name, description, image_url, is_active) values('Laptops', 'This is desciption for Laptops!' ,'CAT_1.png', true);
insert into category(name, description, image_url, is_active) values('Televisions', 'This is desciption for televisions!' ,'CAT_2.png', true);
insert into category(name, description, image_url, is_active) values('Mobiles', 'This is desciption for Mobiles!' ,'CAT_3.png', true);

Create table user_detail(
id IDENTITY, first_name Varchar(50), last_name varchar(50),
role varchar(50), enabled BOOLEAN, password varchar(50), email varchar(100),
contact_number varchar(15),
CONSTRAINT pk_user_id PRIMARY KEY(id),);


-- adding the user details

INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Hritvik', 'Patwa', 'ADMIN', true, 'secure@2019', 'hritvikpatwa@gmail.com', '7045858733');
INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Ishan', 'Ingle', 'SUPPLIER', true, '12345', 'ingleishan@gmail.com', '7894521365');
INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Sumeet', 'Suley', 'SUPPLIER', true, '12345', 'sumeetsuley@gmail.com', '7777777773');
INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Hemant', 'Patwa', 'USER', true, '12345', 'hemant@gmail.com', '4147777777');

CREATE TABLE product (
	id IDENTITY,
	code VARCHAR(20),
	name VARCHAR(50),
	brand VARCHAR(50),
	description VARCHAR(255),
	unit_price DECIMAL(10,2),
	quantity INT,
	is_active BOOLEAN,
	category_id INT,
	supplier_id INT,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	CONSTRAINT pk_product_id PRIMARY KEY (id),
 	CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES category (id),
	CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id) REFERENCES user_detail(id),	
);

--adding the products dummy

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id, purchases, views)
VALUES ('PRDABC123DEFX', 'iPhone 5s', 'apple', 'This is one of the best phone available in the market right now!', 18000, 5, true, 3, 2, 0, 0 );
INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id, purchases, views)
VALUES ('PRDDEF123DEFX', 'Samsung s7', 'samsung', 'A smart phone by samsung!', 32000, 2, true, 3, 3, 0, 0 );
INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id, purchases, views)
VALUES ('PRDPQR123WGTX', 'Google Pixel', 'google', 'This is one of the best android smart phone available in the market right now!', 57000, 5, true, 3, 2, 0, 0 );
INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id, purchases, views)
VALUES ('PRDMNO123PQRX', ' Macbook Pro', 'apple', 'This is one of the best laptops available in the market right now!', 54000, 3, true, 1, 2, 0, 0 );
INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id, purchases, views)
VALUES ('PRDABCXYZDEFX', 'Dell Latitude E6510', 'dell', 'This is one of the best laptop series from dell that can be used!', 48000, 5, true, 1, 3, 0, 0 );

