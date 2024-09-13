import styles from "./Forms.module.css";
import React, { useState } from "react";
import { Link } from "react-router-dom";

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
          <Link to="/forgotpasssword" className="forgotPassword">
            <strong>esqueceu senha?</strong>
          </Link>
        </div>
        <div className={styles.buttonsLogin}>
          {/* remove Link because is a button */}
          <Link to="/dashboard" className="link">
            <button
              className={styles.btlogin}
              type="submit"
              name="btlogin"
              id="btlogin">
              Login
            </button>
          </Link>
        </div>
      </forms>
    </section>
  );
};

export default Forms;
