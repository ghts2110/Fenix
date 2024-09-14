// src/components/TelaClient/BoxClient/steps/Step2.js

import React from "react";
import styles from "../BoxClient.module.css";

const Step2 = ({ formData, handleChange }) => (
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
        <input type="text" name="cnhCategory" value={formData.cnhCategory} onChange={handleChange} required />
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
      <label>
        Possui carteira de trabalho?
        <select name="hasWorkCard" value={formData.hasWorkCard} onChange={handleChange} required>
          <option value="">Selecione</option>
          <option value="sim">Sim</option>
          <option value="não">Não</option>
        </select>
      </label>
    </div>
  </>
);

export default Step2;
