import styles from "./BoxDashboard.module.css";
import Chart from "react-apexcharts";

const DashBoard = () => {
  const processos = [
    { numero: "12345", descricao: "Processo sobre revisão de contrato" },
    { numero: "67890", descricao: "Processo sobre pagamento pendente" },
    { numero: "24680", descricao: "Processo sobre rescisão contratual" },
    { numero: "13579", descricao: "Processo sobre alteração cadastral" },
    { numero: "11223", descricao: "Processo sobre envio de documentos" },
  ];

  const chartOptions = {
    chart: {
      type: 'line',
      height: '100%'
    },
    xaxis: {
      categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul'] // Meses
    },
    stroke: {
      curve: 'smooth'
    },
    title: {
      text: 'Desempenho Mensal',
      align: 'left'
    },
    colors: ['#f15124'], // Cor da linha
  };
  
  const chartSeries = [
    {
      name: "Desempenho",
      data: [65, 59, 80, 81, 56, 55, 40] // Dados fictícios
    }
  ];

  const reunioes = [
    { data: "15/09/2024", horario: "14:00", descricao: "Reunião de revisão de projetos" },
    { data: "20/09/2024", horario: "10:00", descricao: "Reunião de alinhamento com a equipe" },
    { data: "25/09/2024", horario: "16:00", descricao: "Reunião de planejamento estratégico" },
    { data: "30/09/2024", horario: "14:00", descricao: "Reunião de revisão de projetos" },
    { data: "5/10/2024", horario: "16:00", descricao: "Reunião de planejamento estratégico" }
  ];

  return (
    <div className={styles.DashBoard}>
      
      <div className={styles.grup1}>
        <div className={styles.Cases}>
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
          <Chart 
            options={chartOptions} 
            series={chartSeries} 
            type="line" 
            height="100%" 
            width="100%" 
          />
        </div>
      </div>

      <div className={styles.grup2}>
        <div className={styles.Cases}>
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
          <h3>próxima reunião</h3>
          <ul className={styles.scrollArea}>
            {reunioes.map((reuniao, index) => (
              <li key={index}>
                <strong>Data:</strong> {reuniao.data} <br />
                <strong>Horário:</strong> {reuniao.horario} <br />
                <strong>Descrição:</strong> {reuniao.descricao}
              </li>
            ))}
          </ul>
        </div>
      </div>

    </div>
  );
};

export default DashBoard;
