
package supermercadopnt;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
* Comestible fresco que se obtuvo de una planta o arbol y se vende por el
* peso de una cantidad determinada.
*/
public class Fruta extends Producto{
    
    private String unidadDeVenta;
    
    /*
    * PRE: 'precio' es un valor mayor a 0.
    * POST: crea un articulo fruta con su 'nombre', 'precio' y la
    * unidad de venta.
    */
    public Fruta(String nombre, float precio, String unidad){
        super(nombre,precio);
        this.unidadDeVenta = unidad;
    }
    
    /*
    * PRE: -.
    * POST: cambia la unidad de venta de la fruta a 'otraUnidad'
    */
    public void setUnidadDeVenta(String otraUnidad){
        this.unidadDeVenta = otraUnidad;
    }
    
    /*
    * PRE: -.
    * POST: devuelve la unidad en la que se vende la fruta(kilo, gramos,etc).
    */
    public String getUnidadDeVenta(){
        return this.unidadDeVenta;
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
                "Precio: $"+valorEnPantalla.format(super.getPrecioDeVenta())+
                " /// "+
                "Unidad de venta: "+this.getUnidadDeVenta());

    }
}
