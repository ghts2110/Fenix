package com.fenix.api.services;

import com.fenix.api.models.Artigo;
import com.fenix.api.repositories.ArtigoRepository;
import com.fenix.api.services.exceptions.ResourceNotFoundException;
import com.fenix.api.controller.exeption.Enum.ExceptionEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ArtigoService {

    @Autowired
    private ArtigoRepository artigoRepository;

    public List<Artigo> findAll() {
        return artigoRepository.findAll();
    }

    public Artigo findById(long id) {
        return artigoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found));
    }

    public Artigo create(Artigo artigo) {
        validateArtigo(artigo);
        return artigoRepository.save(artigo);
    }

    public void deleteById(long id) {
        try {
            artigoRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found);
        }
    }

    public Artigo update(long id, Artigo artigo) {
        Artigo existingArtigo = artigoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found));
    
        if (artigo.getArtigo() != null && !artigo.getArtigo().isEmpty()) {
            existingArtigo.setArtigo(artigo.getArtigo());
        }
        if (artigo.getFkDjesfsaId() != null) {
            existingArtigo.setFkDjesfsaId(artigo.getFkDjesfsaId());
        }
        return artigoRepository.save(existingArtigo);
    }
    
    private void validateArtigo(Artigo artigo) {
        if (Objects.isNull(artigo.getArtigo()) || artigo.getArtigo().isEmpty()) {
            throw new IllegalArgumentException("Artigo content cannot be empty");
        }
    }
}
