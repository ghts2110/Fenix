package com.fenix.api.services;

import com.fenix.api.models.Telefone;
import com.fenix.api.repositories.TelefoneRepository;
import com.fenix.api.services.serviceInterface.TelefoneServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelefoneService implements TelefoneServiceInterface {

    @Autowired
    private TelefoneRepository telefoneRepository;

    @Override
    public List<Telefone> findAll() {
        return telefoneRepository.findAll();
    }

    @Override
    public Optional<Telefone> findById(long id) {
        return telefoneRepository.findById(id);
    }

    @Override
    public Telefone save(Telefone telefone) {
        return telefoneRepository.save(telefone);
    }

    @Override
    public void deleteById(long id) {
        telefoneRepository.deleteById(id);
    }
}
