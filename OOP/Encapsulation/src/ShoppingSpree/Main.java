package ShoppingSpree;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Person> costumers = new LinkedHashMap<>();
        HashMap<String,Product> products = new HashMap<>();
        String[] peopleArgs = reader.readLine().split(";");
        for (String s : peopleArgs) {
            String[] params = s.split("=");
            String name = params[0];
            Double money = Double.parseDouble(params[1]);
            try{
                Person person = new Person(name,money);
                costumers.put(name,person);
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                return;
            }
        }
        String[] productsArgs = reader.readLine().split(";");
        for (String entry : productsArgs) {
            String[] params = entry.split("=");
            String name = params[0];
            double costs = Double.parseDouble(params[1]);
            try {
                Product product=new Product(name,costs);
                products.put(name,product);
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                return;
            }
        }
        while (true){
            String[] input = reader.readLine().split("\\s+");
            if (input[0].equals("END")){
                break;
            }
            Person costumer = costumers.get(input[0]);
            Product product = products.get(input[1]);

            boolean bought = costumer.tryBuyProduct(product);
            if (bought){
                System.out.printf("%s bought %s%n",costumer.getName(),product.getName());

            }else {
                System.out.printf("%s can't afford %s%n",costumer.getName(),product.getName());
            }
        }
        for (Person person : costumers.values()) {
            System.out.println(person);
        }

    }

}
