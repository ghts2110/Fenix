import React, { useEffect, useState } from "react";
import axios from "axios";
import styles from "../BoxClient.module.css";

const Step4 = ({ formData, handleChange }) => {
  const [ufs, setUfs] = useState([]);
  const [cities, setCities] = useState([]);
  const [selectedUf, setSelectedUf] = useState(formData.currentState || "");
  const [selectedCity, setSelectedCity] = useState(formData.currentCity || "");
  const [cep, setCep] = useState(formData.cep || "");

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
    setSelectedCity(''); // Limpa a cidade selecionada
    handleChange(event); // Atualiza o estado do formulário
  };

  const handleSelectCity = (event) => {
    const city = event.target.value;
    setSelectedCity(city);
    handleChange(event); // Atualiza o estado do formulário
  };

  const handleCepChange = (event) => {
    const cepValue = event.target.value;
    setCep(cepValue);

    if (cepValue.length === 8) { // Verifica se o CEP tem 8 dígitos
      axios.get(`https://viacep.com.br/ws/${cepValue}/json/`)
        .then(response => {
          if (response.data.erro) {
            // Handle error if CEP is invalid
            console.error("CEP inválido");
            return;
          }
          // Preenche os campos de endereço com os dados retornados
          const { localidade, uf, bairro, logradouro } = response.data;
          setSelectedUf(uf);
          setSelectedCity(localidade);
          handleChange({ target: { name: "address", value: logradouro } });
          handleChange({ target: { name: "neighborhood", value: bairro } });
          handleChange({ target: { name: "currentState", value: uf } });
          handleChange({ target: { name: "currentCity", value: localidade } });
        })
        .catch(error => {
          console.error("Erro ao buscar o CEP:", error);
        });
    }

    handleChange(event); // Atualiza o estado do formulário
  };

  return (
    <>
      <div className={styles.row}>
        <label>
          Contato 1:
          <input
            type="text"
            name="contact1"
            value={formData.contact1}
            onChange={handleChange}
            required
          />
        </label>
        <label>
          Contato 2:
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
          Contato 3:
          <input
            type="text"
            name="contact3"
            value={formData.contact3}
            onChange={handleChange}
            required
          />
        </label>
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
      </div>
      <div className={styles.row}>
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
        <label>
          Cidade atual:
          <select
            name="currentCity"
            value={selectedCity}
            onChange={handleSelectCity}
            required
            disabled={!selectedUf} // Desativa o seletor de cidades se nenhum estado estiver selecionado
          >
            <option value="">Selecione</option>
            {cities.map((city) => (
              <option key={city.id} value={city.nome}>
                {city.nome}
              </option>
            ))}
          </select>
        </label>
      </div>
      <div className={styles.row}>
        <label>
          Estado atual:
          <select
            name="currentState"
            value={selectedUf}
            onChange={handleSelectUf}
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
        <label>
          CEP:
          <input
            type="text"
            name="cep"
            value={cep}
            onChange={handleCepChange}
            required
          />
        </label>
      </div>
    </>
  );
};

export default Step4;
