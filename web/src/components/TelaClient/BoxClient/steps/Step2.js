// src/components/TelaClient/BoxClient/steps/Step2.js

import React, { useState } from "react";
import styles from "../BoxClient.module.css";
import CNHSelector from "./CNHSelector";

const Step2 = ({ formData, handleChange }) => {
  const [isCNHSelectorOpen, setIsCNHSelectorOpen] = useState(false);
  const [cnhCategories, setCnhCategories] = useState(formData.cnhCategory);

  const openCNHSelector = () => {
    setIsCNHSelectorOpen(true);
  };

  const closeCNHSelector = () => {
    setIsCNHSelectorOpen(false);
  };

  const handleSelectCNH = (categories) => {
    setCnhCategories(categories);
    handleChange({ target: { name: "cnhCategory", value: categories } });
  };

  return (
    <>
      <div className={styles.row}>
        <label>
          CPF:
          <input type="text" name="cpf" value={formData.cpf} onChange={handleChange} required />
        </label>
        <label>
          RG:
          <input type="text" name="rg" value={formData.rg} onChange={handleChange} required />
        </label>
      </div>
      <div className={styles.row}>
        <label>
          Título eleitoral:
          <input type="text" name="electoralTitle" value={formData.electoralTitle} onChange={handleChange} required />
        </label>
        <label>
          Seção de voto:
          <input type="text" name="votingSection" value={formData.votingSection} onChange={handleChange} required />
        </label>
      </div>
      <div className={styles.row}>
        <label>
          Zona de voto:
          <input type="text" name="votingZone" value={formData.votingZone} onChange={handleChange} required />
        </label>
        <label>
          Categoria CNH:
          <button type="button" onClick={openCNHSelector}>Selecione CNH</button>
          <div>
            {cnhCategories.length > 0 ? cnhCategories.join(", ") : "Nenhuma categoria selecionada"}
          </div>
        </label>
      </div>
      <div className={styles.row}>
        <label>
          Estado civil:
          <select name="civilState" value={formData.civilState} onChange={handleChange} required>
            <option value="">Selecione</option>
            <option value="solteiro">Solteiro</option>
            <option value="casado">Casado</option>
            <option value="divorciado">Divorciado</option>
            <option value="viúvo">Viúvo</option>
          </select>
        </label>
      </div>
      {isCNHSelectorOpen && (
        <div className={styles.iframeOverlay}>
          <div className={styles.iframeContent}>
            <CNHSelector onClose={closeCNHSelector} onSelect={handleSelectCNH} />
          </div>
        </div>
      )}
    </>
  );
};

export default Step2;
