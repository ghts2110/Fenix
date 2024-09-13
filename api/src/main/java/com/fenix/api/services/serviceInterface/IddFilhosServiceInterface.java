package com.fenix.api.services.serviceInterface;

import com.fenix.api.models.IddFilhos;

import java.util.List;
import java.util.Optional;

public interface IddFilhosServiceInterface {
    List<IddFilhos> findAll();
    Optional<IddFilhos> findById(long id);
    IddFilhos save(IddFilhos iddFilhos);
    void deleteById(long id);
}
