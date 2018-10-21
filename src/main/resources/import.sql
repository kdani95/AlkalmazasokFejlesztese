INSERT INTO customers (user_name, name, password, email_address) VALUES ('admin', 'Józsi', 'admin', 'admin@gmail.com');
INSERT INTO customers (user_name, name, password, email_address) VALUES ('zek', 'Peti', 'zek', 'zek@gmail.com');
INSERT INTO customers (user_name, name, password, email_address) VALUES ('tomi', 'Károly', 'tomi', 'tomi@gmail.com');

INSERT INTO categories (created_by_id, created_at, name) VALUES (1, '2018-10-15 22:00:00.000', 'szórakoztató elektronika');
INSERT INTO categories (created_by_id, created_at, name) VALUES (2, '2018-10-15 22:00:00.000', 'számítástechnika');
INSERT INTO categories (created_by_id, created_at, name) VALUES (3, '2018-10-15 22:00:00.000', 'konyhai gépek');

INSERT INTO items (category_id, name, manufacturer, type_number, description, nett_price, stock, active) VALUES (1,'YBoy', 'Macrohard', 12345, 'Ez egy nagyon jó játékkonzol!', 999999, 1, TRUE);
INSERT INTO items (category_id, name, manufacturer, type_number, description, nett_price, stock, active) VALUES (2,'SPS', 'Szoni', 12212, 'Ez is egy nagyon jó játékkonzol!', 999999, 1, TRUE);
INSERT INTO items (category_id, name, manufacturer, type_number, description, nett_price, stock, active) VALUES (3,'PearBook', 'Pear inc.', 11111, 'Ez egy nagyon jó laptop!', 890000, 5, TRUE);
INSERT INTO items (category_id, name, manufacturer, type_number, description, nett_price, stock, active) VALUES (1,'youPhone', 'Pear inc.', 11122, 'Ez egy nagyon jó telefon!', 995000, 5, TRUE);
INSERT INTO items (category_id, name, manufacturer, type_number, description, nett_price, stock, active) VALUES (2,'Mikrohullámú sütő', 'Szamszung', 10101, 'Ez egy nagyon jó mikró!', 500, 101, TRUE);