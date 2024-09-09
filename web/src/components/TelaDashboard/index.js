import styles from './TelaDashboard.module.css';
import Header from '../Hearder';
import NavigatePanel from '../NavigatePanel';

function TelaDashboard() {
    return (
        <main className={styles.TelaDashboard}>
            <div className={styles.container}>
                <NavigatePanel className={styles.item1}/>
                <Header className={styles.item2} pagina = "Painel de Controle" name="iago" position="lutador de boxe" imagem="iago-de-terno"/>
            </div>
        </main>
    );
}

export default TelaDashboard;