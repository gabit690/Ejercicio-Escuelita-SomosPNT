
package supermercadopnt;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Liquido usado para higienizar el cabello.
 */
public class Shampoo extends Producto{
    
    private float cantidadDeMililitros;
    
    /*
    * PRE: 'cantidadContenida' es un valor mayor a 0.
    * POST: crea un articulo shampoo con su 'nombre', 'precio' y la
    * cantidad contenida para la venta.
    */
    public Shampoo(String nombre, float precio, float cantidadContenida){
        super(nombre,precio);
        this.cantidadDeMililitros = cantidadContenida;
    }
    
    /*
    * PRE: 'otraCantidad' es un valor mayor a 0.
    * POST: cambia la cantidad de venta contenida del shampoo 
    * a 'otraCantidad'
    */
    public void setCantidaContenida(float otraCantidad){
        this.cantidadDeMililitros = otraCantidad;
    }
    
    /*
    * PRE: -.
    * POST: devuelve la cantidad de mililitros en la que se vende 
    * el shampoo.
    */
    public float getCantidaContenida(){
        return this.cantidadDeMililitros;
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
                "Contenido: "+valorEnPantalla.format(this.cantidadDeMililitros)+
                "ml"+" /// "+
                "Precio: $"+valorEnPantalla.format(super.getPrecioDeVenta()));
    }
}