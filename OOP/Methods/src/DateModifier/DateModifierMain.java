package DateModifier;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DateModifierMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DateModifier dateModifier = new DateModifier();
        String startDate = reader.readLine();
        String endDate = reader.readLine();
        System.out.println(dateModifier.getDayDifference(startDate,endDate));

    }
}
