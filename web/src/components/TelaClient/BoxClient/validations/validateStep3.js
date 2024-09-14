// src/components/TelaClient/BoxClient/validations/validateStep3.js

export const validateStep3 = (formData) => {
    const { numberOfChildren, children } = formData;
  
    // Verifica se o número de filhos é um número não negativo
    if (numberOfChildren < 0) {
      return false;
    }
  
    // Se o número de filhos for zero, não precisa validar os filhos
    if (numberOfChildren === 0) {
      return true;
    }
  
    // Verifica se o número de filhos corresponde ao número de objetos no array children
    if (children.length !== Number(numberOfChildren)) {
      return false;
    }
  
    // Verifica se todos os filhos têm um nome e uma idade
    return children.every(child => child.name && child.age);
  };
  