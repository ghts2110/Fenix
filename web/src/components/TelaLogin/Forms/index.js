import styles from "./Forms.module.css";
import { useNavigate } from "react-router-dom"; 

const Forms = () => {
  const urlBase = "https://parseapi.back4app.com/classes/assistido";
  const headers = {
    "X-Parse-Application-Id": "9oVDtFSi4LvkNyv1ORv3Yy3Xb59v4GpMQLMwpKzt",
    "X-Parse-REST-API-Key": "ewQW6PmSaxcJaSTOC5z1iKKBv1P3YzdYU8D72Ump",
  };

  // verificar cadastro
  const carregarTarefas = async () => {
    const response = await fetch(urlBase, {
      method: "GET",
      headers: headers,
    });
    const data = await response.json();
    listarTarefas(data.results);
  };

  const listarTarefas = (tarefas) =>{
    const email = document.getElementById("email").value;
    const password = document.getElementById("senha").value;

    for(const t of tarefas){
      if(email === t.email){
        if(password === t.password){
          window.open("/dashboard", "_self");
        }else{
          console.log("not ok");
        }
      }
    }
  }

  const navigate = useNavigate(); 

  const handleForgotPasssword = () => {
    navigate("/forgotpassword");
  }

  return (
    <section className={styles.forms}>
      <h1> Instituto Fenix </h1>
      <p>Bem vindo de volta! Por favor insira as informações de login</p>

      <forms>
        <div className={styles.textinputs}>
          <label for="email">E-mail</label>
          <input
            type="email"
            name="email"
            id="email"
            placeholder="nome@gmail.com"
          ></input>

          <label for="senha">Senha</label>
          <input
            type="password"
            name="password"
            id="senha"
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

          <button className={styles.forgotPassword} onClick={handleForgotPasssword}> esqueceu senha?</button>

        </div>

        <div className={styles.buttonsLogin}>
          <button
            className={styles.btlogin}
            type="submit"
            name="btlogin"
            id="btlogin"
            onClick={carregarTarefas}>
            Login
          </button>
        </div>
      </forms>
    </section>
  );
};

// curl -X POST \
// -H "X-Parse-Application-Id: 9oVDtFSi4LvkNyv1ORv3Yy3Xb59v4GpMQLMwpKzt" \
// -H "X-Parse-REST-API-Key: ewQW6PmSaxcJaSTOC5z1iKKBv1P3YzdYU8D72Ump" \
// -H "Content-Type: application/json" \
// -d "{ \"email\":\"A string\",\"password\":\"A string\" }" \
// https://parseapi.back4app.com/classes/assistido

  // cirar conta no back4app
  // const addbanck = async (event) => {
  //   event.preventDefault();
  //   const email = document.getElementById("email").value;
  //   const password = document.getElementById("senha").value;
  //   const response = await fetch(urlBase, {
  //     method: "POST",
  //     headers: headersJson,
  //     body: JSON.stringify({ email: email, password:password }),
  //   });
  //   const data = await response.json();
  //   console.log(response);
  //   console.log(data);
  // };
export default Forms;
