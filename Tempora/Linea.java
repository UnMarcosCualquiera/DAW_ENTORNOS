
/**
 *n
 */
public class Linea
{
    private Producto producto;
    private int cantidad;
    /**
     * Constructor for objects of class Linea
     */
    public Linea(Producto producto, int cant)
    {
        this.producto = producto;
        this.cantidad = cant;
    }
    
    public void setProducto(Producto p)
    {
        producto = p;
    }
    
    public Producto getProducto()
    {
        return producto;
    }
    public void setCantidad (int cant){
        cantidad = cant;
    }
    public int getCantidad (int cant){
        return cantidad;
    }
    public double totalAmmount (int cant, Producto p){
        return (cant*p.verPrecio());
    }
}
