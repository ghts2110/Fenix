package com.fenix.api.services;

import com.fenix.api.models.ExpProf;
import com.fenix.api.repositories.ExpProfRepository;
import com.fenix.api.services.exceptions.ResourceNotFoundException;
import com.fenix.api.controller.exeption.Enum.ExceptionEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ExpProfService {

    @Autowired
    private ExpProfRepository expProfRepository;

    public List<ExpProf> findAll() {
        return expProfRepository.findAll();
    }

    public ExpProf findById(long id) {
        return expProfRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found));
    }

    public ExpProf create(ExpProf expProf) {
        validateExpProf(expProf);
        return expProfRepository.save(expProf);
    }

    public void deleteById(long id) {
        try {
            expProfRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found);
        }
    }

    public ExpProf update(long id, ExpProf expProf) {
        ExpProf existingExpProf = expProfRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found));
        
        if (expProf.getExpProf() != null && !expProf.getExpProf().isEmpty()) {
            existingExpProf.setExpProf(expProf.getExpProf());
        }
        
        return expProfRepository.save(existingExpProf);
    }

    private void validateExpProf(ExpProf expProf) {
        if (Objects.isNull(expProf.getExpProf()) || expProf.getExpProf().isEmpty()) {
            throw new IllegalArgumentException("Profissão não pode estar vazia");
        }
    }
}
