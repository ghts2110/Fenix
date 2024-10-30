package com.fenix.api.services;

import com.fenix.api.models.Telefone;
import com.fenix.api.repositories.TelefoneRepository;
import com.fenix.api.services.exceptions.ResourceNotFoundException;
import com.fenix.api.controller.exeption.Enum.ExceptionEnum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefoneService {

    @Autowired
    private TelefoneRepository telefoneRepository;

    public List<Telefone> findAll() {
        return telefoneRepository.findAll();
    }

    public Telefone findById(Long id) {
        return telefoneRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found));
    }

    public Telefone create(Telefone telefone) {
        return telefoneRepository.save(telefone);
    }

    public Telefone update(Long id, Telefone telefone) {
        Telefone existingTelefone = findById(id);

        if (telefone.getTelefone() != null && !telefone.getTelefone().isEmpty()) {
            existingTelefone.setTelefone(telefone.getTelefone());
        }

        return telefoneRepository.save(existingTelefone);
    }

    public void deleteById(Long id) {
        try {
            telefoneRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found);
        }
    }
}
