package pe.edu.cibertec.apirestmascota.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.apirestmascota.model.bd.Cliente;
import pe.edu.cibertec.apirestmascota.model.dto.ClienteRequest;
import pe.edu.cibertec.apirestmascota.service.IClienteService;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/cliente")
public class ClienteController {

    private IClienteService iClienteService;


    @PostMapping("")
    public ResponseEntity<Cliente> registrarCategoria(
            @RequestBody ClienteRequest clienteRequest
    ){
        return new ResponseEntity<>(
                iClienteService.registrarCliente(clienteRequest), HttpStatus.CREATED);
    }

}
