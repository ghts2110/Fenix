// src/components/TelaClient/BoxClient/steps/Step1.js

import React from "react";
import styles from "../BoxClient.module.css";

const Step1 = ({ formData, handleChange }) => (
  <>
    <div className={styles.row}>
      <label>
        Nome completo:
        <input type="text" name="fullName" value={formData.fullName} onChange={handleChange} required />
      </label>
      <label>
        Nome social:
        <input type="text" name="socialName" value={formData.socialName} onChange={handleChange} required />
      </label>
    </div>
    <div className={styles.row}>
      <label>
        Gênero:
        <select name="gender" value={formData.gender} onChange={handleChange} required>
          <option value="">Selecione</option>
          <option value="feminino">Feminino</option>
          <option value="masculino">Masculino</option>
          <option value="outro">Outro</option>
        </select>
      </label>
      <label>
        Orientação sexual:
        <select name="sexualOrientation" value={formData.sexualOrientation} onChange={handleChange} required>
          <option value="">Selecione</option>
          <option value="heterossexual">Heterossexual</option>
          <option value="homossexual">Homossexual</option>
          <option value="bissexual">Bissexual</option>
          <option value="outro">Outro</option>
        </select>
      </label>
    </div>
    <div className={styles.row}>
      <label>
        Etnia:
        <select name="ethnicity" value={formData.ethnicity} onChange={handleChange} required>
          <option value="">Selecione</option>
          <option value="branca">Branca</option>
          <option value="negra">Negra</option>
          <option value="parda">Parda</option>
          <option value="amarela">Amarela</option>
          <option value="indígena">Indígena</option>
          <option value="outro">Outro</option>
        </select>
      </label>
      <label>
        Data de nascimento:
        <input type="date" name="birthDate" value={formData.birthDate} onChange={handleChange} required />
      </label>
    </div>
    <div className={styles.row}>
      <label>
        Nacionalidade:
        <input type="text" name="nationality" value={formData.nationality} onChange={handleChange} required />
      </label>
      <label>
        Estado natal:
        <input type="text" name="stateOfBirth" value={formData.stateOfBirth} onChange={handleChange} required />
      </label>
    </div>
    <div className={styles.row}>
      <label>
        Cidade natal:
        <input type="text" name="cityOfBirth" value={formData.cityOfBirth} onChange={handleChange} required />
      </label>
      <label>
        Nome do pai:
        <input type="text" name="fatherName" value={formData.fatherName} onChange={handleChange} required />
      </label>
    </div>
    <div className={styles.row}>
      <label>
        Nome da mãe:
        <input type="text" name="motherName" value={formData.motherName} onChange={handleChange} required />
      </label>
    </div>
  </>
);

export default Step1;
