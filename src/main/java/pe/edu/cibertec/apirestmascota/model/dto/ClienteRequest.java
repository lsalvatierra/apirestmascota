package pe.edu.cibertec.apirestmascota.model.dto;

import lombok.Data;
import pe.edu.cibertec.apirestmascota.model.bd.Mascota;

import java.util.ArrayList;
import java.util.List;

@Data
public class ClienteRequest {
    private String nombrecliente;
    private String apellidocliente;
    private List<MascotaRequest> mascotas = new ArrayList<>();
}
