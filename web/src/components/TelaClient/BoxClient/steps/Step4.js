// src/components/TelaClient/BoxClient/steps/Step4.js

import React from "react";
import styles from "../BoxClient.module.css";

const Step4 = ({ formData, handleChange }) => (
  <>
    <div className={styles.row}>
      <label>
        Telefone:
        <input type="text" name="phone" value={formData.phone} onChange={handleChange} required />
      </label>
      <label>
        Contato 1:
        <input type="text" name="contact1" value={formData.contact1} onChange={handleChange} required />
      </label>
    </div>
    <div className={styles.row}>
      <label>
        Contato 2:
        <input type="text" name="contact2" value={formData.contact2} onChange={handleChange} required />
      </label>
      <label>
        Endereço:
        <input type="text" name="address" value={formData.address} onChange={handleChange} required />
      </label>
    </div>
    <div className={styles.row}>
      <label>
        Bairro:
        <input type="text" name="neighborhood" value={formData.neighborhood} onChange={handleChange} required />
      </label>
      <label>
        Cidade atual:
        <input type="text" name="currentCity" value={formData.currentCity} onChange={handleChange} required />
      </label>
    </div>
    <div className={styles.row}>
      <label>
        Estado atual:
        <input type="text" name="currentState" value={formData.currentState} onChange={handleChange} required />
      </label>
      <label>
        CEP:
        <input type="text" name="cep" value={formData.cep} onChange={handleChange} required />
      </label>
    </div>
  </>
);

export default Step4;
