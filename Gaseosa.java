
package supermercadopnt;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Bebida gasificada que se vende por cantidad de litros en una
 * botella o lata.
 */
public class Gaseosa extends Producto{
    
    private float cantidadDeLitros;
    
    /*
    * PRE: 'cantidadContenida' es un valor mayor a 0.
    * POST: crea un articulo gaseosa con su 'nombre', 'precio' y la
    * cantidad contenida para la venta.
    */
    public Gaseosa(String nombre, float precio, float cantidadContenida){
        super(nombre,precio);
        this.cantidadDeLitros = cantidadContenida;
    }
    
    /*
    * PRE: 'otraCantidad' es un valor mayor a 0.
    * POST: cambia la cantidad de venta contenida de la gaseosa 
    * a 'otraCantidad'
    */
    public void setCantidadDeLitros(float otraCantidad){
        this.cantidadDeLitros = otraCantidad;
    }
    
    /*
    * PRE: -.
    * POST: devuelve la cantidad de litros en la que se vende la gaseosa.
    */
    public float getCantidadDeLitros(){
        return this.cantidadDeLitros;
    }
    
    @Override
    /*
    * PRE: -.
    * POST: Devuelve toda la informacion del producto.
    */
    public String toString(){

        DecimalFormatSymbols separador = new DecimalFormatSymbols();
        separador.setDecimalSeparator('.');
        DecimalFormat valorEnPantalla = new DecimalFormat("#.##",separador);
        
        return ("Nombre: "+super.getNombre()+" /// "+
                "Litros: "+valorEnPantalla.format(this.cantidadDeLitros)+
                " /// "+
                "Precio: $"+valorEnPantalla.format(super.getPrecioDeVenta()));
    }
}