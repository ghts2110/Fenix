import styles from "./ResetPassword.module.css";
import React, { useRef, useState } from "react";

const ResetPassword = () => {

    const form = useRef();

    const changePassword = async (e) => {
        e.preventDefault();
        return true;
    };

    return (
        <section className={styles.forgotPsswd}>
            <div className={styles.formatPage}>
                <img src="/imagems/fenix-logo-app.png" alt="fenix-logo"></img>
                <div
                    className={styles.organizeBox}
                >
                    <div
                        className={styles.boxReset}
                    >
                        <form
                            className={styles.forms}
                            ref={form}
                            onSubmit={changePassword}
                        >
                            <label>
                                Nova senha
                            </label>
                            <input
                                className={styles.newpass}
                                type="password"
                                name="new_password"
                                id="new_password"
                            ></input>
                            <label>
                                Confirmar senha
                            </label>
                            <input
                                className={styles.chckpass}
                                type="password"
                                name="check_password"
                                id="check_password"
                            ></input>
                            <input
                                className={styles.btResetPass}
                                type="submit"
                                name="btResetPass"
                                id="btResetPass"
                                value="Mudar senha"
                            ></input>
                        </form>
                    </div>
                </div>
            </div>
        </section>
    );
}

export default ResetPassword;
