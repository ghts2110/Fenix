import styles from "./ForgotPassword.module.css";
import React, { useState } from "react";

const ForgotPassword = () => {
    // let transporter = nodemailer.createTransport(transport[, defaults]);

    const checkEmail = async () => {
        const response = await fetch(urlBase, {
            method: "GET",
            headers: headers,
        });

        const data = await response.json();
        if(checkExistence(data.results)) {

        }
    };

    const checkExistence = (data) => {
        const email = document.getElementById("emailRecover").value;

        for(const d of data) {
            if(d.email === email) {
                return true;
            }
        }

        // warn about email not found
        return false;
    }

    return (
        <section className={styles.forgotPsswd}>
            <div className={styles.formatPage}>
                <img src="/imagems/fenix-logo-app.png" alt="fenix-logo"></img>
                <div
                    className={styles.organizeBox}
                >
                    <div
                        className={styles.boxRecover}
                    >
                        <h1>
                            Auxilio de senha
                        </h1>
                        <div>
                            <h5
                                className={styles.explainText}
                            >
                                Insira o seu endereco de e-mail pessoal
                                e o e-mail corporativo que esta associado
                                a conta Fenix.
                            </h5>
                        </div>
                        <div
                            className={styles.orderInput}
                        >
                            <label 
                                className={styles.label}
                                for="emailRecover"
                            >E-mail</label>
                            <input
                                className={styles.emailRecover}
                                type="email"
                                name="emailRecover"
                                id="emailRecover"
                                placeholder="nome@gmail.com"
                            ></input>
                        </div>
                        <button
                            className={styles.btRecoverPassword}
                            type="submit"
                            name="btRecoverPassword"
                            id="btRecoverPassword"
                            onClick={ checkEmail() }
                        > Recuperar senha</button>
                    </div>
                </div>
            </div>
        </section>
    );
}

export default ForgotPassword;