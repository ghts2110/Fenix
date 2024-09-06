import styles from './TelaDashboard.module.css';
import NavigatePanel from '../NavigatePanel';

function TelaDashboard() {
    return (
        <main className={styles.TelaDashboard}>
            <NavigatePanel></NavigatePanel>
        </main>
    );
}

export default TelaDashboard;