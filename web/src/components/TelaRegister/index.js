import styles from "./Register.module.css";
import Header from "../Header";
import NavigatePanel from "../NavigatePanel";

function Register() {
  return (
    <main className={styles.TelaDashboard}>
      <div className={styles.container}>
        <NavigatePanel className={styles.item1} />
        <Header
          className={styles.item2}
          pagina="Cadastrar Voluntário"
          name="iago"
          position="lutador de boxe"
          imagem="imagems/iago-de-terno.png"
        />
      </div>
    </main>
  );
}

export default Register;
