import React, { useState } from "react";
import styles from "./BoxClient.module.css";
import Step1 from "./steps/Step1";
import Step2 from "./steps/Step2";
import Step3 from "./steps/Step3";
import Step4 from "./steps/Step4";
import ChildrenFields from "./steps/ChildrenFields";
import { validateStep1 } from "./validations/validateStep1";
import { validateStep2 } from "./validations/validateStep2";
import { validateStep3 } from "./validations/validateStep3";
import { validateStep4 } from "./validations/validateStep4";

const BoxClient = () => {
  const [step, setStep] = useState(1);
  const [formData, setFormData] = useState({
    email: "",
    fullName: "",
    socialName: "",
    gender: "",
    sexualOrientation: "",
    ethnicity: "",
    birthDate: "",
    nationality: "",
    stateOfBirth: "",
    cityOfBirth: "",
    fatherName: "",
    motherName: "",
    phone: "",
    cpf: "",
    rg: "",
    electoralTitle: "",
    votingSection: "",
    votingZone: "",
    cnhCategory: "",
    civilState: "",
    hasWorkCard: "",
    numberOfChildren: "",
    children: [],
    contact1: "",
    contact2: "",
    address: "",
    neighborhood: "",
    currentCity: "",
    currentState: "",
    cep: "",
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({
      ...prevData,
      [name]: value,
    }));
  };

  const handleChildChange = (index, field, value) => {
    const updatedChildren = formData.children.map((child, i) =>
      i === index ? { ...child, [field]: value } : child
    );
    setFormData((prevData) => ({
      ...prevData,
      children: updatedChildren,
    }));
  };

  const handleNext = () => {
    if (validateStep()) {
      if (step === 4) {
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

  const handleNumberOfChildrenChange = (e) => {
    const newNumber = e.target.value;
    setFormData((prevData) => ({
      ...prevData,
      numberOfChildren: newNumber,
      children: Array.from({ length: newNumber }, (_, i) => ({
        name: prevData.children[i]?.name || "",
        age: prevData.children[i]?.age || "",
      })),
    }));
  };

  const validateStep = () => {
    switch (step) {
      case 1:
        return validateStep1(formData);
      case 2:
        return validateStep2(formData);
      case 3:
        return validateStep3(formData);
      case 4:
        return validateStep4(formData);
      default:
        return false;
    }
  };

  const handleSubmit = (e) => {
    if (e) e.preventDefault();
    console.log("Form Data Submitted:", formData);
  };

  return (
    <section className={styles.BoxClient}>
      <form onSubmit={handleSubmit} className={styles.form}>
        {step === 1 && <Step1 formData={formData} handleChange={handleChange} />}
        {step === 2 && <Step2 formData={formData} handleChange={handleChange} />}
        {step === 3 && (
          <>
            <div className={styles.row}>
              <label>
                Número de filhos:
                <input
                  type="number"
                  name="numberOfChildren"
                  value={formData.numberOfChildren}
                  onChange={handleNumberOfChildrenChange}
                  required
                />
              </label>
            </div>
            {formData.numberOfChildren > 0 && (
              <ChildrenFields
                children={formData.children}
                handleChildChange={handleChildChange}
              />
            )}
          </>
        )}
        {step === 4 && <Step4 formData={formData} handleChange={handleChange} />}
        <div className={styles.buttonContainer}>
          {step > 1 && <button type="button" onClick={handlePrevious}>Anterior</button>}
          <button type="button" onClick={handleNext}>
            {step === 4 ? 'Finalizar' : 'Próximo'}
          </button>
        </div>
      </form>
    </section>
  );
};

export default BoxClient;
