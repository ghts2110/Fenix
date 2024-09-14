import React, { useState } from "react";
import styles from "./BoxClient.module.css";

const Client = () => {
  const [step, setStep] = useState(1); // Controla a etapa atual do formulário
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
    children: [], // Array para armazenar dados dos filhos
    contact1: "",
    contact2: "",
    address: "",
    neighborhood: "",
    currentCity: "",
    currentState: "",
    cep: "",
  });

  // Atualiza os dados do formulário com base no nome do campo
  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({
      ...prevData,
      [name]: value,
    }));
  };

  // Atualiza dados específicos de cada filho
  const handleChildChange = (index, field, value) => {
    const updatedChildren = formData.children.map((child, i) =>
      i === index ? { ...child, [field]: value } : child
    );
    setFormData((prevData) => ({
      ...prevData,
      children: updatedChildren,
    }));
  };

  // Valida se todos os campos da etapa 1 estão preenchidos
  const validateStep1 = () => {
    const {
      fullName, socialName, gender, sexualOrientation, ethnicity,
      birthDate, nationality, stateOfBirth, cityOfBirth, fatherName, motherName
    } = formData;
    return (
      fullName && socialName && gender && sexualOrientation && ethnicity &&
      birthDate && nationality && stateOfBirth && cityOfBirth && fatherName && motherName
    );
  };

  // Valida se todos os campos da etapa 2 estão preenchidos
  const validateStep2 = () => {
    const {
      cpf, rg, electoralTitle, votingSection, votingZone, cnhCategory, civilState, hasWorkCard
    } = formData;
    return (
      cpf && rg && electoralTitle && votingSection && votingZone && cnhCategory && civilState && hasWorkCard
    );
  };

  // Valida se todos os campos da etapa 3 estão preenchidos
  const validateStep3 = () => {
    const { numberOfChildren, children } = formData;
    return (
      numberOfChildren !== "" &&
      children.length === parseInt(numberOfChildren, 10) &&
      children.every(child => child.name && child.age)
    );
  };

  // Valida se todos os campos da etapa 4 estão preenchidos
  const validateStep4 = () => {
    const { contact1, contact2, address, neighborhood, currentCity, currentState, cep } = formData;
    return (
      contact1 && contact2 && address && neighborhood && currentCity && currentState && cep
    );
  };

  // Avança para a próxima etapa com validação
  const handleNext = () => {
    if (step === 1 && validateStep1()) {
      setStep((prevStep) => prevStep + 1);
    } else if (step === 2 && validateStep2()) {
      setStep((prevStep) => prevStep + 1);
    } else if (step === 3 && validateStep3()) {
      setStep((prevStep) => prevStep + 1);
    } else if (step === 4 && validateStep4()) {
      handleSubmit();
    } else {
      // Se a validação falhar
      alert("Por favor, preencha todos os campos obrigatórios.");
    }
  };

  // Volta para a etapa anterior
  const handlePrevious = () => {
    setStep((prevStep) => prevStep - 1);
  };

  // Gera campos para os filhos com base no número informado
  const generateChildrenFields = () => {
    const numberOfChildren = parseInt(formData.numberOfChildren, 10);
    const childrenFields = [];
    for (let i = 0; i < numberOfChildren; i++) {
      childrenFields.push(
        <div key={i} className={styles.childRow}>
          <label>
            Nome do filho {i + 1}:
            <input
              type="text"
              value={formData.children[i]?.name || ""}
              onChange={(e) => handleChildChange(i, 'name', e.target.value)}
              required
            />
          </label>
          <label>
            Idade do filho {i + 1}:
            <input
              type="number"
              value={formData.children[i]?.age || ""}
              onChange={(e) => handleChildChange(i, 'age', e.target.value)}
              required
            />
          </label>
        </div>
      );
    }
    return childrenFields;
  };

  // Submete os dados do formulário
  const handleSubmit = (e) => {
    if (e) e.preventDefault();
    // Submeter os dados
    console.log("Form Data Submitted:", formData);
  };

  return (
    <section className={styles.Client}>
      <form onSubmit={handleSubmit} className={styles.form}>
        {/* Início da Primeira Etapa */}
        {step === 1 && (
          <>
            <div className={styles.row}>
              <label>
                Nome completo:
                <input
                  type="text"
                  name="fullName"
                  value={formData.fullName}
                  onChange={handleChange}
                  required
                />
              </label>
              <label>
                Nome social:
                <input
                  type="text"
                  name="socialName"
                  value={formData.socialName}
                  onChange={handleChange}
                  required
                />
              </label>
            </div>
            <div className={styles.row}>
              <label>
                Gênero:
                <select
                  name="gender"
                  value={formData.gender}
                  onChange={handleChange}
                  required
                >
                  <option value="">Selecione</option>
                  <option value="feminino">Feminino</option>
                  <option value="masculino">Masculino</option>
                  <option value="outro">Outro</option>
                </select>
              </label>
              <label>
                Orientação sexual:
                <select
                  name="sexualOrientation"
                  value={formData.sexualOrientation}
                  onChange={handleChange}
                  required
                >
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
                <select
                  name="ethnicity"
                  value={formData.ethnicity}
                  onChange={handleChange}
                  required
                >
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
                <input
                  type="date"
                  name="birthDate"
                  value={formData.birthDate}
                  onChange={handleChange}
                  required
                />
              </label>
            </div>
            <div className={styles.row}>
              <label>
                Nacionalidade:
                <input
                  type="text"
                  name="nationality"
                  value={formData.nationality}
                  onChange={handleChange}
                  required
                />
              </label>
              <label>
                Estado natal:
                <input
                  type="text"
                  name="stateOfBirth"
                  value={formData.stateOfBirth}
                  onChange={handleChange}
                  required
                />
              </label>
            </div>
            <div className={styles.row}>
              <label>
                Cidade natal:
                <input
                  type="text"
                  name="cityOfBirth"
                  value={formData.cityOfBirth}
                  onChange={handleChange}
                  required
                />
              </label>
              <label>
                Nome do pai:
                <input
                  type="text"
                  name="fatherName"
                  value={formData.fatherName}
                  onChange={handleChange}
                  required
                />
              </label>
            </div>
            <div className={styles.row}>
              <label>
                Nome da mãe:
                <input
                  type="text"
                  name="motherName"
                  value={formData.motherName}
                  onChange={handleChange}
                  required
                />
              </label>
            </div>
            <div className={styles.buttonContainer}>
              <button type="button" onClick={handleNext}>Próximo</button>
            </div>
          </>
        )}
        {/* Fim da Primeira Etapa */}

        {/* Início da Segunda Etapa */}
        {step === 2 && (
          <>
            <div className={styles.row}>
              <label>
                CPF:
                <input
                  type="text"
                  name="cpf"
                  value={formData.cpf}
                  onChange={handleChange}
                  required
                />
              </label>
              <label>
                RG:
                <input
                  type="text"
                  name="rg"
                  value={formData.rg}
                  onChange={handleChange}
                  required
                />
              </label>
            </div>
            <div className={styles.row}>
              <label>
                Título eleitoral:
                <input
                  type="text"
                  name="electoralTitle"
                  value={formData.electoralTitle}
                  onChange={handleChange}
                  required
                />
              </label>
              <label>
                Seção de voto:
                <input
                  type="text"
                  name="votingSection"
                  value={formData.votingSection}
                  onChange={handleChange}
                  required
                />
              </label>
            </div>
            <div className={styles.row}>
              <label>
                Zona de voto:
                <input
                  type="text"
                  name="votingZone"
                  value={formData.votingZone}
                  onChange={handleChange}
                  required
                />
              </label>
              <label>
                Categoria CNH:
                <select
                  name="cnhCategory"
                  value={formData.cnhCategory}
                  onChange={handleChange}
                  required
                >
                  <option value="">Selecione</option>
                  <option value="a">Categoria A</option>
                  <option value="b">Categoria B</option>
                  <option value="c">Categoria C</option>
                  <option value="d">Categoria D</option>
                  <option value="e">Categoria E</option>
                </select>
              </label>
            </div>
            <div className={styles.row}>
              <label>
                Carteira de trabalho:
                <select
                  name="hasWorkCard"
                  value={formData.hasWorkCard}
                  onChange={handleChange}
                  required
                >
                  <option value="">Selecione</option>
                  <option value="possui">Possui</option>
                  <option value="naoPossui">Não possui</option>
                </select>
              </label>
              <label>
                Estado Civil:
                <select
                  name="civilState"
                  value={formData.civilState}
                  onChange={handleChange}
                  required
                >
                  <option value="">Selecione</option>
                  <option value="solteiro">Solteiro</option>
                  <option value="casado">Casado</option>
                  <option value="viuvo">Viúvo</option>
                </select>
              </label>
            </div>
            <div className={styles.buttonContainer}>
              <button type="button" onClick={handlePrevious}>Anterior</button>
              <button type="button" onClick={handleNext}>Próximo</button>
            </div>
          </>
        )}
        {/* Fim da Segunda Etapa */}

        {/* Início da Terceira Etapa */}
        {step === 3 && (
          <>
            <div className={styles.row}>
              <label>
                Número de filhos:
                <input
                  type="number"
                  name="numberOfChildren"
                  value={formData.numberOfChildren}
                  onChange={(e) => {
                    const newNumber = e.target.value;
                    setFormData((prevData) => ({
                      ...prevData,
                      numberOfChildren: newNumber,
                      children: Array.from({ length: newNumber }, (_, i) => ({
                        name: prevData.children[i]?.name || "",
                        age: prevData.children[i]?.age || "",
                      })),
                    }));
                  }}
                  required
                />
              </label>
            </div>
            {formData.numberOfChildren > 0 && generateChildrenFields()}
            <div className={styles.buttonContainer}>
              <button type="button" onClick={handlePrevious}>Anterior</button>
              <button type="button" onClick={handleNext}>Próximo</button>
            </div>
          </>
        )}
        {/* Fim da Terceira Etapa */}

        {/* Início da Quarta Etapa */}
        {step === 4 && (
          <>
            <div className={styles.row}>
              <label>
                Contato telefônico 1:
                <input
                  type="text"
                  name="contact1"
                  value={formData.contact1}
                  onChange={handleChange}
                  required
                />
              </label>
              <label>
                Contato telefônico 2:
                <input
                  type="text"
                  name="contact2"
                  value={formData.contact2}
                  onChange={handleChange}
                  required
                />
              </label>
            </div>
            <div className={styles.row}>
              <label>
                Endereço:
                <input
                  type="text"
                  name="address"
                  value={formData.address}
                  onChange={handleChange}
                  required
                />
              </label>
              <label>
                Bairro:
                <input
                  type="text"
                  name="neighborhood"
                  value={formData.neighborhood}
                  onChange={handleChange}
                  required
                />
              </label>
            </div>
            <div className={styles.row}>
              <label>
                Cidade atual:
                <input
                  type="text"
                  name="currentCity"
                  value={formData.currentCity}
                  onChange={handleChange}
                  required
                />
              </label>
              <label>
                Estado atual:
                <input
                  type="text"
                  name="currentState"
                  value={formData.currentState}
                  onChange={handleChange}
                  required
                />
              </label>
            </div>
            <div className={styles.row}>
              <label>
                CEP:
                <input
                  type="text"
                  name="cep"
                  value={formData.cep}
                  onChange={handleChange}
                  required
                />
              </label>
            </div>
            <div className={styles.buttonContainer}>
              <button type="button" onClick={handlePrevious}>Anterior</button>
              <button type="button" onClick={handleNext}>Finalizar</button>
            </div>
          </>
        )}
        {/* Fim da Quarta Etapa */}
      </form>
    </section>
  );
};

export default Client;
