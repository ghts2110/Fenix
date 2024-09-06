import styles from './TelaDashboard.module.css';

import NavigatePanel from '../NavigatePanel';

function TelaDashboard() {
    return (
        <main className={styles.TelaDashboard}>
            <NavigatePanel className={styles.item1}/>
        </main>
    );
}

export default TelaDashboard;