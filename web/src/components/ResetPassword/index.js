import styles from "./ResetPassword.module.css";

const ResetPassword = () => {

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

    const removeAuth = async (objid) => {
        const response = await fetch(`${urlBase}/${objid}`, {
            method: "DELETE",
            headers: headers,
        });

        const data = await response.json();
    }

    const updatePass = async (objid) => {
        const response = await fetch(`${urlBase}/${objid}`, {
            method: "PUT",
            headers: headersJson,
            body: JSON.stringify({ password: document.getElementById("new_password") }),
        });

        const data = await response.json();
        console.log(data)
        console.log(response)
    };

    const foundId = (data, email) => {
        for (const d of data) {
            if(d.email === email) {
                updatePass(d.objectId);
                break;
            }
        }
    }

    const updatePassword = async (email) => {
        const response = await fetch(urlBase, {
            method: "GET",
            headers: headers,
        });

        const data = await response.json();
        foundId(data.results, email);
    };

    const checkEqualsPass = () => {
        if (document.getElementById("new_password").value === document.getElementById("check_password").value) {
            return true;
        }
        return false;
    }

    const checkAuthExistence = (data) => {
        const auth = document.getElementById("auth").value;

        for (const d of data) {
            if (d.AO === auth) {
                return {
                    id: d.objectId,
                    email: d.email,
                };
            }
        }

        return null;
    }

    const checkAuth = async () => {
        const response = await fetch(urlBaseRC, {
            method: "GET",
            headers: headers,
        });

        const data = await response.json();
        if (checkAuthExistence(data.results)) {
            return true;
        }
    }

    const changePassword = (e) => {
        e.preventDefault();

        // check AO
        var objId = checkAuth();
        if(objId == null) {
            return false;
        }
        // check equal passwords
        if(!checkEqualsPass()) {
            return false;
        }
        // change database
        updatePassword(objId.email);
        // remove from db
        removeAuth(objId.id);
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
                            onSubmit={changePassword}
                        >
                            <label>
                                Codigo de autenticacao
                            </label>
                            <input
                                className={styles.authCode}
                                type="text"
                                name="auth"
                                id="auth"
                            ></input>
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
