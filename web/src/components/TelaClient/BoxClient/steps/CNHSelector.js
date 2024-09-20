// src/components/TelaClient/BoxClient/steps/CNHSelector.js

import React, { useState } from "react";
import styles from "../BoxClient.module.css";

const CNHSelector = ({ onClose, onSelect }) => {
  const [selectedCategories, setSelectedCategories] = useState([]);

  const handleCheckboxChange = (e) => {
    const { value, checked } = e.target;
    setSelectedCategories((prevCategories) =>
      checked ? [...prevCategories, value] : prevCategories.filter((category) => category !== value)
    );
  };

  const handleConfirm = () => {
    onSelect(selectedCategories);
    onClose();
  };

  return (
    <div className={styles.cnhSelector}>
      <h2>Selecione as Categorias de CNH</h2>
      <div className={styles.cnhOption}>
        <input
          type="checkbox"
          value="A"
          checked={selectedCategories.includes("A")}
          onChange={handleCheckboxChange}
        />
        <label>A</label>
      </div>
      <div className={styles.cnhOption}>
        <input
          type="checkbox"
          value="B"
          checked={selectedCategories.includes("B")}
          onChange={handleCheckboxChange}
        />
        <label>B</label>
      </div>
      <div className={styles.cnhOption}>
        <input
          type="checkbox"
          value="C"
          checked={selectedCategories.includes("C")}
          onChange={handleCheckboxChange}
        />
        <label>C</label>
      </div>
      <div className={styles.cnhOption}>
        <input
          type="checkbox"
          value="D"
          checked={selectedCategories.includes("D")}
          onChange={handleCheckboxChange}
        />
        <label>D</label>
      </div>
      <div className={styles.cnhOption}>
        <input
          type="checkbox"
          value="E"
          checked={selectedCategories.includes("E")}
          onChange={handleCheckboxChange}
        />
        <label>E</label>
      </div>
      <div className={styles.cnhOption}>
        <input
          type="checkbox"
          value="Nenhuma"
          checked={selectedCategories.includes("Nenhuma")}
          onChange={handleCheckboxChange}
        />
        <label>Nenhuma</label>
      </div>
      <button onClick={handleConfirm}>Confirmar</button>
      <button onClick={onClose}>Fechar</button>
    </div>
  );
};

export default CNHSelector;
