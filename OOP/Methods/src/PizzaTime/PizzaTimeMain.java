package PizzaTime;


import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PizzaTimeMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        Pizza pizza = new Pizza();
        Map<Integer,List<String>> result = pizza.PizzaGroups(input);
        for (Map.Entry<Integer, List<String>> entry : result.entrySet()) {
            System.out.printf("%d - %s",entry.getKey(),String.join(", ",entry.getValue()));
            System.out.println();
        }
        Class<?> pizzaClass = Pizza.class;
        Method[] methods = pizzaClass.getDeclaredMethods();
        List<Method> checkedMethods = Arrays.stream(methods)
                .filter(m -> m.getReturnType().getName().contains("Map"))
                .collect(Collectors.toList());

        if (checkedMethods.size() < 1) {
            throw new ClassFormatException();
        }

    }
}
