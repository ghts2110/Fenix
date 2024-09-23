import React, { useState } from "react";
import styles from "../BoxClient.module.css";

const TurnoSelector = ({ onClose, onSelect }) => {
  const [selectedTurno, setSelectedTurno] = useState("");

  const handleChange = (e) => {
    setSelectedTurno(e.target.value);
  };

  const handleConfirm = () => {
    onSelect(selectedTurno);
    onClose();
  };

  return (
    <div className={styles.turnoSelector}>
      <h2>Selecione o Turno</h2>
      <div className={styles.turnoOption}>
        <input
          type="radio"
          id="manha"
          name="turno"
          value="manha"
          checked={selectedTurno === "manha"}
          onChange={handleChange}
        />
        <label htmlFor="manha">Manhã</label>
      </div>
      <div className={styles.turnoOption}>
        <input
          type="radio"
          id="tarde"
          name="turno"
          value="tarde"
          checked={selectedTurno === "tarde"}
          onChange={handleChange}
        />
        <label htmlFor="tarde">Tarde</label>
      </div>
      <div className={styles.turnoOption}>
        <input
          type="radio"
          id="noite"
          name="turno"
          value="noite"
          checked={selectedTurno === "noite"}
          onChange={handleChange}
        />
        <label htmlFor="noite">Noite</label>
      </div>
      <button onClick={handleConfirm}>Confirmar</button>
      <button onClick={onClose}>Fechar</button>
    </div>
  );
};

export default TurnoSelector;
