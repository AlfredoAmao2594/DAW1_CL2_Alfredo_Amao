package pe.edu.cibertec.Persona;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona,Integer> {

    List<Persona> findAll();

    List<Persona> findByNombre(String nombre);

    
}
