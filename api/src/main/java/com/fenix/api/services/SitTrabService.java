package com.fenix.api.services;

import com.fenix.api.models.SitTrabModel;
import com.fenix.api.repositories.SitTrabRepository;
import com.fenix.api.services.serviceInterface.SitTrabModelServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SitTrabService implements SitTrabModelServiceInterface {

    @Autowired
    private SitTrabRepository sitTrabRepository;

    @Override
    public List<SitTrabModel> findAll() {
        return sitTrabRepository.findAll();
    }

    @Override
    public Optional<SitTrabModel> findById(long id) {
        return sitTrabRepository.findById(id);
    }

    @Override
    public SitTrabModel save(SitTrabModel sitTrabModel) {
        return sitTrabRepository.save(sitTrabModel);
    }

    @Override
    public void deleteById(long id) {
        sitTrabRepository.deleteById(id);
    }
}
