package cl.praxis.veterinariatd.entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CitaMedica {
    private int id;
    private int medicoId;
    private int sucursalId;
    private int mascotaId;
    private int tipoAtencionId;
    private LocalDate fechaAtencion;
    private LocalDate proximaFechaAtencion;
    private String boxAtencion;
}
