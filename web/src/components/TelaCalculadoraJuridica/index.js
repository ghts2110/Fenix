import styles from "./TelaCalculadora.module.css";
import Header from "../Header";
import NavigatePanel from "../NavigatePanel";
import Box from "./BoxCalculadora";

function TelaCalculadoraJuridica() {
  return (
    <main className={styles.TelaCalculadora}>
      <div className={styles.container}>
        <NavigatePanel className={styles.item1} />
        <div className={styles.container2}>
          <Header
            className={styles.item2}
            pagina="calculadora juridica"
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

export default TelaCalculadoraJuridica;
