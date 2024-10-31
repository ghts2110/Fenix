// src/components/TelaClient/BoxClient/steps/ArticlesFields.js
import React from "react";
import styles from "../BoxClient.module.css";

const ArticlesFields = ({ articles, handleArticleChange }) => {
  return (
    <>
      {articles.map((article, index) => (
        <div key={index} className={styles.articleRow}>
          <label>
            Artigo {index + 1}:
            <input
              type="text"
              value={article.number}
              onChange={(e) => handleArticleChange(index, e.target.value)}
              required
            />
          </label>
        </div>
      ))}
    </>
  );
};

export default ArticlesFields;
