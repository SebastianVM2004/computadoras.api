package mx.unam.aragon.ico.is.computadoraapi.repositories;

import mx.unam.aragon.ico.is.computadoraapi.entities.Computadora;
import org.springframework.data.repository.CrudRepository;

public interface ComputadoraRepository extends CrudRepository<Computadora, Long> {
    Computadora findComputadoraByClave(Long clave);
}
