import styles from "./BoxRegister.module.css";
import React, { useState } from "react";

const Register = () => {
  // criar resistro
  const urlBase = "https://parseapi.back4app.com/classes/assistido";
  const headersJson = {
    "X-Parse-Application-Id": "9oVDtFSi4LvkNyv1ORv3Yy3Xb59v4GpMQLMwpKzt",
    "X-Parse-REST-API-Key": "ewQW6PmSaxcJaSTOC5z1iKKBv1P3YzdYU8D72Ump",
  };
  const addbanck = async (event) => {
    event.preventDefault();
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const position = document.getElementById("position").value;
    const cpf = document.getElementById("cpf").value;
    const password = document.getElementById("password").value;
    const birthDay = document.getElementById("birthDay").value;

    const response = await fetch(urlBase, {
      method: "POST",
      
      headers: headersJson,
      body: JSON.stringify({name:name, email: email, password: password, position:position, cpf:cpf, birthDay:birthDay}),
    });
    const data = await response.json();
    console.log(response);
    console.log(data);
  };

  return (
    <section className={styles.Register}>
      <form>
        <div className={styles.formGroup1}>
          <div className={styles.boxName}>
            <label htmlFor="name">Nome Completo</label>
            <input
              type="text"
              name="name"
              id="name"
              placeholder="Coloque seu nome"
              required
            />
          </div>

          <div className={styles.boxEmail}>
            <label htmlFor="email">E-mail</label>
            <input
              type="email"
              name="email"
              id="email"
              placeholder="Coloque seu e-mail"
              required
            />
          </div>
        </div>

        <div className={styles.formGroup1}>
          <div className={styles.boxPosition}>
            <label htmlFor="position">Cargo de Interesse</label>
            <input
              type="text"
              name="position"
              id="position"
              placeholder="Coloque o cargo que você deseja"
              required
            />
          </div>

          <div className={styles.boxCPF}>
            <label htmlFor="cpf">CPF</label>
            <input
              type="text"
              name="cpf"
              id="cpf"
              placeholder="Coloque seu CPF"
              required
            />
          </div>
        </div>

        <div className={styles.formGroup1}>
          <div className={styles.boxPassword}>
            <label htmlFor="password">Senha</label>
            <input
              type="password"
              name="password"
              id="password"
              placeholder="Coloque sua senha"
              required
            />
          </div>

          <div className={styles.boxBirthDay}>
            <label htmlFor="birthDay">Data de Nascimento</label>
            <input
              type="date"
              name="birthDay"
              id="birthDay"
              required
            />
          </div>
        </div>

        <button className={styles.btResister} type="submit" onClick={addbanck}>
          Cadastrar
        </button>
      </form>
    </section>
  );
};

export default Register;
