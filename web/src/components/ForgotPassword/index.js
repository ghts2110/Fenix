import styles from "./ForgotPassword.module.css";
import React, { useState, useRef } from "react";
import emailjs from '@emailjs/browser';

// curl -X POST \
// -H "X-Parse-Application-Id: 9oVDtFSi4LvkNyv1ORv3Yy3Xb59v4GpMQLMwpKzt" \
// -H "X-Parse-REST-API-Key: ewQW6PmSaxcJaSTOC5z1iKKBv1P3YzdYU8D72Ump" \
// -H "Content-Type: application/json" \
// -d "{ \"email\":\"A string\",\"dateRequest\":{ \"__type\": \"Date\", \"iso\": \"2018-11-06T18:02:52.249Z\" } }" \
// https://parseapi.back4app.com/classes/RequestChange

const ForgotPassword = () => {

    const urlBase = "https://parseapi.back4app.com/classes/assistido";
    const urlBaseRC = "https://parseapi.back4app.com/classes/RequestChange";
    const headers = {
        "X-Parse-Application-Id": "9oVDtFSi4LvkNyv1ORv3Yy3Xb59v4GpMQLMwpKzt",
        "X-Parse-REST-API-Key": "ewQW6PmSaxcJaSTOC5z1iKKBv1P3YzdYU8D72Ump",
    };
    const headersJson = {
        ...headers,
        "Content-Type": "application/json",
    };

    const addRequest = async () => {
        const response = await fetch(urlBaseRC, {
            method: "POST",
            headers: headersJson,
            body: JSON.stringify({
                email: document.getElementById("email_to").value,
                dateRequest: new Date(),
            }),
        });

        const data = await response.json();

    };

    const form = useRef();

    const sendEmail = (e) => {
        e.preventDefault();

        emailjs
            .sendForm('service_lpzn012', 'template_psqemhp', form.current, {
                publicKey: '6JP2avD_8VxlPBkpD',
            })
            .then(
                () => {
                    addRequest();
                    console.log('SUCCESS!');
                },
                (error) => {
                    console.log('FAILED...', error.text);
                },
            );
    };

    const checkEmail = async (e) => {
        e.preventDefault();

        const response = await fetch(urlBase, {
            method: "GET",
            headers: headers,
        });
        
        const data = await response.json();
        if (checkExistence(data.results)) {
            sendEmail(e);
        }
    };

    const checkExistence = (data) => {
        const email = document.getElementById("email_to").value;

        for (const d of data) {
            if (d.email === email) {
                return true;
            }
        }
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
                        <form
                            ref={form}
                            onSubmit={checkEmail}
                        >
                            <div
                                className={styles.orderInput}
                            >
                                <label
                                    className={styles.label}
                                >E-mail</label>
                                <input
                                    className={styles.emailRecover}
                                    type="email"
                                    name="email_to"
                                    id="email_to"
                                    placeholder="nome@gmail.com"
                                ></input>
                            </div>
                            <input
                                type="submit"
                                className={styles.btRecoverPassword}
                                name="btRecoverPassword"
                                id="btRecoverPassword"
                                value="Recuperar senha"
                            />
                        </form>
                    </div>
                </div>
            </div>
        </section>
    );
}

export default ForgotPassword;
