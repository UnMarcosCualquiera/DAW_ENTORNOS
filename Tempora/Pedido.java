import java.util.HashMap;
/**
 * Clase pedido.
 * Existe el HashMap pedido que incluye datos de clase Linea, 
 * y de clase HashMap.
 * @version (0.0v)
 */
public class Pedido
{
    private HashMap<Integer,Linea> pedido= new HashMap<>();
    private String direccion;
    private String nombre;
    private int n;
    /**
     * Constructor de la clase pedido
     */
    public Pedido()
    {
        n=0;
        
    }

    /**
     * Con este parámetro creas un pedido
     */
    public void setPedido(String nombre,double precio,int cant,String nom,
    String direc){
        Producto p= new Producto(nombre,precio);
        Linea linea=new Linea(p,cant);
        direccion=direc;
        nombre=nom;
        pedido.put(n,linea);
        n++;
    }

    
    
}
