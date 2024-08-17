package cl.praxis.veterinariatd.aplicationjava;

/*
* * ●	Implementar un algoritmo que permita que en el caso que un stock sea inferior a 15 unidades para los productos de tipo medicinal y 5 unidades para los tipo accesorios para una sucursal determinada, éste mande una advertencia de reposición inmediata por pantalla. Se deberá pedir al usuario que entregue por consola el número de la sucursal y el id de producto para éste cálculo.
 * */
public interface IAlgoritmoSimple {
    void checkStock(int idSucursal, int idProducto);

}
