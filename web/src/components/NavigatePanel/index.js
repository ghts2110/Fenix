import styles from "./NavigatePanel.module.css";
import {FaPencilAlt, FaUser, FaCog, FaTasks, FaUserPlus, FaFileAlt } from "react-icons/fa"; // Importando os ícones de usuário, lápis e engrenagem
import {  } from "react-icons/fa"; // Importando ícones
import { useNavigate } from "react-router-dom"; 

function NavigatePanel() {
  const navigate = useNavigate(); 

  const handleDashboardClick = () => {
    navigate("/dashboard"); 
  };

  const handleRegisterClick = () => {
    navigate("/register");
  }

  const handleAssistedClick = () => {
    navigate("/assisted");
  }

  return (
    <section className={styles.NavigatePanel_bg}>
      <div className={styles.NavigatePanelContainer}>
        
        <h1>Fenix</h1>

        <div className={styles.buttonsContainer}>
          <button className={styles.button} onClick={handleDashboardClick}> <FaUser className={styles.icon}/> Painel de Controle</button>          
          
          <button className={styles.button} onClick={handleAssistedClick}> <FaTasks className={styles.icon} /> Assistidos</button>
          
          <button className={styles.button}> <FaUserPlus className={styles.icon} /> Cadastro do Cliente</button>
          <button className={styles.button}> <FaFileAlt className={styles.icon} /> Solicitações</button>

          <button className={styles.button} onClick={handleRegisterClick}> <FaPencilAlt className={styles.icon} /> Cadastrar Voluntário</button>

          <button className={styles.buttonConfig}> <FaCog className={styles.icon} /> Configurações</button>
        </div>
      </div>
    </section>
  );
}

export default NavigatePanel;
