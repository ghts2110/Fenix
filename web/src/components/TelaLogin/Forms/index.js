import styles from "./Forms.module.css";

const Forms = () => {
  const urlBase = "http://localhost:8080/api/users";
  const headersJson = {
    "Content-Type": "application/json",
  };

  // verificar cadastro
  const carregarTarefas = async () => {
    const response = await fetch(urlBase, {
      method: "GET",
      headers: headersJson,
    });
    const data = await response.json();
    listarTarefas(data.results);
  };

  const openNewWindow = (t) => {
    const params = new URLSearchParams({
      name: t.name,
      position: t.position,
      imagem: t.imagem,
    }).toString();

    window.open(`/dashboard?${params}`, "_self");
  };

  const listarTarefas = (tarefas) => {
    const email = document.getElementById("email").value;
    const password = document.getElementById("senha").value;

    for (const t of tarefas) {
      if (email === t.email) {
        if (password === t.password) {
          openNewWindow(t)
        } else {
          console.log("not ok");
        }
      }
    }
  }

  const handleForgotPasssword = () => {
    window.location.href = "/forgotpassword";
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

export default Forms;
