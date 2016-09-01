package BorderControl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Birthable> borns = new ArrayList<>();
        String[] info = reader.readLine().split("\\s+");
        while (true) {

            if (info[0].equals("End")) {
                break;
            }
          switch (info[0]){
              case "Citizen":
                  borns.add(new Person(info[1],info[2],info[3],info[4]));
                  break;
              case "Pet":
                  borns.add(new Pet(info[1],info[2]));
                  break;
          }
info=reader.readLine().split("\\s+");
        }
        String fakeNumber = reader.readLine();
        StringBuilder sb = new StringBuilder();
        for (Birthable birthable : borns) {

            if (birthable.getBirthdate().equals(fakeNumber)||birthable.getBirthdate().endsWith(fakeNumber)) {

                sb.append(birthable.getBirthdate());
                sb.append(System.lineSeparator());

            }
        }
        System.out.print(sb.toString());
    }
}
