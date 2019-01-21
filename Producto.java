
package supermercadopnt;

import java.lang.Comparable;

/**
* Elemento para ser vendido en un negocio destinado a consumidores
* a cambio de dinero.
*/
public class Producto implements Comparable<Producto>{
    
    private String nombreDelProducto;
    private float precioDeVenta;
    
    /*
    * PRE: 'precio' es un valor mayor a 0.
    * POST: crea un producto con el 'nombre' y 'precio' brindados.
    */
    public Producto(String nombre, float precio){
        this.nombreDelProducto = nombre;
        this.precioDeVenta = precio;
    }

    /*
    * PRE: -.
    * POST: se cambia el nombre del producto.
    */    
    public void setNombre(String otroNombre){
        this.nombreDelProducto = otroNombre;
    }

    /*
    * PRE: 'otroPrecio' es un valor mayor a 0.
    * POST: se cambia el precio de venta del producto.
    */    
    public void setPrecioDeVenta(float otroPrecio){
        this.precioDeVenta = otroPrecio;
    }   
    

    /*
    * PRE: -.
    * POST: devuelve el nombre del producto.
    */    
    public String getNombre(){
        return this.nombreDelProducto;
    }

    /*
    * PRE: -.
    * POST: devuelve el precio de venta del producto.
    */    
    public float getPrecioDeVenta(){
        return this.precioDeVenta;
    }


    @Override
    /*
    * PRE: -.
    * POST: devuelve un entero que indica si el producto tiene un precio menor,
    * mayor o igual a otroProducto.
    * Si devuelve -1: otroProducto tiene un mayor precio.
    * Si devuelve 1: otroProducto tiene un menor precio.
    * Si devuelve 0: ambos productos tiene el mismo precio.
    */
    public int compareTo(Producto otroProducto) {
        float diferenciaDePrecios = this.precioDeVenta-otroProducto.getPrecioDeVenta();
        if(diferenciaDePrecios < 0){
            return -1;
        }
        else{
            if(diferenciaDePrecios > 0){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}
