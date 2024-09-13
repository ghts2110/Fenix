package com.fenix.api.services;

import com.fenix.api.models.TeDjesfsa;
import com.fenix.api.repositories.TeDjesfsaRepository;
import com.fenix.api.services.serviceInterface.TeDjesfsaServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeDjesfsaService implements TeDjesfsaServiceInterface {

    @Autowired
    private TeDjesfsaRepository teDjesfsaRepository;

    @Override
    public List<TeDjesfsa> findAll() {
        return teDjesfsaRepository.findAll();
    }

    @Override
    public Optional<TeDjesfsa> findById(Long id) {
        return teDjesfsaRepository.findById(id);
    }

    @Override
    public TeDjesfsa save(TeDjesfsa teDjesfsa) {
        return teDjesfsaRepository.save(teDjesfsa);
    }

    @Override
    public void deleteById(Long id) {
        teDjesfsaRepository.deleteById(id);
    }
}
