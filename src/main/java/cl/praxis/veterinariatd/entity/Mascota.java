package cl.praxis.veterinariatd.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mascota {
    private int id;
    private String nombre;
    private String raza;
    private String duenio;
    private String genero;
    private String tipoMascota;
}
