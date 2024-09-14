import styles from "./BoxRegister.module.css";

const Register = () => {
  // criar resistro
  const urlBase = "https://parseapi.back4app.com/classes/assistido";
  const headersJson = {
    "X-Parse-Application-Id": "9oVDtFSi4LvkNyv1ORv3Yy3Xb59v4GpMQLMwpKzt",
    "X-Parse-REST-API-Key": "ewQW6PmSaxcJaSTOC5z1iKKBv1P3YzdYU8D72Ump",
  };
  const addbanck = async (event) => {
    event.preventDefault();
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const position = document.getElementById("position").value;
    const cpf = document.getElementById("cpf").value;
    const password = document.getElementById("password").value;
    const birthDay = document.getElementById("birthDay").value;

    const response = await fetch(urlBase, {
      method: "POST",
      
      headers: headersJson,
      body: JSON.stringify({name:name, email: email, password: password, position:position, cpf:cpf, birthDay:birthDay}),
    });
    const data = await response.json();
    console.log(response);
    console.log(data);
  };

  return (
    <section className={styles.Register}>
      <form>
        <div className={styles.formGroup1}>
          <div className={styles.boxName}>
            <label className={styles.label}>Nome Completo</label>
            <input className={styles.input}
              type="text"
              name="name"
              id="name"
              placeholder="Coloque seu nome"
              required
            />
          </div>

          <div className={styles.boxEmail}>
            <label className={styles.label}>E-mail</label>
            <input className={styles.input}
              type="email"
              name="email"
              id="email"
              placeholder="Coloque seu e-mail"
              required
            />
          </div>
        </div>

        <div className={styles.formGroup1}>
          <div className={styles.boxPosition}>
            <label className={styles.label}>Cargo de Interesse</label>
            <input className={styles.input}
              type="text"
              name="position"
              id="position"
              placeholder="Coloque o cargo que você deseja"
              required
            />
          </div>

          <div className={styles.boxCPF}>
            <label className={styles.label}>CPF</label>
            <input className={styles.input}
              type="text"
              name="cpf"
              id="cpf"
              placeholder="Coloque seu CPF"
              required
            />
          </div>
        </div>

        <div className={styles.formGroup1}>
          <div className={styles.boxPassword}>
            <label className={styles.label}>Senha</label>
            <input className={styles.input}
              type="password"
              name="password"
              id="password"
              placeholder="Coloque sua senha"
              required
            />
          </div>

          <div className={styles.boxBirthDay}>
            <label className={styles.label}>Data de Nascimento</label>
            <input className={styles.input}
              type="date"
              name="birthDay"
              id="birthDay"
              required
            />
          </div>
        </div>

        <button className={styles.btResister} type="submit" onClick={addbanck}>
          Cadastrar
        </button>
      </form>
    </section>
  );
};

export default Register;
