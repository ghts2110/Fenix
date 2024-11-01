import React, { useState } from 'react';
import styles from './Boxcalculadora.module.css';
import Step1 from './Steps/Step1';
import Step2 from './Steps/Step2';
import { validateStep1 } from './Validations/ValidateStep1';
import { validateStep2 } from './Validations/ValidateStep2';


const Boxcalculadora = () => {
  const [step, setStep] = useState(1);
  const [formData, setFormData] = useState({
    isGeneratingStatement: false,
    processNumber: "",
    plaintiff: "",
    defendant: "",
    agreementPercentage: "",
    criteria: "",
    updateToDate: "",
    rate: "",
    startDate: "",
  });

  const handleChange = (e) => {
    const { name, value, type, checked } = e.target;
    setFormData((prevData) => ({
      ...prevData,
      [name]: type === "checkbox" ? checked : value,
    }));
  };

  const handleNext = () => {
    if (validateStep()) {
      if (step === 2) {
        handleSubmit();
      } else {
        setStep((prevStep) => prevStep + 1);
      }
    } else {
      alert("Por favor, preencha todos os campos obrigatórios.");
    }
  };

  const handlePrevious = () => {
    setStep((prevStep) => prevStep - 1);
  };

  const validateStep = () => {
    switch (step) {
      case 1:
        return validateStep1(formData);
      case 2:
        return validateStep2(formData);
      default:
        return false;
    }
  };

  const handleSubmit = (e) => {
    if (e) e.preventDefault();
    console.log("Form Data Submitted:", formData);
  };

  return (
    <section className={styles.Boxcalculadora}>
      <form onSubmit={handleSubmit} className={styles.form}>
        {step === 1 && <Step1 formData={formData} handleChange={handleChange} />}
        {step === 2 && <Step2 formData={formData} handleChange={handleChange} />}
        <div className={styles.buttonContainer}>
          {step > 1 && <button type="button" onClick={handlePrevious}>Anterior</button>}
          <button type="button" onClick={handleNext}>
            {step === 2 ? 'Finalizar' : 'Próximo'}
          </button>
        </div>
      </form>
    </section>
  );
};

export default Boxcalculadora;
