package Froggy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] elements = reader.readLine().split("[,\\s]+");
        Integer[] elementsAsInts = new Integer[elements.length];
        for (int i = 0; i < elementsAsInts.length; i++) {
            elementsAsInts[i] = Integer.valueOf(elements[i]);
        }
        Lake lake = new Lake(elementsAsInts);
        StringBuilder builder = new StringBuilder();
        for (Integer integer : lake) {
            builder.append(integer).append(", ");

        }
        builder.setLength(builder.length()-2);
        System.out.println(builder.toString());
    }
}
