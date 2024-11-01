// src/components/TelaClient/BoxClient/BoxClient.js
import React, { useState } from 'react';
import styles from './BoxClient.module.css';
import Step1 from './steps/Step1';
import Step2 from './steps/Step2';
import Step3 from './steps/Step3';
import Step4 from './steps/Step4';
import Step5 from './steps/Step5';
import Step6 from './steps/Step6';
import Step7 from './steps/Step7';
import Step8 from './steps/Step8'; // Importando Step8
import ChildrenFields from './steps/ChildrenFields';
import ArticlesFields from './steps/ArticlesFields';
import { validateStep1 } from './validations/validateStep1';
import { validateStep2 } from './validations/validateStep2';
import { validateStep3 } from './validations/validateStep3';
import { validateStep4 } from './validations/validateStep4';
import { validateStep5 } from './validations/validateStep5';
import { validateStep6 } from './validations/validateStep6';
import { validateStep7 } from './validations/validateStep7';
import { validateStep8 } from './validations/validateStep8';




const BoxClient = () => {

  const urlBase = "http://localhost:8080/api";
  const headersJson = {
    "Content-Type": "application/json",
  };

  // // subdividir entre os posts para adicionar corretamente
  // const email = document.getElementById("email").value;
  // const fullName = document.getElementById("fullName").value;
  // const socialName = document.getElementById("socialName").value;
  // const gender = document.getElementById("gender").value;
  // const sexualOrientation = document.getElementById("sexualOrientation").value;
  // const ethnicity = document.getElementById("ethnicity").value;
  // const birthDate = document.getElementById("birthDate").value;
  // const nationality = document.getElementById("nationality").value;
  // const stateOfBirth = document.getElementById("stateOfBirth").value;
  // const cityOfBirth = document.getElementById("cityOfBirth").value;
  // const fatherName = document.getElementById("fatherName").value;
  // const motherName = document.getElementById("motherName").value;
  // const phone = document.getElementById("phone").value;
  // const cpf = document.getElementById("cpf").value;
  // const rg = document.getElementById("rg").value;
  // const electoralTitle = document.getElementById("electoralTitle").value;
  // const votingSection = document.getElementById("votingSection").value;
  // const votingZone = document.getElementById("votingZone").value;
  // const cnhCategory = document.getElementById("cnhCategory").value;
  // const civilState = document.getElementById("civilState").value;
  // const hasWorkCard = document.getElementById("hasWorkCard").value;
  // const readAndWrite = document.getElementById("readAndWrite").value;
  // const schooling = document.getElementById("schooling").value;
  // const courseOrSeries = document.getElementById("courseOrSeries").value;
  // const incident = document.getElementById("incident").value;
  // const currentRegime = document.getElementById("currentRegime").value;
  // const legalStatus = document.getElementById("legalStatus").value;
  // const sentenceDuration = document.getElementById("sentenceDuration").value;
  // const prisonUnit = document.getElementById("prisonUnit").value;
  // const pje = document.getElementById("pje").value;
  // const seeu = document.getElementById("seeu").value;
  // const penaltyEndDate = document.getElementById("penaltyEndDate").value;
  // const improvementDate = document.getElementById("improvementDate").value;
  // const classGroup = document.getElementById("classGroup").value;
  // const shift = document.getElementById("shift").value;
  // const observations1 = document.getElementById("observations1").value;
  // const observations2 = document.getElementById("observations2").value;
  // const individualAttendanceDate = document.getElementById("individualAttendanceDate").value;
  // const assistedStatus = document.getElementById("assistedStatus").value;
  // const basicBasket = document.getElementById("basicBasket").value;
  // const familyScreening = document.getElementById("familyScreening").value;
  // const familyScreeningDate = document.getElementById("familyScreeningDate").value;
  
  // const contact1 = document.getElementById("contact1").value;
  // const contact2 = document.getElementById("contact2").value;

  // const hasWork = document.getElementById("hasWork").value;
  // const modality = document.getElementById("modality").value;
  // const localWork = document.getElementById("localWork").value;

  // const deficiency = document.getElementById("deficiency").value;
  // const whatDefiecience = document.getElementById("whatDefiecience").value;

  // const address = document.getElementById("address").value;
  // const neighborhood = document.getElementById("neighborhood").value;
  // const currentCity = document.getElementById("currentCity").value;
  // const currentState = document.getElementById("currentState").value;
  // const cep = document.getElementById("cep").value;

  // const numberOfChildren = document.getElementById("numberOfChildren").value;
  // const children = document.getElementById("children").value;

  // const professionalExperience = document.getElementById("professionalExperience").value;
  
  // const numberOfArticles = document.getElementById("numberOfArticles").value;
  // const article = document.getElementById("article").value;

  const getArtigo = async (e) => {
    e.preventDefault();

    const response = await fetch(`${urlBase}/artigos`, {
      method: "POST",
      headers: headersJson,
      body: JSON.stringify({

      }),
    });

    const data = await response.json();
    console.log(data)
    console.log(response)
  };

  const getExpProf = async (e) => {
    e.preventDefault();

    const response = await fetch(`${urlBase}/expprof`, {
      method: "POST",
      headers: headersJson,
      body: JSON.stringify({

      }),
    });

    const data = await response.json();
    console.log(data)
    console.log(response)
  };

  const getIddFilhos = async (e) => {
    e.preventDefault();

    const response = await fetch(`${urlBase}/iddfilhos`, {
      method: "POST",
      headers: headersJson,
      body: JSON.stringify({

      }),
    });

    const data = await response.json();
    console.log(data)
    console.log(response)
  };

  const getMoradia = async (e) => {
    e.preventDefault();

    const response = await fetch(`${urlBase}/moradia`, {
      method: "POST",
      headers: headersJson,
      body: JSON.stringify({

      }),
    });

    const data = await response.json();
    console.log(data)
    console.log(response)
  };

  const getQDef = async (e) => {
    e.preventDefault();

    const response = await fetch(`${urlBase}/qdef`, {
      method: "POST",
      headers: headersJson,
      body: JSON.stringify({

      }),
    });

    const data = await response.json();
    console.log(data)
    console.log(response)
  };

  const getSitTrab = async (e) => {
    e.preventDefault();

    const response = await fetch(`${urlBase}/sittrab`, {
      method: "POST",
      headers: headersJson,
      body: JSON.stringify({

      }),
    });

    const data = await response.json();
    console.log(data)
    console.log(response)
  };

  const getTeDjesfsa = async (e) => {
    e.preventDefault();

    const response = await fetch(`${urlBase}/tedjesfsa`, {
      method: "POST",
      headers: headersJson,
      body: JSON.stringify({

      }),
    });

    const data = await response.json();
    console.log(data)
    console.log(response)
  };

  const getTelefoneController = async (e) => {
    e.preventDefault();

    const response = await fetch(`${urlBase}/telefone`, {
      method: "POST",
      headers: headersJson,
      body: JSON.stringify({

      }),
    });

    const data = await response.json();
    console.log(data)
    console.log(response)
  };

  const getUser = async (e) => {
    e.preventDefault();

    const response = await fetch(`${urlBase}/users`, {
      method: "POST",
      headers: headersJson,
      body: JSON.stringify({

      }),
    });

    const data = await response.json();
    console.log(data)
    console.log(response)
  };



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
    cnhCategory: [],
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
    hasWork: "",
    modality: "",
    localWork: "",
    deficiency: "",
    whatDefiecience: "",
    readAndWrite: "",
    schooling: "",
    courseOrSeries: "",
    incident: "",
    currentRegime: "",
    legalStatus: "",
    sentenceDuration: "",
    prisonUnit: "",
    pje: "",
    seeu: "",
    penaltyEndDate: "",
    improvementDate: "",
    classGroup: "",
    shift: "",
    observations1: "",
    observations2: "",
    individualAttendanceDate: "",
    assistedStatus: "",
    basicBasket: "",
    familyScreening: "",
    familyScreeningDate: "",
    professionalExperience: "",
    numberOfArticles: "",
    article: [], // Campo para article
  });

  const handleChange = (e) => {
    const { name, value, type, checked } = e.target;

    if (type === 'checkbox' && name === 'cnhCategory') {
      setFormData((prevData) => {
        const newCategories = checked
          ? [...prevData.cnhCategory, value]
          : prevData.cnhCategory.filter((category) => category !== value);

        return {
          ...prevData,
          cnhCategory: newCategories,
        };
      });
    } else {
      setFormData((prevData) => ({
        ...prevData,
        [name]: value,
      }));
    }
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

  const handleArticleChange = (index, field, value) => {
    const updatedArticle = formData.article.map((article, i) =>
      i === index ? { ...article, [field]: value } : article
    );
    setFormData((prevData) => ({
      ...prevData,
      article: updatedArticle,
    }));
  };

  const handleNext = () => {
    if (validateStep()) {
      if (step === 8) {
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
  const handleNumberOfArticlesChange = (e) => {
    const newNumber = e.target.value;
    setFormData((prevData) => ({
      ...prevData,
      numberOfArticles: newNumber,
      article: Array.from({ length: newNumber }, (_, i) => ({
        number: prevData.article[i]?.number || "",
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
      case 5:
        return validateStep5(formData);
      case 6:
        return validateStep6(formData);
      case 7:
        return validateStep7(formData);
      case 8:
        return validateStep8(formData); // A validação para o Step8 pode ser implementada se necessário
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
        {step === 5 && <Step5 formData={formData} handleChange={handleChange} />}
        {step === 6 && <Step6 formData={formData} handleChange={handleChange} />}

        {step === 7 && (
          <>
            <div className={styles.row}>
              <label>
                Número de Artigos:
                <input
                  type="number"
                  name="numberOfArticles"
                  value={formData.numberOfArticles}
                  onChange={handleNumberOfArticlesChange}
                  required
                />
              </label>
            </div>
            {formData.numberOfArticles > 0 && (
              <ArticlesFields
                article={formData.article}
                handleArticleChange={handleArticleChange}
              />
            )}
          </>
        )}

        {step === 8 && <Step8 formData={formData} handleChange={handleChange} />}

        <div className={styles.buttonContainer}>
          {step > 1 && <button type="button" onClick={handlePrevious}>Anterior</button>}
          <button type="button" onClick={handleNext}>
            {step === 8 ? 'Finalizar' : 'Próximo'}
          </button>
        </div>
      </form>
    </section>
  );
};

export default BoxClient;
