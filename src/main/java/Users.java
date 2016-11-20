import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alberto on 18/11/2016.
 */
public class Users {
    String name;
    ArrayList<Pokemon> pokemons =new ArrayList<Pokemon>();
    public Users(String name){

        this.name=name;
    }
    public void añadirPokemon(Pokemon p){
        pokemons.add(p);
    }
    public List<Pokemon> returnPokemon(){
        return this.pokemons;
    }
    public String getName(){return this.name;}
    public void setName(String name){this.name=name;}
    public int numeroPokemon(){return pokemons.size();}
}
