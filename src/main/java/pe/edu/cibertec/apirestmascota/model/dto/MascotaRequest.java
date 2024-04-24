package pe.edu.cibertec.apirestmascota.model.dto;

import lombok.Data;

@Data
public class MascotaRequest {
    private String nombremascota;
    private Integer edad;
}
