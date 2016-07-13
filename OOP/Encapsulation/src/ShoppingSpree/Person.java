package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> bagOfProducts;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.bagOfProducts=new ArrayList<>();
    }

    public void setName(String name) {
        if (name==null||name.trim().length()==0){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setMoney(double money) {
        if (money<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public boolean tryBuyProduct(Product product){
        if (product.getCost()>this.getMoney()){
            return false;
        }
        this.setMoney(this.getMoney()-product.getCost());
        this.bagOfProducts.add(product);
        return true;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(String.format("%s - ",this.name));
        if (this.bagOfProducts.size()!=0){
            output.append(this.bagOfProducts.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }else {
            output.append("Nothing bought");
        }

        return output.toString();
    }
}
