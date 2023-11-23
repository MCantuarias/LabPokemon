import java.util.ArrayList;
public class Entrenador{
    private ArrayList<Pokemon> pokemonActivo = new ArrayList<>();
    private ArrayList<Pokemon> pokemonCapturado = new ArrayList<>();

    public Entrenador(){}


    public void AgregarActivo(Pokemon pokemon){
        for(Pokemon p : pokemonCapturado){
            if(pokemon.equals(p)){
                pokemonActivo.add(pokemon);
                System.out.println("El pokemon fue activado");
            }System.out.println("No se encontro el pokemon") ;
        }
    }
    public void eliminarActivo(Pokemon pokemon){
        for(Pokemon p : pokemonActivo){
            if(pokemon.equals(p)){
                pokemonActivo.remove(pokemon);
                System.out.println("El pokemon fue eliminado");
            }System.out.println("No se encontro el pokemon en activos") ;
        }
    }


    public void AgregarCapturado(Pokemon pokemon){
        
    }
    public void eliminarCapturado(){}

    
}