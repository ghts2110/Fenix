// src/components/TelaClient/BoxClient/validations/validateStep6.js
export const validateStep6 = (formData) => {
    // Exemplo básico de validação, ajuste conforme necessário
    return (
      formData.incident !== "" &&
      formData.currentRegime !== "" &&
      formData.legalStatus !== "" &&
      formData.sentenceDuration !== "" &&
      formData.prisonUnit !== "" &&
      formData.pje !== "" &&
      formData.seeu !== "" &&
      formData.penaltyEndDate !== ""
    );
  };
  