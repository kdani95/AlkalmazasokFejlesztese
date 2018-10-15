INSERT INTO users (user_name, password, email_address, permission_rule_code) VALUES ('admin', 'admin', 'admin@gmail.com', 'ADMIN');
INSERT INTO users (user_name, password, email_address, permission_rule_code) VALUES ('zek', 'zek', 'zek@gmail.com', 'POWERUSER');
INSERT INTO users (user_name, password, email_address, permission_rule_code) VALUES ('tomi', 'tomi', 'tomi@gmail.com', 'USER');

INSERT INTO issues (created_by_id, created_at, updated_at, title, description, place) VALUES (2, '2018-09-01 15:00:00.000', '2018-09-01 15:00:00.000', 'CIM1', 'Füstöl a gép (001-es)', 'PC8');
INSERT INTO issues (created_by_id, created_at, updated_at, title, description, place) VALUES (2, '2018-09-02 17:00:10.000', '2018-09-02 17:00:10.000', 'CIM2', 'Rossz a projektor', 'PC2');
INSERT INTO issues (created_by_id, created_at, updated_at, title, description, place) VALUES (2, '2018-09-01 15:00:00.000', '2018-09-01 15:00:00.000', 'CIM3', 'Leégett a fél terem', 'PC4');

INSERT INTO issues (created_by_id, created_at, updated_at, title, description, place) VALUES (3, '2018-09-11 15:00:00.000', '2018-09-11 15:00:00.000', 'CIM4', 'Nem kapcsol be', 'PC1');
INSERT INTO issues (created_by_id, created_at, updated_at, title, description, place) VALUES (3, '2018-09-11 15:10:00.000', '2018-09-11 15:10:00.000', 'CIM5', 'Rossz a projektor', 'PC1');

INSERT INTO messages (issue_id, created_by_id, created_at, message) VALUES (2, 2, '2018-09-11 15:10:00.000', 'Meglesem');
INSERT INTO messages (issue_id, created_by_id, created_at, message) VALUES (2, 2, '2018-09-11 17:10:00.000', 'Megvan a hiba, holnap megcsináom');
INSERT INTO messages (issue_id, created_by_id, created_at, message) VALUES (2, 2, '2018-09-12 11:10:00.000', 'KÉSZ');

INSERT INTO Labels(created_at, text) VALUES ('2018-09-12 11:10:00.000', 'ERROR1');
INSERT INTO Labels(created_at, text) VALUES ('2018-09-02 17:00:10.000', 'ERROR2');
INSERT INTO Labels(created_at, text) VALUES ('2018-09-01 15:00:00.000', 'ERROR3');

INSERT INTO issues_labels(issues_id, labels_id) VALUES (2, 1);
INSERT INTO issues_labels(issues_id, labels_id) VALUES (2, 3);