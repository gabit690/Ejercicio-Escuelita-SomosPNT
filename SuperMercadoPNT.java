
package supermercadopnt;

import java.util.ArrayList;

/**
Ejercicio Escuelita Somos PNT

Imaginemos un supermercado de barrio.

Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse, 
se visualiza lo siguiente por consola y se termina la ejecución:


Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20
Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18
Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19
Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
=============================
Producto más caro: Frutillas
Producto más barato: Coca-Cola

La solución debe cumplir con los siguientes requisitos:
Diseñar una solución orientada a objetos.
La salida es por consola y exactamente como se requiere.
Usar solamente las clases provistas por Java 8..
Cargar la lista de productos en un único método. No hay ingreso por pantalla 
de ningún tipo. 
El algoritmo usado para la impresión no tiene que depender de la cantidad o 
tipo de productos.
Para mostrar el mayor / menor, utilizar la interfaz Comparable.
Para imprimir por pantalla, sobrescribir el método toString()

Cualquier solución que no cumpla con estos requisitos será descartada, asi 
que revisa bien! 

Por favor, enviar un ZIP con los fuentes de la solución. Cualquier consulta 
no duden en preguntar a contacto@somospnt.com
*/

public class SuperMercadoPNT{
    
    /*
    * PRE: -.
    * POST: se cargan 4 productos a la 'lista'.
    * Los mismos son:
    * 2 bebidas gaseosas, 1 shampoo y frutillas.
    */
    public static void cargarProductos(ArrayList<Producto> lista){
        Producto unProducto;
        
        unProducto = new Gaseosa("Coca-Cola Zero", 20, 1.5F);
        lista.add(unProducto);
        unProducto = new Gaseosa("Coca-Cola", 18, 1.5F);
        lista.add(unProducto);
        unProducto = new Shampoo("Shampoo Sedal", 19, 500F);
        lista.add(unProducto);
        unProducto = new Fruta("Frutillas", 64, "kilo");
        lista.add(unProducto);
    }

    /*
    * PRE: 'lista' no esta vacia.
    * POST: muestra por pantalla todos los productos que se encuentran
    * dentro de la lista.
    */    
    public static void mostrarProductos(ArrayList<Producto> lista){
        for(Producto unProducto: lista){
            System.out.println(unProducto);
        }
        System.out.println("=============================");
    }

    /*
    * PRE: 'lista' no esta vacia.
    * POST: muestra por pantalla cual es el producto con mayor precio
    * dentro de la lista.
    * En el caso que hubiera mas de un producto con el precio mas alto
    * se mostrara el primero de ellos.
    */
    public static void mostrarProductoMasCaro(ArrayList<Producto> lista){ 
        Producto productoMasCaro = lista.get(0);
        
        for(int elemento = 1; elemento<lista.size();elemento++){       
            Producto unProducto = lista.get(elemento);
            if(unProducto.compareTo(productoMasCaro) > 0 ){
                productoMasCaro = unProducto;
            }
        }
        
        System.out.println("Producto más caro: "+productoMasCaro.getNombre());
    }
    
    /*
    * PRE: 'lista' no esta vacia.
    * POST: muestra por pantalla cual es el producto con menor precio
    * dentro de la lista.
    * En el caso que hubiera mas de un producto con el precio mas bajo
    * se mostrara el primero de ellos.
    */
    public static void mostrarProductoMasBarato(ArrayList<Producto> lista){   
        Producto productoMasBarato = lista.get(0);
        
        for(int elemento = 1; elemento<lista.size();elemento++){
            Producto unProducto = lista.get(elemento);
            if(unProducto.compareTo(productoMasBarato) < 0 ){
                productoMasBarato = unProducto;
            }
        }
        
        System.out.println("Producto más barato: "+productoMasBarato.getNombre());
    }
       
    public static void main(String[] args) {
        
        ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
        
        cargarProductos(listaDeProductos);
        
        mostrarProductos(listaDeProductos);
        
        mostrarProductoMasCaro(listaDeProductos);
        
        mostrarProductoMasBarato(listaDeProductos);
        
    }
    
}
