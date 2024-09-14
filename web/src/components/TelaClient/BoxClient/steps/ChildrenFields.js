// src/components/TelaClient/BoxClient/steps/ChildrenFields.js
import React from 'react';
import styles from '../BoxClient.module.css';

const ChildrenFields = ({ children, handleChildChange }) => {
  return (
    <>
      {children.map((child, index) => (
        <div key={index} className={styles.childRow}>
          <label>
            Nome do filho {index + 1}:
            <input
              type="text"
              value={child.name}
              onChange={(e) => handleChildChange(index, 'name', e.target.value)}
              required
            />
          </label>
          <label>
            Idade do filho {index + 1}:
            <input
              type="number"
              value={child.age}
              onChange={(e) => handleChildChange(index, 'age', e.target.value)}
              required
            />
          </label>
        </div>
      ))}
    </>
  );
};

export default ChildrenFields;
