package cl.praxis.veterinariatd.aplicationjava;


import cl.praxis.veterinariatd.entity.Producto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class ProductoRepository {
    private List<Producto> productos = new ArrayList<>();

    public void productoService(){
        Producto producto1 = new Producto(1,"Ivermectina","Vacuna",5000, 16,1);
        Producto producto2 = new Producto(2,"Triple felina", "Vacuna",18000,20,1);
        Producto producto3 = new Producto(3,"Collar", "Collar antipulgas", 3000, 50, 2);
        Producto producto4 = new Producto(4,"Antirrabica","vacuna",15000,40,1);
        Producto producto5 = new Producto(5, "Collar Rojo", "BrandPig", 15000, 5, 2);
        Producto producto6 = new Producto(6, "Analgesico", "Bayer",2,1,1);
        Producto producto7 = new Producto(7, "Hueso Goma", "BrandPig",1,2,2);
        Producto producto8 = new Producto(8, "Multi Vitaminico", "Bayer",2,2,1);

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);
        productos.add(producto7);
        productos.add(producto8);
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
