import styles from "./BoxRegister.module.css";
import React, { useState } from 'react';

const Register = () => {

  const [formData, setFormData] = useState({
    name: '',
    email: '',
    position: '',
    cpf: '',
    password: '',
    birthDate: '',
  });

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(formData);
    // Aqui você pode implementar a lógica de envio, como uma requisição HTTP
  };

  return (
    <section className={styles.Register}>
      <form onSubmit={handleSubmit}>
        <div className={styles.formGroup1}>
          <div className={styles.boxName}>
            <label htmlFor="name">Nome Completo</label>
            <input
              type="text"
              name="name"
              id="name"
              placeholder="Coloque seu nome"
              value={formData.name}
              onChange={handleChange}
              required
            />
          </div>
          
          <div className={styles.boxEmail}>
            <label htmlFor="email">E-mail</label>
            <input
              type="email"
              name="email"
              id="email"
              placeholder="Coloque seu e-mail"
              value={formData.email}
              onChange={handleChange}
              required
            />
          </div>          
        </div>

        <div className={styles.formGroup1}>
          <div className={styles.boxPosition}>
            <label htmlFor="position">Cargo de Interesse</label>
            <input
              type="text"
              name="position"
              id="position"
              placeholder="Coloque o cargo que você deseja"
              value={formData.position}
              onChange={handleChange}
              required
            />
          </div>

          <div className={styles.boxCPF}>
            <label htmlFor="cpf">CPF</label>
            <input
              type="text"
              name="cpf"
              id="cpf"
              placeholder="Coloque seu CPF"
              value={formData.cpf}
              onChange={handleChange}
              required
            />
          </div>
        </div>
          
        <div className={styles.formGroup1}>
          <div className={styles.boxPassword}>
            <label htmlFor="password">Senha</label>
            <input
              type="password"
              name="password"
              id="password"
              placeholder="Coloque sua senha"
              value={formData.password}
              onChange={handleChange}
              required
            />
          </div>

          <div className={styles.boxPassword}>
            <label htmlFor="birthDate">Data de Nascimento</label>
            <input
              type="date"
              name="birthDate"
              id="birthDate"
              value={formData.birthDate}
              onChange={handleChange}
              required
            />
          </div>
        </div>
          
        <button className={styles.btResister} type="submit">Cadastrar</button>
      </form>
    </section>
  );
};

export default Register;
