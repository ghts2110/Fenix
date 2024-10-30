package com.fenix.api.services;

import com.fenix.api.models.QDef;
import com.fenix.api.repositories.QDefRepository;
import com.fenix.api.services.exceptions.ResourceNotFoundException;
import com.fenix.api.controller.exeption.Enum.ExceptionEnum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QDefService {

    @Autowired
    private QDefRepository qDefRepository;

    public List<QDef> findAll() {
        return qDefRepository.findAll();
    }

    public QDef findById(Long id) {
        return qDefRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found));
    }

    public QDef create(QDef qDef) {
        return qDefRepository.save(qDef);
    }

    public QDef update(Long id, QDef qDef) {
        QDef existingQDef = findById(id);

        if (qDef.getQDef() != null && !qDef.getQDef().isEmpty()) {
            existingQDef.setQDef(qDef.getQDef());
        }

        return qDefRepository.save(existingQDef);
    }

    public void deleteById(Long id) {
        try {
            qDefRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found);
        }
    }
}
