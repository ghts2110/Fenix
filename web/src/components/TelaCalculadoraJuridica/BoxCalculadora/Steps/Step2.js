import React from "react";
import styles from '../Boxcalculadora.module.css';

function Step2({ formData, handleChange }) {
  return (
    <>
      <div className={styles.row}>
        <label>
          Critério:
          <input
            type="text"
            name="criteria"
            value={formData.criteria}
            onChange={handleChange}
            required
          />
        </label>
      </div>
      <div className={styles.row}>
        <label>
          Atualizar para (data-base):
          <input
            type="date"
            name="updateToDate"
            value={formData.updateToDate}
            onChange={handleChange}
            required
          />
        </label>
      </div>
      <div className={styles.row}>
        <label>
          Taxa:
          <input
            type="number"
            name="rate"
            value={formData.rate}
            onChange={handleChange}
            required
          />
        </label>
      </div>
      <div className={styles.row}>
        <label>
          Data início (exemplo: citação):
          <input
            type="date"
            name="startDate"
            value={formData.startDate}
            onChange={handleChange}
            required
          />
        </label>
      </div>
    </>
  );
}

export default Step2;
