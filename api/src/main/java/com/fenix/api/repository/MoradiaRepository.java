package com.fenix.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fenix.api.entity.Moradia;

public interface MoradiaRepository extends JpaRepository<Moradia, Long> {//isso vai cria a tabela no SQL, 
                                                                            //o lado esquerdo vai ser a entidade e do lado direito vai ser o tipo da variavel que é o ID dele
    
}
