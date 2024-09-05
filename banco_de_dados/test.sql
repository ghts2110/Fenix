CREATE DATABASE IF NOT EXISTS fenixAssistidos;

USE fenixAssistidos;

CREATE TABLE Moradia (
    endr VARCHAR(100),
    bairro VARCHAR(100),
    cidade VARCHAR(100),
    est VARCHAR(100),
    cep VARCHAR(8),
    FK_telefone_telefone_PK INT,
    FK_SFSA_cadastro INTEGER
);

-- Titulo_eleitor_DOCUMENTO_JURIDC_ESCOLAR_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO = TE_DJESFSA

CREATE TABLE TE_DJESFSA (
    numero VARCHAR(12),
    secao VARCHAR(4),
    zona VARCHAR(3),
    t_clt BOOLEAN,
    cpf VARCHAR(11),
    rg VARCHAR(10),
    fk_categ_cnh_categ_cnh_PK INT,
    un_prisional VARCHAR(100),
    tempo_sentenca INT,
    seeu VARCHAR(100),
    pje VARCHAR(100),
    reincidente BOOLEAN,
    termino_pena DATE,
    regime_atual VARCHAR(100),
    situacao_process VARCHAR(100),
    fk_artigo_artigo_PK INT,
    escolaridade VARCHAR(100),
    serie_curso VARCHAR(100),
    letrado BOOLEAN,
    dt_aperfeicoamento DATE,
    obs_social VARCHAR(300),
    turma VARCHAR(100),
    manha BOOLEAN,
    tarde BOOLEAN,
    cesta_b BOOLEAN,
    sts VARCHAR(100),
    obs_perfil VARCHAR(300),
    dt_atnd_indv DATE,
    fk_exp_prof_exp_prof_PK INT,
    estado_civil VARCHAR(20),
    nome_mae VARCHAR(50),
    nome_pai VARCHAR(50),
    fk_idd_filhos_idd_filhos_PK INT,
    triagem_familia BOOLEAN,
    dt_atend_fam DATE,
    dt_aniversario DATE,
    raca VARCHAR(10),
    orientacao_sexual VARCHAR(20),
    genero VARCHAR(20),
    cidade_nativa VARCHAR(50),
    fk_q_def_q_def_PK INT,
    estado_nativo VARCHAR(100),
    cadastro INT PRIMARY KEY AUTO_INCREMENT,
    dt_inscricao DATE,
    nome_completo VARCHAR(50),
    idade SMALLINT,
    nacionalidade VARCHAR(30),
    nome_social VARCHAR(50)
);

-- FK_ESCOLAR_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_cadastro = FK_ESFSA_cadastro

CREATE TABLE sitTrab (
    esta_tb BOOLEAN,
    local_tb VARCHAR(100),
    modalidade_tb VARCHAR(100),
    FK_ESFSA_cadastro INTEGER
);

CREATE TABLE categ_cnh (
    categ_cnh_PK INT NOT NULL PRIMARY KEY,
    categ_cnh CHAR
);

CREATE TABLE telefone (
    telefone_PK INT NOT NULL PRIMARY KEY,
    telefone VARCHAR(14)
);

CREATE TABLE q_def (
    q_def_PK INT NOT NULL PRIMARY KEY,
    q_def VARCHAR(30)
);

CREATE TABLE artigo (
    artigo_PK INT NOT NULL PRIMARY KEY,
    artigo VARCHAR(100)
);

CREATE TABLE idd_filhos (
    idd_filhos_PK INT NOT NULL PRIMARY KEY,
    idd_filhos SMALLINT
);

CREATE TABLE exp_prof (
    exp_prof_PK INT NOT NULL PRIMARY KEY,
    exp_prof VARCHAR(100)
);
 
ALTER TABLE Moradia ADD CONSTRAINT FK_Moradia_1
    FOREIGN KEY (FK_telefone_telefone_PK)
    REFERENCES telefone (telefone_PK)
    ON DELETE NO ACTION;

-- FK_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_cadastro = FK_SFSA_cadastro

ALTER TABLE Moradia ADD CONSTRAINT FK_Moradia_2
    FOREIGN KEY (FK_SFSA_cadastro)
    REFERENCES TE_DJESFSA (cadastro); -- error
 
ALTER TABLE TE_DJESFSA ADD CONSTRAINT FK_TE_DJESFSA_2
    FOREIGN KEY (fk_categ_cnh_categ_cnh_PK)
    REFERENCES categ_cnh (categ_cnh_PK);
 
ALTER TABLE TE_DJESFSA ADD CONSTRAINT FK_TE_DJESFSA_3
    FOREIGN KEY (fk_artigo_artigo_PK)
    REFERENCES artigo (artigo_PK);
 
ALTER TABLE TE_DJESFSA ADD CONSTRAINT FK_TE_DJESFSA_4
    FOREIGN KEY (fk_exp_prof_exp_prof_PK)
    REFERENCES exp_prof (exp_prof_PK);
 
ALTER TABLE TE_DJESFSA ADD CONSTRAINT FK_TE_DJESFSA_5
    FOREIGN KEY (fk_idd_filhos_idd_filhos_PK)
    REFERENCES idd_filhos (idd_filhos_PK);
 
ALTER TABLE TE_DJESFSA ADD CONSTRAINT FK_TE_DJESFSA_6
    FOREIGN KEY (fk_q_def_q_def_PK)
    REFERENCES q_def (q_def_PK);
 
ALTER TABLE sitTrab ADD CONSTRAINT FK_sitTrab_1
    FOREIGN KEY (FK_ESFSA_cadastro)
    REFERENCES TE_DJESFSA (cadastro); -- error