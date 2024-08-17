package cl.praxis.veterinariatd.aplicationjava;
import cl.praxis.veterinariatd.entity.CitaMedica;
import cl.praxis.veterinariatd.entity.Inventario;
import cl.praxis.veterinariatd.entity.Mascota;
import cl.praxis.veterinariatd.entity.Sucursal;

import java.time.LocalDate;
import java.util.List;

public class AlgoritmosImpl implements IAlgoritmoSimple, IAlgoritmo2 {
    private List<Sucursal> sucursalList;
    private List<Mascota> listaMascotas;

    public AlgoritmosImpl(List<Sucursal> sucursalList) {
        this.sucursalList = sucursalList;
    }

    @Override
    public void checkStock (int idSucursal, int idProducto) {
        for(Sucursal sucursal : sucursalList){
            if(sucursal.getId() == idSucursal) {
               Inventario inventario = new Inventario();  // el inventario no debiera tener data? // si me complicaron el modelo un chingo ajjajajaj gracias francisco
                // a llorar a la playa
                    if(inventario != null){
                        if(inventario.getIdTipoProducto() == 1 && inventario.getExistencia() <= 15 || inventario.getIdTipoProducto() == 2 && inventario.getExistencia() <= 5 ) {
                            System.out.println("Reposicion del producto" + inventario.getNombre());
                        }
                }
            }
        }
    }

    @Override
   public  void verificarCita(LocalDate fecha) {
        //Mascota mascota = new Mascota();
        CitaMedica citaMedica = new CitaMedica();
        for(Mascota mascota : listaMascotas) {
            if(mascota.getId() == citaMedica.getMascotaId()) {
                if(citaMedica.getProximaFechaAtencion().equals(fecha)) {
                    System.out.println(mascota.getNombre() + " tiene cita el día " + citaMedica.getProximaFechaAtencion());
                } else {
                    System.out.println("No hay citas");
                }
            }
        }
    }
}
