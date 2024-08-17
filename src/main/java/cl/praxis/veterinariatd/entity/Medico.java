package cl.praxis.veterinariatd.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Medico {
    private int id;
    private String run;
    private String nombre;
    private String apellido;
    private String email;
}
