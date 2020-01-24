
/**
 * Esta es la clase producto, que tiene los datos nombre y precio.
 * @author (boki)
 * @version (1.0v)
 */
public class Producto
{
    private String nombre;
    private double precio;
    /**
     * Constructor de producto.
     * @param name establece el nombre del producto
     * @param price establece el precio del producto
     */
    public Producto(String name,double price)
    {
        nombre=name;
        precio=price;
    }

    /**
     * Establece el precio de producto
     * @param es un entero que corresponde a precio
     */
    public void ponerPrecio(double prec)
    {
     precio=prec;   
    }
    /**
     * Establece el nombre de producto
     * @param es una cadena de caracteres que establece el nombre
     */
    public void ponerNombre(String nom)
    {
    nombre=nom;
    }
    /**
     * Devuelve el nombre
     */
    public String verNombre()
    {
    return nombre;
    }
    /**
     * Devuelve el precio
     */
    public double verPrecio(){
    return precio;
    }
}
