import React, { useState } from "react";
import styles from "./Boxcalculadora.module.css";
import FGTSCalculator from "./Steps/FGTSCalculator";
import RescisaoCalculator from "./Steps/RescisaoCalculator";

function Boxcalculadora() {
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

export default Boxcalculadora;
