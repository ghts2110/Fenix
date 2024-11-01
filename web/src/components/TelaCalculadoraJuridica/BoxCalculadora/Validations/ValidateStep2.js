export const validateStep2 = (formData) => {
  return formData.criteria && formData.updateToDate && formData.rate && formData.startDate;
};
