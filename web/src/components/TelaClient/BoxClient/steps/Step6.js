// src/components/TelaClient/BoxClient/steps/Step6.js
import React from 'react';
import styles from '../BoxClient.module.css';

const Step6 = ({ formData, handleChange }) => {
  return (
    <>
      <div className={styles.row}>
        <label>
          Incidente:
          <select
            name="incident"
            value={formData.incident || ''}
            onChange={handleChange}
            required
          >
            <option value="">Selecione</option>
            <option value="sim">Sim</option>
            <option value="não">Não</option>
          </select>
        </label>

        <label>
          Regime Atual:
          <select
            name="currentRegime"
            value={formData.currentRegime || ''}
            onChange={handleChange}
            required
          >
            <option value="">Selecione</option>
            <option value="aberto">Aberto</option>
            <option value="fechado">Fechado</option>
            <option value="residencial">Residencial</option>
            <option value="outros">Outros</option>
          </select>
        </label>
      </div>

      <div className={styles.row}>
        <label>
          Situação Processual:
          <input
            type="text"
            name="legalStatus"
            value={formData.legalStatus || ''}
            onChange={handleChange}
            required
          />
        </label>

        <label>
          Tempo de Sentença (anos):
          <input
            type="number"
            name="sentenceDuration"
            value={formData.sentenceDuration || ''}
            onChange={handleChange}
            required
          />
        </label>
      </div>

      <div className={styles.row}>
        <label>
          Unidade Prisional:
          <input
            type="text"
            name="prisonUnit"
            value={formData.prisonUnit || ''}
            onChange={handleChange}
            required
          />
        </label>

        <label>
          PJE:
          <input
            type="text"
            name="pje"
            value={formData.pje || ''}
            onChange={handleChange}
          />
        </label>
      </div>

      <div className={styles.row}>
        <label>
          SEEU:
          <input
            type="text"
            name="seeu"
            value={formData.seeu || ''}
            onChange={handleChange}
          />
        </label>

        <label>
          Data de Término da Pena:
          <input
            type="date"
            name="penaltyEndDate"
            value={formData.penaltyEndDate || ''}
            onChange={handleChange}
            required
          />
        </label>
      </div>
    </>
  );
};

export default Step6;
