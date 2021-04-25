create database dm2021n;

use dm2021n;

CREATE TABLE dm2021n.usu_usuario (
    usu_id INT NOT NULL AUTO_INCREMENT,
    usu_login VARCHAR(30) NOT NULL,
    usu_senha VARCHAR(30) NOT NULL,
    usu_status VARCHAR(30) NOT NULL,
    usu_tipo VARCHAR(30) NOT NULL,
    PRIMARY KEY (usu_id)
);
    
CREATE TABLE dm2021n.dep_departamento (
    dep_id INT NOT NULL AUTO_INCREMENT,
    dep_nome VARCHAR(255) NOT NULL,
    dep_desc VARCHAR(255) NOT NULL,
    dep_cencusto VARCHAR(255) NOT NULL,
    PRIMARY KEY (dep_id)
);

CREATE TABLE dm2021n.pes_pessoa (
    pes_id INT NOT NULL AUTO_INCREMENT,
    pes_nome VARCHAR(255) NOT NULL,
    pes_idade VARCHAR(10) NOT NULL,
    pes_genero VARCHAR(10) NOT NULL,
    pes_peso VARCHAR(10) NOT NULL,
    pes_altura VARCHAR(30) NOT NULL,
    PRIMARY KEY (pes_id)
); 
