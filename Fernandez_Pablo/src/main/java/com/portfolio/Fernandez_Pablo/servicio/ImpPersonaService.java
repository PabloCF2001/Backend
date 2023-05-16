
package com.portfolio.Fernandez_Pablo.servicio;

import com.portfolio.Fernandez_Pablo.entidad.persona;
import com.portfolio.Fernandez_Pablo.interfas.IPersonaService;
import com.portfolio.Fernandez_Pablo.repositorio.IPersonaReposirory;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaReposirory ipersonaRepository;

    @Override
    public List<persona> getpersona() {
        List<persona> Persona = ipersonaRepository.findAll();
        return Persona;
        
    }

    @Override
    public void savepersona(persona Persona) {
        ipersonaRepository.save(Persona);
    }

    @Override
    public void deletepersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public persona findpersona(Long id) {
        persona Persona = ipersonaRepository.findById(id).orElse(null) ;
        return Persona;
    }
    
    

}