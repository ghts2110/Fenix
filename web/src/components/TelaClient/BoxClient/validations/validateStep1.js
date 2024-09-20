// src/components/TelaClient/BoxClient/validations/validateStep1.js

export const validateStep1 = (formData) => {
    return formData.fullName && formData.socialName && formData.gender &&
           formData.sexualOrientation && formData.ethnicity && formData.birthDate &&
           formData.nationality && formData.stateOfBirth && formData.cityOfBirth &&
           formData.fatherName && formData.motherName;
  };