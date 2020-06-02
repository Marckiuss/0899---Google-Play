import java.util.ArrayList;

public class GooglePlay
{
    private ArrayList<Usuario> usuarios;
    private ArrayList<Producto> productos;

    public GooglePlay()
    {
        usuarios = new ArrayList<>();
        productos = new ArrayList<>();
    }

    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public int getNumeroUsuarios(){
        return usuarios.size();
    }

    public void addProducto(Producto producto){
        productos.add(producto);
    }

    public int getNumeroProductos(){
        return productos.size();
    }

    public double comprar(String nombreCuenta, String nombreProducto){
        double precio = -1;
        Usuario comprador = null;
        Producto productoAComprar = null;
        int contador = 0;
        while(contador < usuarios.size() && comprador ==null){
            if(usuarios.get(contador).getNombreCuenta().equals(nombreCuenta)){
                comprador = usuarios.get(contador);
            }
            contador ++;
        }
        
        contador = 0;
        
        while (contador < productos.size() && productoAComprar == null) {
            if (productos.get(contador).getNombreProducto().equals(nombreProducto)) {
                productoAComprar = productos.get(contador);
            }
            contador++;
        }

        if (comprador != null && productoAComprar != null) {
            precio = productoAComprar.getPrecio();
            productoAComprar.vender();
        }
        return precio;
    }
}