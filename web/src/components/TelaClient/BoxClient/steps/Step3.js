// src/components/TelaClient/BoxClient/steps/Step3.js

import React from "react";
import styles from "../BoxClient.module.css";
import ChildrenFields from "./ChildrenFields";

const Step3 = ({ formData, handleChange, handleChildChange }) => (
  <>
    <div className={styles.row}>
      <label>
        Número de filhos:
        <input type="number" name="numberOfChildren" value={formData.numberOfChildren} onChange={handleChange} required />
      </label>
    </div>
    {formData.numberOfChildren > 0 && (
      <>
        <h4>Informações dos filhos</h4>
        {formData.children.map((child, index) => (
          <ChildrenFields
            key={index}
            index={index}
            child={child}
            handleChildChange={handleChildChange}
          />
        ))}
      </>
    )}
  </>
);

export default Step3;
