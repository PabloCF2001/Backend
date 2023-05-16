
package com.portfolio.Fernandez_Pablo.controlador;

import com.portfolio.Fernandez_Pablo.entidad.persona;
import com.portfolio.Fernandez_Pablo.interfas.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaControler {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping ("personas/traer")
    public List<persona> getPersona(){
        return ipersonaService.getpersona();
    }
    
    @PostMapping("personas/crear")
    public String createPersona(@RequestBody persona Persona){
        ipersonaService.savepersona(Persona);
        return "La persona fue creada correctamente";
    }
    @DeleteMapping("/personas/borrar/id")
    public String deletePersona(@PathVariable long id){
       ipersonaService.deletepersona(id);
       return "La persona fue eliminada correctamente"; 
    }
    @PutMapping("personas/editar/(id)")
    public persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre, 
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("img") String nuevoImg){
        persona Persona = ipersonaService.findpersona(id);
        
        Persona.setNombre(nuevoNombre);
        Persona.setApellido(nuevoApellido);
        Persona.setImg(nuevoImg);
        
        ipersonaService.savepersona(Persona);
        return Persona;
    }  
    @GetMapping("/personas/traer/perfil")
    public persona findPersona(){
        return ipersonaService.findpersona((long)1);
    }

        
}
