export const validateStep1 = (formData) => {
    // Se o checkbox estiver marcado, verifica os campos adicionais
    if (formData.isGeneratingStatement) {
      return formData.processNumber && formData.plaintiff && formData.defendant && formData.agreementPercentage;
    }
    return true;
  };
  