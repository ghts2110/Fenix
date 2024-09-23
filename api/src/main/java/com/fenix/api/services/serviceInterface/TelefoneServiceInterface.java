package com.fenix.api.services.serviceInterface;

import com.fenix.api.models.Telefone;

import java.util.List;
import java.util.Optional;

public interface TelefoneServiceInterface {
    List<Telefone> findAll();
    Optional<Telefone> findById(long id);
    Telefone save(Telefone telefone);
    void deleteById(long id);
}
