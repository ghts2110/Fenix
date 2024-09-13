package com.fenix.api.services;

import com.fenix.api.models.QDef;
import com.fenix.api.repositories.QDefRepository;
import com.fenix.api.services.serviceInterface.QDefServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QDefService implements QDefServiceInterface {

    @Autowired
    private QDefRepository qDefRepository;

    @Override
    public List<QDef> findAll() {
        return qDefRepository.findAll();
    }

    @Override
    public Optional<QDef> findById(long id) {
        return qDefRepository.findById(id);
    }

    @Override
    public QDef save(QDef qDef) {
        return qDefRepository.save(qDef);
    }

    @Override
    public void deleteById(long id) {
        qDefRepository.deleteById(id);
    }
}
