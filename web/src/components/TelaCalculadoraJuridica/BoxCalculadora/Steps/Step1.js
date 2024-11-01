import React, { useState } from "react";
import styles from '../Boxcalculadora.module.css';

function Step1({ formData, handleChange }) {
  const [isGeneratingStatement, setIsGeneratingStatement] = useState(formData.isGeneratingStatement || false);

  const handleCheckboxChange = (event) => {
    setIsGeneratingStatement(event.target.checked);
    handleChange(event);
  };

  return (
    <>
      <div className={styles.row}>
        <label>
          <input
            type="checkbox"
            name="isGeneratingStatement"
            checked={isGeneratingStatement}
            onChange={handleCheckboxChange}
          />
          Gerar Demonstrativo para Requisição de Pagamento
        </label>
      </div>
      {isGeneratingStatement && (
        <>
          <div className={styles.row}>
            <label>
              Número do processo:
              <input
                type="text"
                name="processNumber"
                value={formData.processNumber}
                onChange={handleChange}
                required
              />
            </label>
          </div>
          <div className={styles.row}>
            <label>
              Autor do processo:
              <input
                type="text"
                name="plaintiff"
                value={formData.plaintiff}
                onChange={handleChange}
                required
              />
            </label>
          </div>
          <div className={styles.row}>
            <label>
              Réu do processo:
              <input
                type="text"
                name="defendant"
                value={formData.defendant}
                onChange={handleChange}
                required
              />
            </label>
          </div>
          <div className={styles.row}>
            <label>
              Percentual de acordo:
              <input
                type="number"
                name="agreementPercentage"
                value={formData.agreementPercentage}
                onChange={handleChange}
                required
              />
            </label>
          </div>
        </>
      )}
    </>
  );
}

export default Step1;
