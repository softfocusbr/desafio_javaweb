create table produtos (
                          codigo integer not null primary key auto_increment,
                          categoria integer not null,
                          nome varchar (200) not null,
                          descricao text not null
);

insert into produtos (categoria, nome, descricao) VALUES (0, 'Computador', 'Maquina do dev');
insert into produtos (categoria, nome, descricao) VALUES (1, 'Ponto', 'Maquina do ponto');
insert into produtos (categoria, nome, descricao) VALUES (2, 'Sede', 'Sede da empresa');
