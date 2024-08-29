/* Lógico_1: */

CREATE TABLE MORADIA (
    endr VARCHAR(100),
    bairro VARCHAR(100),
    cidade VARCHAR(100),
    est VARCHAR(100),
    cep VARCHAR(9),
    FK_telefone_telefone_PK VARCHAR(15),
    id_moradia INT PRIMARY KEY AUTO_INCREMENT,
    FK_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_id_social INT,
    FK_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_id_familia INT,
    FK_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_id_sensivel INT,
    FK_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_cadastro INT
);


/*DOCUMENTO JURIDC ESCOLAR SOCIAL FAMILIA SENSIVEL ASSISTIDO == DJESFSA*/

CREATE TABLE Titulo_eleitor_DJESFSA (
    numero VARCHAR(15),
    secao VARCHAR(5),
    zona VARCHAR(5),
    t_clt BOOLEAN,
    cpf VARCHAR(12),
    rg VARCHAR(15),
    fk_categ_cnh_categ_cnh_PK INT,
    un_prisional VARCHAR(100),
    statusT VARCHAR(100),
    tempo_sentenca INT,
    seeu VARCHAR(100),
    pje VARCHAR(100),
    reincidente BOOLEAN,
    termino_pena DATE,
    regime_atual VARCHAR(30),
    situacao_process VARCHAR(30),
    fk_artigo_artigo_PK INT,
    id_juridc INT,
    escolaridade VARCHAR(30),
    serie_curso VARCHAR(30),
    letrado BOOLEAN,
    id_escolar INT,
    dt_aperfeicoamento BOOLEAN,
    obs_social VARCHAR(3000),
    turma VARCHAR(30),
    manha BOOLEAN,
    tarde BOOLEAN,
    cesta_b BOOLEAN,
    obs_perfil VARCHAR(3000),
    dt_atnd_indv DATE,
    fk_exp_prof_exp_prof_PK VARCHAR(300),
    id_social INT,
    estado_civil VARCHAR(20),
    nome_mae VARCHAR(100),
    nome_pai VARCHAR(100),
    fk_idd_filhos_idd_filhos_PK INT,
    triagem_familia BOOLEAN,
    dt_atend_fam DATE,
    id_familia INT,
    dt_aniversario DATE,
    raca VARCHAR(20),
    orientacao_sexual VARCHAR(50),
    genero VARCHAR(50),
    cidade_nativa VARCHAR(100),
    fk_q_def_q_def_PK VARCHAR(20),
    id_sensivel INT,
    estado_nativo VARCHAR(100),
    cadastro INT,
    dt_inscricao DATE,
    nome_completo VARCHAR(100),
    idade INT,
    nacionalidade VARCHAR(100),
    nome_social VARCHAR(100),
    PRIMARY KEY (numero, cpf, id_juridc, id_escolar, id_social, id_familia, id_sensivel, cadastro)
);

CREATE TABLE SIT_TRAB (
    esta_tb BOOLEAN,
    local_tb VARCHAR(100),
    modalidade_tb VARCHAR(100),
    id_sit_trab INT PRIMARY KEY,
    FK_ESCOLAR_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_id_escolar INT,
    FK_ESCOLAR_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_id_social INT,
    FK_ESCOLAR_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_id_familia INT,
    FK_ESCOLAR_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_id_sensivel INT,
    FK_ESCOLAR_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_cadastro INT
);

CREATE TABLE categ_cnh (
    categ_cnh_PK INT NOT NULL PRIMARY KEY,
    categ_cnh CHAR
);

CREATE TABLE telefone (
    telefone_PK VARCHAR(15) NOT NULL PRIMARY KEY,
    telefone VARCHAR(15)
);

CREATE TABLE q_def (
    q_def_PK VARCHAR(20) NOT NULL PRIMARY KEY,
    q_def CHAR
);

CREATE TABLE artigo (
    artigo_PK INT NOT NULL PRIMARY KEY,
    artigo INT
);

CREATE TABLE idd_filhos (
    idd_filhos_PK INT NOT NULL PRIMARY KEY,
    idd_filhos INT
);

CREATE TABLE exp_prof (
    exp_prof_PK VARCHAR(300) NOT NULL PRIMARY KEY,
    exp_prof VARCHAR(300)
);
 
ALTER TABLE MORADIA ADD CONSTRAINT FK_MORADIA_2
    FOREIGN KEY (FK_telefone_telefone_PK)
    REFERENCES telefone (telefone_PK)
    ON DELETE NO ACTION;
 
 /*ERRO*/
ALTER TABLE MORADIA ADD CONSTRAINT FK_MORADIA_3
    FOREIGN KEY (FK_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_id_social, FK_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_id_familia, FK_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_id_sensivel, FK_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_cadastro)
    REFERENCES Titulo_eleitor_DJESFSA (id_social, id_familia, id_sensivel, cadastro);
 
ALTER TABLE Titulo_eleitor_DJESFSA ADD CONSTRAINT FK_Titulo_eleitor_DJESFSA_2
    FOREIGN KEY (fk_categ_cnh_categ_cnh_PK)
    REFERENCES categ_cnh (categ_cnh_PK);
 
ALTER TABLE Titulo_eleitor_DJESFSA ADD CONSTRAINT FK_Titulo_eleitor_DJESFSA_3
    FOREIGN KEY (fk_artigo_artigo_PK)
    REFERENCES artigo (artigo_PK);
 
ALTER TABLE Titulo_eleitor_DJESFSA ADD CONSTRAINT FK_Titulo_eleitor_DJESFSA_4
    FOREIGN KEY (fk_exp_prof_exp_prof_PK)
    REFERENCES exp_prof (exp_prof_PK);
 
ALTER TABLE Titulo_eleitor_DJESFSA ADD CONSTRAINT FK_Titulo_eleitor_DJESFSA_5
    FOREIGN KEY (fk_idd_filhos_idd_filhos_PK)
    REFERENCES idd_filhos (idd_filhos_PK);
 
ALTER TABLE Titulo_eleitor_DJESFSA ADD CONSTRAINT FK_Titulo_eleitor_DJESFSA_6
    FOREIGN KEY (fk_q_def_q_def_PK)
    REFERENCES q_def (q_def_PK);
 
ALTER TABLE SIT_TRAB ADD CONSTRAINT FK_SIT_TRAB_2
    FOREIGN KEY (FK_ESCOLAR_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_id_escolar, FK_ESCOLAR_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_id_social, FK_ESCOLAR_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_id_familia, FK_ESCOLAR_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_id_sensivel, FK_ESCOLAR_SOCIAL_FAMILIA_SENSIVEL_ASSISTIDO_cadastro)
    REFERENCES Titulo_eleitor_DJESFSA (id_escolar, id_social, id_familia, id_sensivel, cadastro);
