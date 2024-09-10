package com.fenix.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fenix.api.models.Artigo;;

public interface ArtigoRepository extends JpaRepository<Artigo, Long>{

}