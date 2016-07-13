package Telephony;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split("\\s+");
        String[] urls = reader.readLine().split("\\s+");
        SmartPhone smartPhone = new SmartPhone();
        for (String number : numbers) {
            System.out.println(smartPhone.call(number));
        }
        for (String url : urls) {
            System.out.println(smartPhone.browse(url));
        }
    }
}
