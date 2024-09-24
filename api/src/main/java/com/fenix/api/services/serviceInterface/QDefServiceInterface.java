package com.fenix.api.services.serviceInterface;

import com.fenix.api.models.QDef;

import java.util.List;
import java.util.Optional;

public interface QDefServiceInterface {
    List<QDef> findAll();
    Optional<QDef> findById(long id);
    QDef save(QDef qDef);
    void deleteById(long id);
}
