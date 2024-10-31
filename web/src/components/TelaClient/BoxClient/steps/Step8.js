// src/components/TelaClient/BoxClient/steps/Step7.js

import React, { useState } from 'react';
import styles from '../BoxClient.module.css';
import TurnoSelector from './TurnoSelector'; // Importar o novo componente

const Step7 = ({ formData, handleChange }) => {
  const [isTurnoSelectorOpen, setIsTurnoSelectorOpen] = useState(false);
  const [selectedTurno, setSelectedTurno] = useState(formData.shift || '');

  const openTurnoSelector = () => {
    setIsTurnoSelectorOpen(true);
  };

  const closeTurnoSelector = () => {
    setIsTurnoSelectorOpen(false);
  };

  const handleSelectTurno = (turno) => {
    setSelectedTurno(turno);
    handleChange({ target: { name: "shift", value: turno } });
  };

  return (
    <>
      <div className={styles.row}>
        <label>
          Data de Aperfeiçoamento:
          <input
            type="date"
            name="improvementDate"
            value={formData.improvementDate || ''}
            onChange={handleChange}
            required
          />
        </label>

        <label>
          Turma:
          <input
            type="text"
            name="classGroup"
            value={formData.classGroup || ''}
            onChange={handleChange}
            required
          />
        </label>
      </div>

      <div className={styles.row}>
        <label>
          Turno:
          <button type="button" onClick={openTurnoSelector}>
            {selectedTurno ? selectedTurno.charAt(0).toUpperCase() + selectedTurno.slice(1) : "Selecione o turno"}
          </button>
        </label>

        <label>
          Observações:
          <input
            type="text"
            name="observations1"
            value={formData.observations1 || ''}
            onChange={handleChange}
          />
          <input
            type="text"
            name="observations2"
            value={formData.observations2 || ''}
            onChange={handleChange}
          />
        </label>
      </div>

      <div className={styles.row}>
        <label>
          Data do Atendimento Individual:
          <input
            type="date"
            name="individualAttendanceDate"
            value={formData.individualAttendanceDate || ''}
            onChange={handleChange}
            required
          />
        </label>

        <label>
          Status do Assistido:
          <input
            type="text"
            name="assistedStatus"
            value={formData.assistedStatus || ''}
            onChange={handleChange}
            required
          />
        </label>
      </div>

      <div className={styles.row}>
        <label>
          Cesta Básica:
          <select
            name="basicBasket"
            value={formData.basicBasket || ''}
            onChange={handleChange}
            required
          >
            <option value="">Selecione</option>
            <option value="sim">Sim</option>
            <option value="não">Não</option>
          </select>
        </label>

        <label>
          Triagem Familiar:
          <select
            name="familyScreening"
            value={formData.familyScreening || ''}
            onChange={handleChange}
            required
          >
            <option value="">Selecione</option>
            <option value="fez">Fez</option>
            <option value="não fez">Não fez</option>
            <option value="agendada">Está agendada</option>
          </select>
        </label>
      </div>

      <div className={styles.row}>
        <label>
          Data da Triagem Familiar:
          <input
            type="date"
            name="familyScreeningDate"
            value={formData.familyScreeningDate || ''}
            onChange={handleChange}
          />
        </label>

        <label>
          Experiências Profissionais:
          <input
            type="text"
            name="professionalExperience"
            value={formData.professionalExperience || ''}
            onChange={handleChange}
          />
        </label>
      </div>

      {isTurnoSelectorOpen && (
        <div className={styles.iframeOverlay}>
          <div className={styles.iframeContent}>
            <TurnoSelector onClose={closeTurnoSelector} onSelect={handleSelectTurno} />
          </div>
        </div>
      )}
    </>
  );
};

export default Step7;
