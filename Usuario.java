public class Usuario
{
    private String email;
    
    public Usuario(String email)
    {
        this.email = email;
    }
    
    public String getNombreCuenta(){
        return email;
    }
}