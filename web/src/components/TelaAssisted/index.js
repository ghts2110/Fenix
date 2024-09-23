import styles from "./Assisted.module.css";
import Header from "../Header";
import NavigatePanel from "../NavigatePanel";
import Box from "./BoxAssisted";

function Assisted() {
  return (
    <main className={styles.Assisted}>
      <div className={styles.container}>
        <NavigatePanel className={styles.item1} />
        <div className={styles.container2}>
          <Header
            className={styles.item2}
            pagina="Assistidos"
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

export default Assisted;
