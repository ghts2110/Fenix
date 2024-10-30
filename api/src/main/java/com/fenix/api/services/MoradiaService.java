package com.fenix.api.services;

import com.fenix.api.models.MoradiaModel;
import com.fenix.api.repositories.MoradiaRepository;
import com.fenix.api.services.exceptions.ResourceNotFoundException;
import com.fenix.api.controller.exeption.Enum.ExceptionEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MoradiaService {

    @Autowired
    private MoradiaRepository moradiaRepository;

    public List<MoradiaModel> findAll() {
        return moradiaRepository.findAll();
    }

    public MoradiaModel findById(long id) {
        return moradiaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found));
    }

    public MoradiaModel create(MoradiaModel moradiaModel) {
        validateMoradia(moradiaModel);
        return moradiaRepository.save(moradiaModel);
    }

    public void deleteById(long id) {
        try {
            moradiaRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found);
        }
    }

    public MoradiaModel update(long id, MoradiaModel moradiaModel) {
        MoradiaModel existingMoradia = moradiaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found));
        
        if (moradiaModel.getCep() != null && !moradiaModel.getCep().isEmpty()) {
            existingMoradia.setCep(moradiaModel.getCep());
        }
        
        return moradiaRepository.save(existingMoradia);
    }

    private void validateMoradia(MoradiaModel moradiaModel) {
        if (Objects.isNull(moradiaModel.getCep()) || moradiaModel.getCep().isEmpty()) {
            throw new IllegalArgumentException("Endereço não pode estar vazio");
        }
    }
}
