import React, { useEffect, useState, ChangeEvent } from "react";
import axios from "axios";
import styles from "../BoxClient.module.css";

function Step1({ formData, handleChange }) {
  const [ufs, setUfs] = useState([]);
  const [cities, setCities] = useState([]);
  const [selectedUf, setSelectedUf] = useState(formData.stateOfBirth || "");
  const [selectedCity, setSelectedCity] = useState(formData.cityOfBirth || "");

  useEffect(() => {
    // Fetch the list of states (UFs)
    axios.get("https://servicodados.ibge.gov.br/api/v1/localidades/estados/")
      .then(response => {
        setUfs(response.data);
      })
      .catch(error => {
        console.error("Erro ao carregar estados:", error);
      });
  }, []);

  useEffect(() => {
    if (selectedUf === "") {
      setCities([]);
      return;
    }

    // Fetch the list of cities for the selected state
    axios.get(`https://servicodados.ibge.gov.br/api/v1/localidades/estados/${selectedUf}/municipios`)
      .then(response => {
        setCities(response.data);
      })
      .catch(error => {
        console.error("Erro ao carregar cidades:", error);
      });
  }, [selectedUf]);

  const handleSelectUf = (event) => {
    const uf = event.target.value;
    setSelectedUf(uf);
    handleChange(event); // Atualiza o estado do formulário
  };

  const handleSelectCity = (event) => {
    const city = event.target.value;
    setSelectedCity(city);
    handleChange(event); // Atualiza o estado do formulário
  };

  return (
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
            <option value="indigena">Indígena</option>
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
          <select
            name="stateOfBirth"
            value={selectedUf}
            onChange={(e) => {
              handleSelectUf(e);
              setSelectedCity(""); // Limpa a cidade selecionada
            }}
            required
          >
            <option value="">Selecione</option>
            {ufs.map((uf) => (
              <option key={uf.sigla} value={uf.sigla}>
                {uf.nome}
              </option>
            ))}
          </select>
        </label>
      </div>
      <div className={styles.row}>
        <label>
          Cidade natal:
          <select
            name="cityOfBirth"
            value={selectedCity}
            onChange={handleSelectCity}
            required
          >
            <option value="">Selecione</option>
            {cities.map((city) => (
              <option key={city.id} value={city.nome}>
                {city.nome}
              </option>
            ))}
          </select>
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
    </>
  );
}

export default Step1;
