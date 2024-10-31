// src/components/TelaClient/BoxClient/steps/Step8.js
import React from "react";
import styles from "../BoxClient.module.css";
import ArticlesFields from "./ArticlesFields"; // Importa o novo componente

const Step8 = ({ formData, handleChange, handleArticleChange }) => {
  return (
    <>
      <div className={styles.row}>
        <label>
          Número de artigos acusados:
          <input
            type="number"
            name="numberOfArticles"
            value={formData.artigos.length}
            onChange={(e) => {
              const count = Number(e.target.value);
              handleChange(e);
              const newArticles = Array.from({ length: count }, (_, i) => ({ number: "" }));
              handleArticleChange(newArticles);
            }}
            required
          />
        </label>
      </div>
      {formData.artigos.length > 0 && (
        <>
          <h4>Artigos do Código Penal</h4>
          <ArticlesFields 
            articles={formData.artigos}
            handleArticleChange={(index, value) => {
              const updatedArticles = [...formData.artigos];
              updatedArticles[index].number = value;
              handleArticleChange(updatedArticles);
            }}
          />
        </>
      )}
    </>
  );
};

export default Step8;
