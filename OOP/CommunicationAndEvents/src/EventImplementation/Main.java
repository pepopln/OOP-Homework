package EventImplementation;

import EventImplementation.models.DispatcherImpl;
import EventImplementation.models.HandlerImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DispatcherImpl dispatcher = new DispatcherImpl(null);
        HandlerImpl listener = new HandlerImpl();
        dispatcher.addNameChangeListener(listener);
        while (true){
            String line = reader.readLine();

            if (line.toLowerCase().equals("end")){
                break;
            }
            dispatcher.setName(line);
        }
    }
}
