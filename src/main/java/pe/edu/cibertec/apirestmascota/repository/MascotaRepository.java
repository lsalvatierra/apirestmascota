package pe.edu.cibertec.apirestmascota.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.apirestmascota.model.bd.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Integer> {
}
