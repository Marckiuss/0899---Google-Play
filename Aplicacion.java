public class Aplicacion extends Producto
{
    private double espacio;
    private Categoria categoria;
    
    public Aplicacion(String nombreProducto, double espacio, Categoria categoria)
    {
        super(nombreProducto);
        this.espacio = espacio;
        this.categoria = categoria;
    }

    public String getNombre(){
        return getNombreProducto();
    }

    public double getTamanoEnMB(){
        return espacio;
    }

    public String getCategoria(){
        String categ = "";
        switch(categoria.toString()){
            case "JUEGOS": 
            categ = "Juegos"; 
            break;

            case "COMUNICACIONES": 
            categ = "Comunicaciones"; 
            break;

            case "PRODUCTIVIDAD": 
            categ = "Productividad"; 
            break;

            case "MULTIMEDIA": 
            categ = "Multimedia"; 
            break;
        }
        return categ;
    }
    
    public double getPrecio(){
        double precio = 0;
        return precio;
    }
}