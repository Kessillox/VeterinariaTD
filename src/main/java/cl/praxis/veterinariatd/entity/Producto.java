package cl.praxis.veterinariatd.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private int precio;
    private int stock;
    private int idTipo; //(1 = medicinal, 2 = accesorios)
}


