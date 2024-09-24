// src/components/TelaClient/BoxClient/validations/validateStep4.js

export const validateStep4 = (formData) => {
    return formData.contact1 && formData.contact2 && formData.address &&
           formData.neighborhood && formData.currentCity &&
           formData.currentState && formData.cep;
  };
  