package SoftUni.PokemonTrainer;


import java.util.ArrayList;
import java.util.List;

public class Trainer {
    String name;
    int numberOfBadges;
    List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.numberOfBadges = 0;
        this.pokemons = new ArrayList<>();
    }
    public List<Pokemon> getPokemons(){
        return pokemons;
    }
    public int getNumberOfBadges(){
        return numberOfBadges;
    }
    public void catchPokemon(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }
    public void increaseBadges(){
        this.numberOfBadges++;
    }
    public void decreasePokemonHealth(){
        for (int i = 0; i < pokemons.size(); i++) {
            Pokemon current = pokemons.get(i);
            current.loseHealth();
            if (current.isDead()){
                pokemons.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d %d",this.name,this.numberOfBadges,this.pokemons.size());
    }
}
