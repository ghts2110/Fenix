package com.fenix.api.services.serviceInterface;

import com.fenix.api.models.MoradiaModel;
import java.util.List;
import java.util.Optional;

public interface MoradiaServiceInterface {
    List<MoradiaModel> findAll();
    Optional<MoradiaModel> findById(long id);
    MoradiaModel save(MoradiaModel moradiaModel);
    void deleteById(long id);
}