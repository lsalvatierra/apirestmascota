package pe.edu.cibertec.apirestmascota.service;

import pe.edu.cibertec.apirestmascota.model.bd.Cliente;
import pe.edu.cibertec.apirestmascota.model.dto.ClienteRequest;


public interface IClienteService {

    Cliente registrarCliente(ClienteRequest clienteRequest);

}
