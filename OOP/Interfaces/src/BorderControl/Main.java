package BorderControl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Checker> citizens = new ArrayList<>();
        String[] info = reader.readLine().split("\\s+");
        while (true) {

            if (info[0].equals("End")) {
                break;
            }
            if (info.length == 2) {
                citizens.add(new Robot(info[0], info[1]));
            } else {
                citizens.add(new Person(info[0], info[1], info[2]));
            }

info=reader.readLine().split("\\s+");
        }
        String fakeNumber = reader.readLine();
        StringBuilder sb = new StringBuilder();
        for (Checker citizen : citizens) {

            if (citizen.getId().equals(fakeNumber)||citizen.getId().substring(citizen.getId().length() - 3).equals(fakeNumber)) {

                sb.append(citizen.getId());
                sb.append(System.lineSeparator());

            }
        }
        System.out.println(sb.toString());
    }
}
