package com.fenix.api.services.serviceInterface;

import com.fenix.api.models.CategCnh;

import java.util.List;
import java.util.Optional;

public interface CategCnhServiceInterface {
    List<CategCnh> findAll();
    Optional<CategCnh> findById(long id);
    CategCnh save(CategCnh categCnh);
    void deleteById(long id);
}