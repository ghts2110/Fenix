import styles from "./BoxRegister.module.css";

const Forms = () => {
  return (
    <section className={styles.forms}>
      <forms>
        <div>
          <label for="name">Nome</label>
          <input
            type="text"
            name="name"
            id="name"
            placeholder="Coloque seu nome"
          ></input>

          <label for="email">E-mail</label>
          <input
            type="email"
            name="email"
            id="email"
            placeholder="Coloque seu E-mail"
          ></input>
        </div>

        <div>
          <label for="Position">Cargo</label>
          <input
            type="text"
            name="Position"
            id="Position"
            placeholder="nome@gmail.com"
          ></input>

          <label for="CPF">CPF</label>
          <input
            type="text"
            name="CPF"
            id="CPF"
            placeholder="coloque seu CPF"
          ></input>
        </div>

        <div>
          <label for="password">Senha</label>
          <input
            type="password"
            name="password"
            id="password"
            placeholder="coloque sua senha"
          ></input>

          <label for="">idade</label>
          <input
            type="date"
            name="CPF"
            id="CPF"
            placeholder="coloque seu CPF"
          ></input>
        </div>
      </forms>
    </section>
  );
};

export default Forms;
