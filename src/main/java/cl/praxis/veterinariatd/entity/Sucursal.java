package cl.praxis.veterinariatd.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Sucursal {
    private int id;
    private String nombre;
    private String direccion;
    private int telefono;
}
