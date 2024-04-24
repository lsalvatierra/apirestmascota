package pe.edu.cibertec.apirestmascota.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.apirestmascota.model.bd.Mascota;
import pe.edu.cibertec.apirestmascota.repository.MascotaRepository;

@AllArgsConstructor
@Service
public class MascotaService implements IMascotaService {

    private MascotaRepository mascotaRepository;

    @Override
    public Mascota registrarMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }
}
