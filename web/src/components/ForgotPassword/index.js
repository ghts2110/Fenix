import { generateOA } from "../../Utils/index.js";
import styles from "./ForgotPassword.module.css";
import emailjs from '@emailjs/browser';

const ForgotPassword = () => {

    var name;
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

    const addRequest = async (auth_code) => {
        const response = await fetch(urlBaseRC, {
            method: "POST",
            headers: headersJson,
            body: JSON.stringify({
                email: document.getElementById("email_to").value,
                AO: auth_code,
            }),
        });

        const data = await response.json();
        console.log(data)
        console.log(response)
    };

    const sendEmail = (e) => {
        e.preventDefault();
        const auth = generateOA();
        const obj = {
            email_to: document.getElementById("email_to").value,
            user_name: name,
            auth_code: auth,
            link_not_recover: "https://cancelrequest/"+auth,
        }

        emailjs
            .send('service_lpzn012', 'template_psqemhp', obj, {
                publicKey: '6JP2avD_8VxlPBkpD',
            })
            .then(
                () => {
                    addRequest(auth);
                    window.open("http://localhost:3000/resetpassword/", "_self");
                },
                (error) => {},
            );
    };

    const checkExistence = (data) => {
        const email = document.getElementById("email_to").value;

        for (const d of data) {
            if (d.email === email) {
                name = d.name;
                return true;
            }
        }
        return false;
    }

    const checkEmail = async (e) => {
        e.preventDefault();

        const response = await fetch(urlBase, {
            method: "GET",
            headers: headers,
        });

        const data = await response.json();
        console.log(data)
        console.log(response)
        if (checkExistence(data.results)) {
            sendEmail(e);
        }
    };

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
