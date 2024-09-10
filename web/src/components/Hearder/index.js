import styles from "./Header.module.css"; // Importação do CSS
import { useState } from "react";
import { FaBell, FaChevronDown} from "react-icons/fa"; // Font Awesome icons

function Header({ pagina, name, position, imagem}) {
  const [showTooltip, setShowTooltip] = useState(false); // Estado para mostrar/ocultar tooltip

  const toggleTooltip = () => {
    setShowTooltip(!showTooltip); // Alterna a visibilidade do tooltip
  };

  return (
    <header className={styles.header}>
      <h1>{pagina}</h1>

      <div className={styles.icons}>
        <button
          className={styles.iconButton}
          aria-label="Notificações"
          onClick={toggleTooltip}
        >
          <FaBell className={styles.icon} />
        </button>

        {showTooltip && ( // Exibe o tooltip se showTooltip for true
          <div className={styles.tooltip}>
            <p>Você tem 3 novas notificações</p>
            <ul>
              <li>Notificação 1</li>
              <li>Notificação 2</li>
              <li>Notificação 3</li>
            </ul>
          </div>
        )}

        <div className={styles.profileBox}>
          <img
            src={imagem}
            alt="Foto do Usuário"
            className={styles.profileImage}
          />
          
          <div className={styles.profileInfo}>
            <span className={styles.profileName}>{name}</span>
            <span className={styles.profileRole}>{position}</span>
          </div>
          <button className={styles.arrowButton}>
            <FaChevronDown />
          </button>
        </div>
      </div>
    </header>
  );
}

export default Header;
