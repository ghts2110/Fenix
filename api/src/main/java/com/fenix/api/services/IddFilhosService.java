package com.fenix.api.services;

import com.fenix.api.models.IddFilhos;
import com.fenix.api.repositories.IddFilhoRepository;
import com.fenix.api.services.serviceInterface.IddFilhosServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IddFilhosService implements IddFilhosServiceInterface {

    @Autowired
    private IddFilhoRepository iddFilhoRepository;

    @Override
    public List<IddFilhos> findAll() {
        return iddFilhoRepository.findAll();
    }

    @Override
    public Optional<IddFilhos> findById(long id) {
        return iddFilhoRepository.findById(id);
    }

    @Override
    public IddFilhos save(IddFilhos iddFilhos) {
        return iddFilhoRepository.save(iddFilhos);
    }

    @Override
    public void deleteById(long id) {
        iddFilhoRepository.deleteById(id);
    }
}
