package com.fenix.api.services;

import com.fenix.api.models.IddFilhos;
import com.fenix.api.repositories.IddFilhoRepository;
import com.fenix.api.services.exceptions.ResourceNotFoundException;
import com.fenix.api.controller.exeption.Enum.ExceptionEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class IddFilhosService {

    @Autowired
    private IddFilhoRepository IddFilhoRepository;

    public List<IddFilhos> findAll() {
        return IddFilhoRepository.findAll();
    }

    public IddFilhos findById(long id) {
        return IddFilhoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found));
    }

    public IddFilhos create(IddFilhos iddFilhos) {
        validateIddFilhos(iddFilhos);
        return IddFilhoRepository.save(iddFilhos);
    }

    public void deleteById(long id) {
        try {
            IddFilhoRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found);
        }
    }

    public IddFilhos update(long id, IddFilhos iddFilhos) {
        IddFilhos existingIddFilhos = IddFilhoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found));
        
        if (iddFilhos.getIddFilhos() != null) {
            existingIddFilhos.setIddFilhos(iddFilhos.getIddFilhos());
        }
        
        return IddFilhoRepository.save(existingIddFilhos);
    }

    private void validateIddFilhos(IddFilhos iddFilhos) {
        if (Objects.isNull(iddFilhos.getIddFilhos())) {
            throw new IllegalArgumentException("Idade não pode ser nula");
        }
    }
}
