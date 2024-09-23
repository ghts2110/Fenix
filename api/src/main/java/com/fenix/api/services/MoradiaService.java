package com.fenix.api.services;

import com.fenix.api.models.MoradiaModel;
import com.fenix.api.repositories.MoradiaRepository;
import com.fenix.api.services.serviceInterface.MoradiaServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoradiaService implements MoradiaServiceInterface {

    @Autowired
    private MoradiaRepository moradiaRepository;

    @Override
    public List<MoradiaModel> findAll() {
        return moradiaRepository.findAll();
    }

    @Override
    public Optional<MoradiaModel> findById(long id) {
        return moradiaRepository.findById(id);
    }

    @Override
    public MoradiaModel save(MoradiaModel moradiaModel) {
        return moradiaRepository.save(moradiaModel);
    }

    @Override
    public void deleteById(long id) {
        moradiaRepository.deleteById(id);
    }
}
