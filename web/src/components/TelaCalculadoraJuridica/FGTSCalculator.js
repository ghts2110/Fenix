// src/components/CalculadoraJuridica/FGTSCalculator.js
import React, { useState } from "react";
import styles from "./CalculadoraJuridica.module.css";

function FGTSCalculator() {
  const [salario, setSalario] = useState(0);
  const [resultado, setResultado] = useState(0);

  const calcularFGTS = () => {
    const valorFGTS = salario * 0.08; // Cálculo padrão de FGTS (8% do salário)
    setResultado(valorFGTS);
  };

  return (
    <div className={styles.calculatorContainer}>
      <h2>Calculadora de FGTS</h2>
      <input
        type="number"
        value={salario}
        onChange={(e) => setSalario(e.target.value)}
        placeholder="Digite o salário"
      />
      <button onClick={calcularFGTS}>Calcular</button>
      {resultado > 0 && <p>FGTS: R$ {resultado.toFixed(2)}</p>}
    </div>
  );
}

export default FGTSCalculator;
