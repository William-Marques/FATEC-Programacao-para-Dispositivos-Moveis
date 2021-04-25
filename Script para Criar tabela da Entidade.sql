use dm2021n;

CREATE TABLE dm2021n.ter_terceiros (
    ter_id INT NOT NULL AUTO_INCREMENT,
    ter_nome VARCHAR(30) NOT NULL,
    ter_dataNascimento VARCHAR(30) NOT NULL,
    ter_cpf VARCHAR(30) NOT NULL,
    ter_genero VARCHAR(30) NOT NULL,
    ter_endereco VARCHAR(30) NOT NULL,
    ter_telefone VARCHAR(30) NOT NULL,
    ter_email VARCHAR(30) NOT NULL,
    ter_empresa VARCHAR(30) NOT NULL,
    ter_tipo VARCHAR(30) NOT NULL,    
    PRIMARY KEY (ter_id)
);
