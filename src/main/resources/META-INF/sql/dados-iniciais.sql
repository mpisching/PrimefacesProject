insert into Empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao) values (1, '70.311.193/0001-87', 'Mercado do João', 'João Mercado e Distribuidor de Alimentos Ltda', 'LTDA', '2009-03-02');
insert into Empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao) values (2, '52.822.994/0001-25', 'Fale Mais', 'Fale Mais Telecom S.A.', 'SA', '1997-12-10');
insert into Empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao) values (3, '41.952.519/0001-57', 'Maria de Souza da Silva', 'Maria de Souza da Silva', 'MEI', '2014-10-15');
insert into Empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao) values (4, '16.134.777/0001-89', 'Gomes Inovação', 'José Fernando Gomes EIRELI ME', 'EIRELI', '2009-03-02');

insert into cargo(id, descricao, piso_salarial) values (1, 'Vendedor', 1200.00);
insert into cargo(id, descricao, piso_salarial) values (2, 'Repositor', 1100.00);
insert into cargo(id, descricao, piso_salarial) values (3, 'Gerente de vendas', 2200.00);

insert into funcionario(id, matricula, nome, salario, situacao, dataAdmissao, cargo_id) values (1, 1000, 'Joao', 5000.0, 'ATIVO', '2010-05-15', 3);
insert into funcionario(id, matricula, nome, salario, situacao, dataAdmissao, cargo_id) values (2, 1001, 'Roberta', 4500.0, 'AFASTADO', '2011-03-21', 1);
insert into funcionario(id, matricula, nome, salario, situacao, dataAdmissao, cargo_id) values (3, 1002, 'Matheus', 5500.0, 'ATIVO', '2011-03-21', 2);
insert into funcionario(id, matricula, nome, salario, situacao, dataAdmissao, cargo_id) values (4, 1003, 'Bruna', 5500.0, 'INATIVO', '2012-09-10', 1);