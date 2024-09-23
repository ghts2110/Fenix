package com.fenix.api.services.serviceInterface;

import com.fenix.api.models.Artigo;

import java.util.List;
import java.util.Optional;

public interface ArtigoServiceInterface {
    List<Artigo> findAll();
    Optional<Artigo> findById(long id);
    Artigo save(Artigo artigo);
    void deleteById(long id);
}