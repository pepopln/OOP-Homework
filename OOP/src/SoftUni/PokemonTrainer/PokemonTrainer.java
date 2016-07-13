package SoftUni.PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PokemonTrainer {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Trainer> trainers = new HashMap<>();

        while (true){
            String command = reader.readLine();
            if (command.equals("Tournament")){
                break;
            }
            String[] params = command.split("\\s+");
            String trainerName = params[0];
            String pokemonName = params[1];
            String pokemonElement = params[2];
            int pokemonHealth = Integer.valueOf(params[3]);
            Pokemon pokemon = new Pokemon(pokemonName,pokemonElement,pokemonHealth);
            if (!trainers.containsKey(trainerName)){
                trainers.put(trainerName,new Trainer(trainerName));
            }
            Trainer trainer = trainers.get(trainerName);
            trainer.catchPokemon(pokemon);
        }
        while (true){
            String command=reader.readLine();
            if (command.equals("End")){
                break;
            }
            for (Trainer trainer : trainers.values()) {
                long pokemonCount = trainer.getPokemons().stream().filter(p->p.getElement().equals(command)).count();
                if (pokemonCount>0){
                    trainer.increaseBadges();
                }else {
                    trainer.decreasePokemonHealth();
                }
            }
        }
        trainers.values().stream().sorted((t1,t2)->Integer.compare(t2.getNumberOfBadges(),t1.getNumberOfBadges())).forEach(System.out::println);
    }
}
