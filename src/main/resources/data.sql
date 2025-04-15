INSERT INTO project (id, name) VALUES (1, 'alpha');
INSERT INTO project (id, name) VALUES (2, 'beta');

INSERT INTO employee (id, first_name, last_name, salary, contract_type) VALUES (1, 'Alice', 'Brown', 70000, 'B2B');
INSERT INTO employee (id, first_name, last_name, salary, contract_type) VALUES (2, 'Bob', 'Brown', 67000, 'B2B');
INSERT INTO employee (id, first_name, last_name, salary, contract_type) VALUES (3, 'Charlie', 'Brown', 64000, 'B2B');
INSERT INTO employee (id, first_name, last_name, salary, contract_type) VALUES (4, 'David', 'Brown', 53000, 'B2B');
INSERT INTO employee (id, first_name, last_name, salary, contract_type) VALUES (5, 'Eve', 'Brown', 49000, 'B2B');
INSERT INTO employee (id, first_name, last_name, salary, contract_type) VALUES (6, 'Frank', 'Brown', 79000, 'CONTRACT');
INSERT INTO employee (id, first_name, last_name, salary, contract_type) VALUES (7, 'Grace', 'Brown', 45000, 'CONTRACT');
INSERT INTO employee (id, first_name, last_name, salary, contract_type) VALUES (8, 'Hank', 'Brown', 65000, 'CONTRACT');
INSERT INTO employee (id, first_name, last_name, salary, contract_type) VALUES (9, 'Ivy', 'Brown', 56000, 'CONTRACT');
INSERT INTO employee (id, first_name, last_name, salary, contract_type) VALUES (10, 'Jack', 'Brown', 52000, 'CONTRACT');

INSERT INTO project_employee (project_id, employee_id) VALUES (1, 1);
INSERT INTO project_employee (project_id, employee_id) VALUES (1, 2);
INSERT INTO project_employee (project_id, employee_id) VALUES (1, 3);
INSERT INTO project_employee (project_id, employee_id) VALUES (1, 4);
INSERT INTO project_employee (project_id, employee_id) VALUES (1, 5);
INSERT INTO project_employee (project_id, employee_id) VALUES (2, 5);
INSERT INTO project_employee (project_id, employee_id) VALUES (1, 6);
INSERT INTO project_employee (project_id, employee_id) VALUES (2, 6);
INSERT INTO project_employee (project_id, employee_id) VALUES (2, 7);
INSERT INTO project_employee (project_id, employee_id) VALUES (2, 8);
INSERT INTO project_employee (project_id, employee_id) VALUES (2, 9);
INSERT INTO project_employee (project_id, employee_id) VALUES (2, 10);

