package com.fenix.api.services.serviceInterface;

import com.fenix.api.models.SitTrabModel;

import java.util.List;
import java.util.Optional;

public interface SitTrabModelServiceInterface {
    List<SitTrabModel> findAll();
    Optional<SitTrabModel> findById(long id);
    SitTrabModel save(SitTrabModel sitTrabModel);
    void deleteById(long id);
}
