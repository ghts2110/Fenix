import styles from "./Header.module.css"; // Importação do CSS
import { FaBell, FaUserCircle } from "react-icons/fa"; // Font Awesome icons

function Header() {
  return (
    <header className={styles.header}>
        <h1>Painel de Controle</h1>

        <div className={styles.icons}>
            <button className={styles.iconButton} aria-label="Notificações">
                <FaBell className={styles.icon} />
            </button>
            <button className={styles.iconButton} aria-label="Notificações">
                <FaUserCircle className={styles.icon} />
            </button>
      </div>
    </header>
  );
}

export default Header;
