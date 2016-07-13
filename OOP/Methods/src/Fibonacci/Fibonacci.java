package Fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    List<Long> getNumbersInRange(int startPosition,int endPosition) {


        List<Long> sequence = new ArrayList<>();
        sequence.add(0l);
        sequence.add(1l);
        for (int i = 2; i < endPosition; i++) {
            long first = sequence.get(i-2);
            long second = sequence.get(i-1);
            long num = first+second;
            sequence.add(num);
        }
        List<Long> result = new ArrayList<>();
        for (int i = startPosition; i < endPosition; i++) {
            result.add(sequence.get(i));
        }
        return result;
    }

}
