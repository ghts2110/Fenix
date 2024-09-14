/// src/components/TelaClient/BoxClient/validations/validateStep2.js

export const validateStep2 = (formData) => {
    return formData.cpf && formData.rg && formData.electoralTitle &&
           formData.votingSection && formData.votingZone &&
           formData.cnhCategory && formData.civilState &&
           formData.hasWorkCard;
  };
  