package labPokemon.Data;

import java.io.*;
import java.util.*;

public class Datos{
    String archivo;
    public Datos(String archivo){
        this.archivo = archivo;
    }
    public ArrayList<Pokemon> leerDatos(){
        ArrayList<Pokemon> listaPokemon = new ArrayList<>();
        try{
            BufferReader br = new BufferReader(new FileReader(archivo));
            String linea;
            Pokemon aux = new Pokemon();
            while ((linea = br.readline()) != null) {
                String[] pokemon = linea.split(",");  
                aux.setNombre(pokemon[0]);
                aux.setTipo(pokemon[1]);
                aux.setNivel((int)pokemon[2]);              //Posible error
                listaPokemon.add(aux);
            }br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaPokemon;
    }
}