import styles from "./NavigatePanel.module.css";
import { FaUser, FaCog, FaTasks, FaUserPlus, FaFileAlt } from "react-icons/fa"; // Importando os ícones de usuário, lápis e engrenagem
import {  } from "react-icons/fa"; // Importando ícones


function NavigatePanel() {
  return (
    <section className={styles.NavigatePanel_bg}>
      <div className={styles.NavigatePanelContainer}>
        
        <h1>Fenix</h1>

        <div className={styles.buttonsContainer}>
          <button className={styles.button}> <FaUser className={styles.icon} /> Painel de Controle</button>
          <button className={styles.button}> <FaTasks className={styles.icon} /> Processos</button>
          <button className={styles.button}> <FaUserPlus className={styles.icon} /> Cadastro do Cliente</button>
          <button className={styles.button}> <FaFileAlt className={styles.icon} /> Solicitações</button>
          <button className={styles.buttonConfig}> <FaCog className={styles.icon} /> Configurações</button>
        </div>
      </div>
    </section>
  );
}

export default NavigatePanel;
