import styles from "./NavigatePanel.module.css";

function NavigatePanel() {
  return (
    <section className={styles.NavigatePanel_bg}>
      <div className={styles.NavigatePanelContainer}>
        <h1>Fenix</h1>
        <div className={styles.buttonsContainer}>
          <button className={styles.button}>Painel de Controle</button>
          <button className={styles.button}>Processos</button>
          <button className={styles.button}>Cadastro do Cliente</button>
          <button className={styles.button}>Solicitações</button>
          <button className={styles.button}>Configurações</button>
        </div>
      </div>
    </section>
  );
}

export default NavigatePanel;
