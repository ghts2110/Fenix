import styles from "./TelaDashboard.module.css";
import Header from "../Header";
import NavigatePanel from "../NavigatePanel";
import Box from "./BoxDashboard";

function TelaDashboard() {
  return (
    <main className={styles.TelaRegister}>
      <div className={styles.container}>
        <NavigatePanel className={styles.item1} />
        <div className={styles.container2}>
          <Header
            className={styles.item2}
            pagina="Cadastrar Voluntário"
            name="iago"
            position="advogado"
            imagem="imagems/iago-de-terno.png"
          />
          <Box className={styles.item3}/>
        </div>
      </div>
    </main>
  );
}

export default TelaDashboard;
