package com.fenix.api.services;

import com.fenix.api.models.Artigo;
import com.fenix.api.repositories.ArtigoRepository;
import com.fenix.api.services.serviceInterface.ArtigoServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtigoService implements ArtigoServiceInterface {

    @Autowired
    private ArtigoRepository artigoRepository;

    @Override
    public List<Artigo> findAll() {
        return artigoRepository.findAll();
    }

    @Override
    public Optional<Artigo> findById(long id) {
        return artigoRepository.findById(id);
    }

    @Override
    public Artigo save(Artigo artigo) {
        return artigoRepository.save(artigo);
    }

    @Override
    public void deleteById(long id) {
        artigoRepository.deleteById(id);
    }
}
