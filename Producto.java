public abstract class Producto
{
    private String identificador;
    private int vecesComprado;
    
    public Producto(String identificador)
    {
        this.identificador = identificador;
        vecesComprado = 0;
    }
    
    public String getNombreProducto(){
        return identificador;
    }
    
    public abstract double getPrecio();
    
    public int getVecesComprado(){
        return vecesComprado;
    }
    
    public void vender() {
        vecesComprado++;
    }
}
