package com.fenix.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fenix.api.models.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long>{

}