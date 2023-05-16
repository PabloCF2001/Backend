
package com.portfolio.Fernandez_Pablo.interfas;

import com.portfolio.Fernandez_Pablo.entidad.persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de personas
    public List<persona> getpersona();
            
    //guardar un objeto de tipo persona
    public void savepersona(persona persona);
            
    //Eliminar un objeto pero lo buscamos por id
    public void deletepersona(Long id);
    
    //Buscra una persona por id
    public persona findpersona(Long id);
}
