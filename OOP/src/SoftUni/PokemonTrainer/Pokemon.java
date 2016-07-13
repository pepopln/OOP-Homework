package SoftUni.PokemonTrainer;


public class Pokemon {
String name;
    String element;
    int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }
    public String getElement(){
        return element;
    }
    public void loseHealth(){
        this.health-=10;
    }
    public boolean isDead(){
        return this.health<=0;
    }
}
