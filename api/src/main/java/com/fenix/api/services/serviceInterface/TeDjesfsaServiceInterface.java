package com.fenix.api.services.serviceInterface;

import com.fenix.api.models.TeDjesfsa;

import java.util.List;
import java.util.Optional;

public interface TeDjesfsaServiceInterface {
    List<TeDjesfsa> findAll();
    Optional<TeDjesfsa> findById(Long id);
    TeDjesfsa save(TeDjesfsa teDjesfsa);
    void deleteById(Long id);
}
