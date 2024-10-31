// src/components/TelaClient/BoxClient/steps/ArticlesFields.js
import React from 'react';
import styles from '../BoxClient.module.css';

const ArticlesFields = ({ article, handleArticleChange }) => {
  return (
    <>
      {article.map((article, index) => (
        <div key={index} className={styles.childRow}>
          <label>
            Numero do artigo {index + 1}:
            <input
              type="number"
              value={article.number}
              onChange={(e) => handleArticleChange(index, 'number', e.target.value)}
              required
            />
          </label>
        </div>
      ))}
    </>
  );
};

export default ArticlesFields;
