public abstract class ProductoMultimedia extends Producto
{
    private int anoCreacion;
    
    public ProductoMultimedia(String identificador, int anoCreacion)
    {
        super(identificador);
        this.anoCreacion = anoCreacion;
    }
    
    public String getTitulo(){
        return getNombreProducto();
    }
    
    public int getAno(){
        return anoCreacion;
    }
    
    public abstract double getPrecio();
}