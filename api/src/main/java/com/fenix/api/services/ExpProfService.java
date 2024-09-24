package com.fenix.api.services;

import com.fenix.api.models.ExpProf;
import com.fenix.api.repositories.ExpProfRepository;
import com.fenix.api.services.ExpProfService;
import com.fenix.api.services.serviceInterface.ExpProfServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpProfService implements ExpProfServiceInterface {

    @Autowired
    private ExpProfRepository expProfRepository;

    @Override
    public List<ExpProf> findAll() {
        return expProfRepository.findAll();
    }

    @Override
    public Optional<ExpProf> findById(long id) {
        return expProfRepository.findById(id);
    }

    @Override
    public ExpProf save(ExpProf expProf) {
        return expProfRepository.save(expProf);
    }

    @Override
    public void deleteById(long id) {
        expProfRepository.deleteById(id);
    }
}
