import styles from "./TelaClient.module.css";
import Header from "../Header";
import NavigatePanel from "../NavigatePanel";
import Box from "./BoxClient";

function TelaClient() {
  return (
    <main className={styles.TelaClient}>
      <div className={styles.container}>
        <NavigatePanel className={styles.item1} />
        <div className={styles.container2}>
          <Header
            className={styles.item2}
            pagina="Cadastro do Cliente"
            name="iago"
            position="lutador de boxe"
            imagem="imagems/iago-de-terno.png"
          />
          <Box className={styles.item3}/>
        </div>
      </div>
    </main>
  );
}

export default TelaClient;
