package com.fenix.api.services.serviceInterface;

import com.fenix.api.models.ExpProf;

import java.util.List;
import java.util.Optional;

public interface ExpProfServiceInterface {
    List<ExpProf> findAll();
    Optional<ExpProf> findById(long id);
    ExpProf save(ExpProf expProf);
    void deleteById(long id);
}
