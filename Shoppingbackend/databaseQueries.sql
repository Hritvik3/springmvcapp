
CREATE TABLE category( 
id int,
name VARCHAR(50),
DESCRIPTION VARCHAR(255),
image_url VARCHAR(50),
is_active BOOLEAN,


CONSTRAINT pk_category_id PRIMARY KEY (id)

);

CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1 INCREMENT BY 1;

-- adding three categories
INSERT INTO category (name, description,image_url,is_active) VALUES ('Laptop', 'This is description for Laptop category!', 'CAT_1.png', true);
INSERT INTO category (name, description,image_url,is_active) VALUES ('Television', 'This is description for Television category!', 'CAT_2.png', true);
INSERT INTO category (name, description,image_url,is_active) VALUES ('Mobile', 'This is description for Mobile category!', 'CAT_3.png', true);
