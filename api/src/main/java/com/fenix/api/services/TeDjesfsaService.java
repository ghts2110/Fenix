package com.fenix.api.services;

import com.fenix.api.models.TeDjesfsa;
import com.fenix.api.repositories.TeDjesfsaRepository;
import com.fenix.api.services.exceptions.ResourceNotFoundException;
import com.fenix.api.controller.exeption.Enum.ExceptionEnum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeDjesfsaService {

    @Autowired
    private TeDjesfsaRepository teDjesfsaRepository;

    public List<TeDjesfsa> findAll() {
        return teDjesfsaRepository.findAll();
    }

    public TeDjesfsa findById(Long id) {
        return teDjesfsaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found));
    }

    public TeDjesfsa create(TeDjesfsa teDjesfsa) {
        return teDjesfsaRepository.save(teDjesfsa);
    }

    public TeDjesfsa update(Long id, TeDjesfsa teDjesfsa) {
        TeDjesfsa existingTeDjesfsa = findById(id);

        if (teDjesfsa.getArtigo() != null && !teDjesfsa.getArtigo().isEmpty()) {
            existingTeDjesfsa.setArtigo(teDjesfsa.getArtigo());
        }

        return teDjesfsaRepository.save(existingTeDjesfsa);
    }

    public void deleteById(Long id) {
        try {
            teDjesfsaRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found);
        }
    }
}
