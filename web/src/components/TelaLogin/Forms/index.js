import styles from "./Forms.module.css";
import { Link, useNavigate } from 'react-router-dom';

const btLogin = document.getElementById("btlogin");

// btLogin.onclick = loginProcess();

// function checkInput(data) {
//     if(!input.Passw || 
//         input.Passw.trim() === "") {}

//     return true;
// }

// function loginProcess() {
//     const email_id = document.getElementById("email").value;
//     const password_id = document.getElementById("senha").value;

//     let data = {
//         Email: email_id,
//         Passw: password_id
//     };

//     if(checkInput(data)) {
//         // return that the login is wrong
//     }
// }

function Forms(){
    return(
        <section className={styles.forms}>
            <h1> Instituto Fenix </h1>
            <p>Bem vindo de volta! Por favor insira as informações de login</p>
            <forms>
                <div className = {styles.textinputs}>
                    <label for = "email">E-mail</label>
                    <input type = "email" id = "email" name = "email" placeholder = "nome@gmail.com"></input>
                    <label for = "senha">Senha</label>
                    <input type = "password" id = "senha" name = "senha" placeholder = "********"></input>
                </div> 
                <div className={styles.links}>
                    <div className ={styles.conteinerlembrar}>
                        <input type="checkbox" id="lembrar" name="lembrar" value="true"></input>
                        <label for="lembrar">Lembrar-se da senha</label>
                    </div>
                    <a href =" "><strong>esqueceu senha?</strong></a>
                </div>
                <div className = {styles.buttonsLogin}>   
                
                <Link to="/dashboard" className='link'>
                    <button className = {styles.btlogin} type = "submit" name = "btlogin" id = "btlogin">Login</button>
                </Link>

                <button className = {styles.btregistro} type = "submit" name = "btregistro" id ="btregistro">Cadastre-se</button>
                </div>

            </forms>
            
        </section>
    );
}

export default Forms;