import React, { useState } from "react";
import styles from "./CalculadoraJuridica.module.css";
import FGTSCalculator from "./FGTSCalculator";
import RescisaoCalculator from "./RescisaoCalculator";

function TelaCalculadoraJuridica() {
  const [selectedCalc, setSelectedCalc] = useState("fgts");

  const renderCalculator = () => {
    switch (selectedCalc) {
      case "fgts":
        return <FGTSCalculator />;
      case "rescisao":
        return <RescisaoCalculator />;
      default:
        return <FGTSCalculator />;
    }
  };

  return (
    <div className={styles.calculadoraContainer}>
      <h2>Calculadora Jurídica</h2>
      <div className={styles.selectorContainer}>
        <button onClick={() => setSelectedCalc("fgts")}>Cálculo FGTS</button>
        <button onClick={() => setSelectedCalc("rescisao")}>Cálculo de Rescisão</button>
      </div>
      <div className={styles.calculatorContent}>
        {renderCalculator()}
      </div>
    </div>
  );
}

export default TelaCalculadoraJuridica;
