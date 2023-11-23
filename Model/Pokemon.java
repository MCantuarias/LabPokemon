public class Pokemon{
    private String nombre;
    private String tipo;
    private int nivel;
    
    public Pokemon(String nombre, String tipo, int nivel){
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public String getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setNivel(String nivel){
        this.nivel = nivel
    }
    //toString nombre,tipo,nivel
    @Override
    public String toString(){
        return nombre+", "+tipo", "+nivel;
    }
}