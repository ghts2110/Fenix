import { useState } from "react";
import styles from "./BoxAssisted.module.css";

const Assisted = () => {
  const urlBase = "http://localhost:8080/api";
  const headersJson = {
    "Content-Type": "application/json",
  };

  const getArtigo = async (e) => {
    e.preventDefault();
    
    const response = await fetch(`${urlBase}/artigos`, {
      method: "GET",
      headers: headersJson,
    });
    
    const data = await response.json();
    console.log(data)
    console.log(response)
  };

  const getExpProf = async (e) => {
    e.preventDefault();
    
    const response = await fetch(`${urlBase}/expprof`, {
      method: "GET",
      headers: headersJson,
    });
    
    const data = await response.json();
    console.log(data)
    console.log(response)
  };

  const getIddFilhos = async (e) => {
    e.preventDefault();
    
    const response = await fetch(`${urlBase}/iddfilhos`, {
      method: "GET",
      headers: headersJson,
    });
    
    const data = await response.json();
    console.log(data)
    console.log(response)
  };

  const getMoradia = async (e) => {
    e.preventDefault();
    
    const response = await fetch(`${urlBase}/moradia`, {
      method: "GET",
      headers: headersJson,
    });
    
    const data = await response.json();
    console.log(data)
    console.log(response)
  };

  const getQDef = async (e) => {
    e.preventDefault();
    
    const response = await fetch(`${urlBase}/qdef`, {
      method: "GET",
      headers: headersJson,
    });
    
    const data = await response.json();
    console.log(data)
    console.log(response)
  };

  const getSitTrab = async (e) => {
    e.preventDefault();
    
    const response = await fetch(`${urlBase}/sittrab`, {
      method: "GET",
      headers: headersJson,
    });
    
    const data = await response.json();
    console.log(data)
    console.log(response)
  };

  const getTeDjesfsa = async (e) => {
    e.preventDefault();
    
    const response = await fetch(`${urlBase}/tedjesfsa`, {
      method: "GET",
      headers: headersJson,
    });
    
    const data = await response.json();
    console.log(data)
    console.log(response)
  };

  const getTelefoneController = async (e) => {
    e.preventDefault();
    
    const response = await fetch(`${urlBase}/telefone`, {
      method: "GET",
      headers: headersJson,
    });
    
    const data = await response.json();
    console.log(data)
    console.log(response)
  };

  const getUser = async (e) => {
    e.preventDefault();
    
    const response = await fetch(`${urlBase}/users`, {
      method: "GET",
      headers: headersJson,
    });
    
    const data = await response.json();
    console.log(data)
    console.log(response)
  };

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
