package Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Thruple> thruples = new ArrayList<>();

        thruples.add(getFirstThruple(reader));
        thruples.add(getSecondThruple(reader));
        thruples.add(getThirdThruple(reader));

        for (Thruple thruple : thruples) {
            System.out.println(thruple);
        }
    }

    private static Thruple getThirdThruple(BufferedReader reader) throws IOException {
        String[] line = reader.readLine().split("\\s+");
        String name = line[0];
        Double accBalance = Double.valueOf(line[1]);
        String bankName = line[2];

        return new Tuple(name, accBalance, bankName);
    }

    private static Thruple getSecondThruple(BufferedReader reader) throws IOException {
        String[] line = reader.readLine().split("\\s+");
        String name = line[0];
        Integer beerLtrs = Integer.valueOf(line[1]);
        boolean drankOrNot = line[2].equals("drunk");

        return new Tuple(name, beerLtrs, drankOrNot);
    }

    private static Thruple getFirstThruple(BufferedReader reader) throws IOException {
        String[] line = reader.readLine().split("\\s+");
        String name = line[0] + " " + line[1];
        String address = line[2];
        String town = line[3];
        return new Tuple(name, address, town);
    }

}
