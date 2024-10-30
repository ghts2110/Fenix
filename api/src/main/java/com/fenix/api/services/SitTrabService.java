package com.fenix.api.services;

import com.fenix.api.models.SitTrabModel;
import com.fenix.api.repositories.SitTrabRepository;
import com.fenix.api.services.exceptions.ResourceNotFoundException;
import com.fenix.api.controller.exeption.Enum.ExceptionEnum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SitTrabService {

    @Autowired
    private SitTrabRepository sitTrabRepository;

    public List<SitTrabModel> findAll() {
        return sitTrabRepository.findAll();
    }

    public SitTrabModel findById(Long id) {
        return sitTrabRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found));
    }

    public SitTrabModel create(SitTrabModel sitTrabModel) {
        return sitTrabRepository.save(sitTrabModel);
    }

    public SitTrabModel update(Long id, SitTrabModel sitTrabModel) {
        SitTrabModel existingSitTrab = findById(id);

        if (sitTrabModel.getLocalTb() != null && !sitTrabModel.getLocalTb().isEmpty()) {
            existingSitTrab.setLocalTb(sitTrabModel.getLocalTb());
        }
        if (sitTrabModel.getModalidadeTb() != null && !sitTrabModel.getModalidadeTb().isEmpty()) {
            existingSitTrab.setModalidadeTb(sitTrabModel.getModalidadeTb());
        }

        return sitTrabRepository.save(existingSitTrab);
    }

    public void deleteById(Long id) {
        try {
            sitTrabRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id, ExceptionEnum.Resource_not_found);
        }
    }
}
