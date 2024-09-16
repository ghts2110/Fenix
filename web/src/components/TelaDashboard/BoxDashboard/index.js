import styles from "./BoxDashboard.module.css";

const DashBoard = () => {
  const processos = [
    { numero: "12345", descricao: "Processo sobre revisão de contrato" },
    { numero: "67890", descricao: "Processo sobre pagamento pendente" },
    { numero: "24680", descricao: "Processo sobre rescisão contratual" },
    { numero: "13579", descricao: "Processo sobre alteração cadastral" },
    { numero: "11223", descricao: "Processo sobre envio de documentos" },
  ];

  return (
    <div className={styles.DashBoard}>
      
      <div className={styles.grup1}>
        <div className={styles.UrgentActions}>
          <h3>Casos Urgentes</h3>
          <div className={styles.scrollArea}>
            {processos.map((processo, index) => (
              <button key={index} className={styles.urgentButton}>
                <strong>Processo {processo.numero}</strong>
                <p>{processo.descricao}</p>
              </button>
            ))}
          </div>
        </div>

        <div className={styles.performanceGraph}>
          <h3>gráfico de desempenho</h3>
        </div>
      </div>

      <div className={styles.grup2}>
        <div className={styles.casesToBeResolved}>
          <h3>Casos a Serem Resolvidoss</h3>
          <div className={styles.scrollArea}>
            {processos.map((processo, index) => (
              <button key={index} className={styles.urgentButton}>
                <strong>Processo {processo.numero}</strong>
                <p>{processo.descricao}</p>
              </button>
            ))}
          </div>
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
