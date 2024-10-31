// src/components/TelaClient/BoxClient/validations/validateStep8.js
export const validateStep8 = (formData) => {
  const requiredFields = [
      'improvementDate',
      'classGroup',
      'shift',
      'individualAttendanceDate',
      'assistedStatus',
      'basicBasket',
      'familyScreening',
      // 'familyScreeningDate' removido pois é opcional
  ];

  // Verifica se todos os campos obrigatórios estão preenchidos
  return requiredFields.every(field => formData[field] !== '');
};
