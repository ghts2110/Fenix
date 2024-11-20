import React, { useState } from "react";
import styles from '../Boxcalculadora.module.css';

function RescisaoCalculator() {
  const [salary, setSalary] = useState("");
  const [notice, setNotice] = useState(false);
  const [rescisao, setRescisao] = useState(0);

  const calculateRescisao = () => {
    const rescisaoValue = notice ? parseFloat(salary) : parseFloat(salary) * 1.4;
    setRescisao(rescisaoValue.toFixed(2));
  };

  return (
    <div>
      <h3>Cálculo de Rescisão</h3>
      <input
        type="number"
        placeholder="Salário Bruto"
        value={salary}
        onChange={(e) => setSalary(e.target.value)}
      />
      <label>
        <input
          type="checkbox"
          checked={notice}
          onChange={() => setNotice(!notice)}
        />
        Aviso Prévio Trabalhado
      </label>
      <button onClick={calculateRescisao}>Calcular Rescisão</button>
      <p>Valor da Rescisão: R$ {rescisao}</p>
    </div>
  );
}

export default RescisaoCalculator;
