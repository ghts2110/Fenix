import Forms from './Forms'; // Caminho relativo correto para Forms
import Banner from './Banner'; // Caminho relativo correto para Banner
import styles from './TelaLogin.module.css';

function TelaLogin() {
    return (
        <main className={styles.telalogin}>
            <Forms className={styles.item2} />
            <Banner className={styles.item1} imagem="fenix-logo" />
        </main>
    );
}

export default TelaLogin;