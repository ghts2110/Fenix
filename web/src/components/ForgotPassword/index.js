import styles from "./ForgotPassword.module.css";
import React, { useState, useRef } from "react";
import emailjs from '@emailjs/browser';

const ForgotPassword = () => {

    const form = useRef();

    const sendEmail = (e) => {
        e.preventDefault();

        emailjs
            .sendForm('service_lpzn012', 'template_psqemhp', form.current, {
                publicKey: '6JP2avD_8VxlPBkpD',
            })
            .then(
                () => {
                    console.log('SUCCESS!');
                },
                (error) => {
                    console.log('FAILED...', error.text);
                },
            );
    };

    const checkEmail = async (e) => {
        e.preventDefault();

        sendEmail(e);
        // const response = await fetch(urlBase, {
        //     method: "GET",
        //     headers: headers,
        // });

        // const data = await response.json();
        // if (checkExistence(data.results)) {
        // }
        // return false;
    };

    // const checkExistence = (data) => {
    //     const email = document.getElementById("emailRecover").value;

    //     for (const d of data) {
    //         if (d.email === email) {
    //             return true;
    //         }
    //     }

    //     // warn about email not found
    //     return false;
    // }

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

// import React, { useRef } from 'react';
// import emailjs from '@emailjs/browser';

// export const ContactUs = () => {
//   const form = useRef();

//   const sendEmail = (e) => {
//     e.preventDefault();

//     emailjs
//       .sendForm('service_lpzn012', 'template_4fb8dab', form.current, {
//         publicKey: '6JP2avD_8VxlPBkpD',
//       })
//       .then(
//         () => {
//           console.log('SUCCESS!');
//         },
//         (error) => {
//           console.log('FAILED...', error.text);
//         },
//       );
//   };

//   return (
//     <form ref={form} onSubmit={sendEmail}>
//       <label>Name</label>
//       <input type="text" name="user_name" />
//       <label>Email</label>
//       <input type="email" name="user_email" />
//       <label>Message</label>
//       <textarea name="message" />
//       <input type="submit" value="Send" />
//     </form>
//   );
// };

// export default ContactUs;