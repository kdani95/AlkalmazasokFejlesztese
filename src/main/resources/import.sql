INSERT INTO customers (user_name, name, password, email_address) VALUES ('admin', 'Józsi', 'admin', 'admin@gmail.com');
INSERT INTO customers (user_name, name, password, email_address) VALUES ('zek', 'Peti', 'zek', 'zek@gmail.com');
INSERT INTO customers (user_name, name, password, email_address) VALUES ('tomi', 'Károly', 'tomi', 'tomi@gmail.com');

INSERT INTO categories (name) VALUES ('szórakoztató elektronika');
INSERT INTO categories (name) VALUES ('számítástechnika');
INSERT INTO categories (name) VALUES ('konyhai gépek');

INSERT INTO items (category_id, name, manufacturer, type_number, description, nett_price, stock, active) VALUES (1,'YBoy', 'Macrohard', 12345, 'Ez egy nagyon jó játékkonzol!', 999999, 1, TRUE);
INSERT INTO items (category_id, name, manufacturer, type_number, description, nett_price, stock, active) VALUES (2,'SPS', 'Szoni', 12212, 'Ez is egy nagyon jó játékkonzol!', 999999, 1, TRUE);
INSERT INTO items (category_id, name, manufacturer, type_number, description, nett_price, stock, active) VALUES (3,'PearBook', 'Pear inc.', 11111, 'Ez egy nagyon jó laptop!', 890000, 5, TRUE);
INSERT INTO items (category_id, name, manufacturer, type_number, description, nett_price, stock, active) VALUES (1,'youPhone', 'Pear inc.', 11122, 'Ez egy nagyon jó telefon!', 995000, 5, TRUE);
INSERT INTO items (category_id, name, manufacturer, type_number, description, nett_price, stock, active) VALUES (2,'Mikrohullámú sütő', 'Szamszung', 10101, 'Ez egy nagyon jó mikró!', 500, 101, TRUE);

INSERT INTO orders (customer_id, order_id, item_id,address, phone_number, complete) VALUES (1, 1, 1,'Bütykös utca 99.', '06111111111', FALSE);
INSERT INTO orders (customer_id, order_id, item_id,address, phone_number, complete) VALUES (1, 1, 2,'Bütykös utca 99.', '06111111111', FALSE);

INSERT INTO orders (customer_id, order_id, item_id,address, phone_number, complete) VALUES (2, 2, 1,'Bütykös utca 99.', '06111111111', FALSE);
INSERT INTO orders (customer_id, order_id, item_id,address, phone_number, complete) VALUES (2, 2, 2,'Bütykös utca 99.', '06111111111', FALSE);
INSERT INTO orders (customer_id, order_id, item_id,address, phone_number, complete) VALUES (2, 2, 3,'Bütykös utca 99.', '06111111111', FALSE);
INSERT INTO orders (customer_id, order_id, item_id,address, phone_number, complete) VALUES (2, 2, 4,'Bütykös utca 99.', '06111111111', FALSE);