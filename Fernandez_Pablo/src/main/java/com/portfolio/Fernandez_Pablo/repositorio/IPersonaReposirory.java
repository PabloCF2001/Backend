
package com.portfolio.Fernandez_Pablo.repositorio;

import com.portfolio.Fernandez_Pablo.entidad.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaReposirory extends JpaRepository<persona, Long> {
    
    
}
