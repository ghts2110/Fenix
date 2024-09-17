// src/components/TelaClient/BoxClient/validations/validateStep7.js
export const validateStep7 = (formData) => {
    const requiredFields = [
      'improvementDate',
      'classGroup',
      'shift',
      'individualAttendanceDate',
      'assistedStatus',
      'basicBasket',
      'familyScreening',
    ];
  
    return requiredFields.every(field => formData[field] !== '');
  };
  