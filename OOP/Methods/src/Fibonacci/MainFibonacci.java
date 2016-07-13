package Fibonacci;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class MainFibonacci {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Fibonacci fibonacci = new Fibonacci();
        int startPosition = Integer.valueOf(br.readLine());
        int endPosition = Integer.valueOf(br.readLine());
        List<Long> result = fibonacci.getNumbersInRange(startPosition,endPosition);
        String output = result.stream().map(Object::toString).collect(Collectors.joining(", "));
        System.out.println(output);

    }
}
