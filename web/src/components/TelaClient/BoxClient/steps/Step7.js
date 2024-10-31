// src/components/TelaClient/BoxClient/steps/Step8.js
import React from "react";
import styles from "../BoxClient.module.css";
import ArticlesFields from "./ArticlesFields";

const Step8 = ({ formData, handleChange, handleArticleChange }) => (
  <>
    <div className={styles.row}>
      <label>
        Número de artigos:
        <input type="number" name="numberOfArticles" value={formData.numberOfArticles} onChange={handleChange} required />
      </label>
    </div>
    
    {formData.numberOfArticles > 0 && (
      <>
        <h4>Informações dos artigos</h4>
        {formData.article.map((article, index) => (
          <ArticlesFields
            key={index}
            index={index}
            child={article}
            handleArticleChange={handleArticleChange}
          />
        ))}
      </>
    )}
  </>
);

export default Step8;
