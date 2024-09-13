import styles from "./Forms.module.css";
import React, { useState } from "react";


const Forms = () => {
  const [login, setLogin] = useState("");
  const [senha, setSenha] = useState("");
  
  const handleSubmit = (event) => {
    
    console.log("Envio");
  };

  return (
    <section className={styles.forms}>
      <h1> Instituto Fenix </h1>
      <p>Bem vindo de volta! Por favor insira as informações de login</p>

      <forms onSubmit={handleSubmit}>
        <div className={styles.textinputs}>
          <label for="email">E-mail</label>
          <input
            type="email"
            name="email"
            onChange={(e) => setLogin(e.target.value)}
            id="email"
            value={login}
            placeholder="nome@gmail.com"
          ></input>

          <label for="senha">Senha</label>
          <input
            type="password"
            name="password"
            onChange={(e) => setSenha(e.target.value)}
            id="senha"
            value={senha}
            placeholder="********"
          ></input>
        </div>

        <div className={styles.links}>
          <div className={styles.conteinerlembrar}>
            <input
              type="checkbox"
              id="lembrar"
              name="lembrar"
              value="true"
            ></input>
            <label for="lembrar">Lembrar-se da senha</label>
          </div>
          <a href=" ">
            <strong>esqueceu senha?</strong>
          </a>
        </div>
        <div className={styles.buttonsLogin}>
          <button
            className={styles.btlogin}
            type="submit"
            name="btlogin"
            id="btlogin"
          >
            Login
          </button>
        </div>
      </forms>
    </section>
  );
}

export default Forms;
