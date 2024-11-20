// src/components/TelaClient/BoxClient/validations/validateStep7.js

export const validateStep7 = (formData) => {
  const {  numberOfArticles, article } = formData;

  // Verifica se o número de artigos é um número não negativo
  if (numberOfArticles < 0) {
    return false;
  }

  // Se o número de artigos for zero, não precisa validar os artigos
  if (numberOfArticles === 0) {
    return true;
  }

  // Verifica se o número de artigos corresponde ao número de objetos no array article
  if (article.length !== Number(numberOfArticles)) {
    return false;
  }

  // Verifica se todos os artigos têm um numero
  return article.every(article => article.number);
};
