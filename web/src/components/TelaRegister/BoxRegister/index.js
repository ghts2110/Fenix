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
      body: JSON.stringify({ name: name, email: email, password: password, position: position, cpf: cpf, birthDay: birthDay }),
    });
    const data = await response.json();
    console.log(response);
    console.log(data);
  };

  return (
    <section className={styles.Register}>
      <form>
        <div className={styles.formGroup1}>
          <div className={styles.BoxLabelInput}>
            <label className={styles.label}>Nome Completo</label>
            <input className={styles.input}
              type="text"
              name="name"
              id="name"
              placeholder="Nome"
              required
            />
          </div>

          <div className={styles.BoxLabelInput}>
            <label className={styles.label}>E-mail</label>
            <input className={styles.input}
              type="email"
              name="email"
              id="email"
              placeholder="e-mail"
              required
            />
          </div>
        </div>

        <div className={styles.formGroup1}>
          <div className={styles.BoxLabelInput}>
            <label className={styles.label} htmlFor="position">Cargo de Interesse</label>
            <select
              className={styles.input}
              name="position"
              id="position"
              required
            >
              <option value="" disabled selected>Escolha o cargo</option>
              <option value="juridico">Jurídico</option>
              <option value="financeiro">Financeiro</option>
              <option value="psicossocial">Psicossocial</option>
            </select>
          </div>

          <div className={styles.BoxLabelInput}>
            <label className={styles.label}>CPF</label>
            <input className={styles.input}
              type="text"
              name="cpf"
              id="cpf"
              placeholder="CPF"
              required
            />
          </div>
        </div>

        <div className={styles.formGroup1}>
          <div className={styles.BoxLabelInput}>
            <label className={styles.label}>Senha</label>
            <input className={styles.input}
              type="password"
              name="password"
              id="password"
              placeholder="Senha"
              required
            />
          </div>

          <div className={styles.BoxLabelInput}>
            <label className={styles.label} htmlFor="phoneNumber">Número de telefone</label>
            <input
              className={styles.input}
              type="tel"
              name="phoneNumber"
              id="phoneNumber"
              placeholder="Telefone"
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
