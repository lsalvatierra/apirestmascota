package pe.edu.cibertec.apirestmascota.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.apirestmascota.model.bd.Cliente;
import pe.edu.cibertec.apirestmascota.model.bd.Mascota;
import pe.edu.cibertec.apirestmascota.model.dto.ClienteRequest;
import pe.edu.cibertec.apirestmascota.model.dto.MascotaRequest;
import pe.edu.cibertec.apirestmascota.repository.ClienteRepository;

@AllArgsConstructor
@Service
public class ClienteService implements IClienteService {

    private ClienteRepository clienteRepository;
    private MascotaService mascotaService;


    @Transactional
    @Override
    public Cliente registrarCliente(ClienteRequest clienteRequest) {
        Cliente cliente = new Cliente();
        cliente.setNombrecliente(clienteRequest.getNombrecliente());
        cliente.setApellidocliente(clienteRequest.getApellidocliente());
        Cliente nuevoCliente = clienteRepository.save(cliente);
        Mascota mascota;
        for(MascotaRequest itemMascota : clienteRequest.getMascotas()){
            mascota = new Mascota();
            mascota.setNombremascota(itemMascota.getNombremascota());
            mascota.setEdad(itemMascota.getEdad());
            mascota.setCliente(nuevoCliente);
            mascotaService.registrarMascota(mascota);
        }
        return nuevoCliente;
    }
}
