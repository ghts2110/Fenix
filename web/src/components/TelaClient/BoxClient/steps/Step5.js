// src/components/TelaClient/BoxClient/steps/Step5.js
import React from "react";
import styles from "../BoxClient.module.css";

const Step5 = ({ formData, handleChange }) => {
  return (
    <>
      <div className={styles.row}>
        <label>
          Possui carteira de trabalho?
          <select name="hasWorkCard" value={formData.hasWorkCard} onChange={handleChange} required>
            <option value="">Selecione</option>
            <option value="sim">Sim</option>
            <option value="não">Não</option>
          </select>
        </label>
        <label>
          Possui trabalho?
          <select name="hasWork" value={formData.hasWork} onChange={handleChange} required>
            <option value="">Selecione</option>
            <option value="sim">Sim</option>
            <option value="não">Não</option>
          </select>
        </label>
      </div>
      <div className={styles.row}>
        <label>
          Modalidade de trabalho:
          <input type="text" name="modality" value={formData.modality} onChange={handleChange} required />
        </label>
        <label>
          Local de trabalho:
          <input type="text" name="localWork" value={formData.localWork} onChange={handleChange} required />
        </label>
      </div>
        <div className={styles.row}>
            <label>
                Possui deficiência:
                <select name="deficiency" value={formData.deficiency} onChange={handleChange} required>
                    <option value="">Selecione</option>
                    <option value="sim">Sim</option>
                    <option value="não">Não</option>
                </select>
            </label>

            <label>
                Qual deficiência:
                <input type="text" name="whatDefiecience" value={formData.whatDefiecience} onChange={handleChange} required />
            </label>
        </div>
        <div className={styles.row}>
        <label>
            Sabe lê e escrever:
            <select name="readAndWrite" value={formData.readAndWrite} onChange={handleChange} required>
                <option value="">Selecione</option>
                <option value="sim">Sim</option>
                <option value="não">Não</option>
            </select>
        </label>
        <label>
            grau de escolaridade:
            <select name="schooling" value={formData.schooling} onChange={handleChange} required>
                <option value="">Selecione</option>
                <option value="basico">Básico</option>
                <option value="mdio">Médio</option>
                <option value="tecnico">Técnico</option>
                <option value="superior">Superior</option>
            </select>
        </label>
        </div>
        <div className={styles.row}>
          <label>
            Serie/Curso:
            <input type="text" name="courseOrSeries" value={formData.courseOrSeries} onChange={handleChange} required />
          </label>                 

        </div>    
    </>
  );
};

export default Step5;
