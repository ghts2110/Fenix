import { useState } from "react";
import styles from "./BoxAssisted.module.css";

const Assisted = () => {
  const processosIniciais = [
    {
      nome: "João Silva",
      processo: "12345",
      descricao: "Processo de revisão contratual.",
    },
    {
      nome: "Maria Oliveira",
      processo: "67890",
      descricao: "Processo sobre pendências financeiras.",
    },
    {
      nome: "Carlos Santos",
      processo: "24680",
      descricao: "Processo de alteração cadastral.",
    },
    {
      nome: "Ana Costa",
      processo: "13579",
      descricao: "Processo de envio de documentos.",
    },
  ];

  // Estado que controla os processos exibidos
  const [processos] = useState(processosIniciais);


  return (
    <section className={styles.Assisted}>
      {processos.map((assistido, index) => (
        <div key={index} className={styles.assistedBox}>
          {assistido.foto && (
            <img
              src={assistido.foto}
              alt={`Foto de ${assistido.nome}`}
              className={styles.assistedPhoto}
            />
          )}
          <h3>{assistido.nome}</h3>
          <p>
            <strong>Número do Processo:</strong> {assistido.processo}
          </p>
          <p>{assistido.descricao}</p>

          <div className={styles.Boxbutton}>
            <button className={styles.assistedButton}>Ver Detalhes</button>
            <button className={styles.assistedButton}>Baixar</button>
          </div>
        </div>
      ))}
    </section>
  );
};

export default Assisted;
