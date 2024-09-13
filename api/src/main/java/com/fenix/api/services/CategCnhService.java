package com.fenix.api.services;

import com.fenix.api.models.CategCnh;
import com.fenix.api.repositories.CategCnhRepository;
import com.fenix.api.services.serviceInterface.CategCnhServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategCnhService implements CategCnhServiceInterface {

    @Autowired
    private CategCnhRepository categCnhRepository;

    @Override
    public List<CategCnh> findAll() {
        return categCnhRepository.findAll();
    }

    @Override
    public Optional<CategCnh> findById(long id) {
        return categCnhRepository.findById(id);
    }

    @Override
    public CategCnh save(CategCnh categCnh) {
        return categCnhRepository.save(categCnh);
    }

    @Override
    public void deleteById(long id) {
        categCnhRepository.deleteById(id);
    }
}
