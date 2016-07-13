package LastDigitName;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Number number = new Number();
        System.out.println(number.nameLastDigit(Integer.parseInt(reader.readLine())));
    }
}
