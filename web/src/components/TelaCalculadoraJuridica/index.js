import styles from "./TelaCalculadora.module.css";
import Header from "../Header";
import NavigatePanel from "../NavigatePanel";
import Box from "./BoxCalculadora";

function TelaCalculadoraJuridica() {
  const urlParams = new URLSearchParams(window.location.search);
  const name = urlParams.get('name') || 'Usuário'; 
  const position = urlParams.get('position') || 'Cargo'; 
  const imagem = urlParams.get('imagem');

  return (
    <main className={styles.TelaCalculadora}>
      <div className={styles.container}>
        <NavigatePanel 
          className={styles.item1} 
          name={name}
          position={position}
          imagem={imagem}
        />
        <div className={styles.container2}>
          <Header
            className={styles.item2}
            pagina="Cadastrar Voluntário"
            name={name}
            position={position}
            imagem={imagem}
          />
          <Box className={styles.item3}/>
        </div>
      </div>
    </main>
  );
}

export default TelaCalculadoraJuridica;
