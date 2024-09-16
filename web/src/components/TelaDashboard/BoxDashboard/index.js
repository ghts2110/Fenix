import styles from "./BoxDashboard.module.css";

const DashBoard = () => {
  return (
    <div className={styles.DashBoard}>
      
      <div className={styles.grup1}>
        <div className={styles.UrgentActions}>
          <h3>Casos Urgentes</h3>
          
        </div>

        <div className={styles.performanceGraph}>
          <h3>gráfico de desempenho</h3>
        </div>
      </div>

      <div className={styles.grup2}>
        <div className={styles.CasosUrgentes}>
          <h3>Casos Urgentes</h3>
          
        </div>

        <div className={styles.meeting}>
          <h3>
            próxima reunião
          </h3>
        </div>
      </div>

    </div>
  );
};

export default DashBoard;
