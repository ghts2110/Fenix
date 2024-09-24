// src/components/TelaClient/validations/validateStep5.js
export const validateStep5 = (formData) => {
    // Adicione a lógica de validação para o Step5
    const { hasWorkCard, hasWork, modality, localWork, deficiency,whatDefiecience,readAndWrite,schooling,courseOrSeries } = formData;
    
    if (!hasWorkCard ||!hasWork || !modality || !localWork || !deficiency || !whatDefiecience|| !readAndWrite || !schooling|| !courseOrSeries ) {
      return false; // Se algum campo obrigatório estiver vazio, a validação falha
    }
  
    return true; // Retorne verdadeiro se todos os campos estiverem preenchidos
  };
  