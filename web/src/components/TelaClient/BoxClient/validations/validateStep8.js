export const validateStep8 = (formData) => {
  // Verifica se pelo menos um artigo foi inserido
  return (
      formData.artigos.length > 0 &&
      formData.artigos.every(article => article.number && article.number.trim() !== '')
  );
};
