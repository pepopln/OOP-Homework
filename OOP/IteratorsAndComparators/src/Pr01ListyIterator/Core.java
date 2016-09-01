package Pr01ListyIterator;




import stackIterator.SimpleCommandDispatcherImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Core {
    private ListyIterator<String> iterator;
    private SimpleCommandDispatcherImpl commandDispatcher;
    private BufferedReader reader;
    private boolean hasInput;

    public Core(SimpleCommandDispatcherImpl commandDispatcher) {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.commandDispatcher=commandDispatcher;
       // this.commandDispatcher.setCore(this);
        this.hasInput=true;
    }

    public ListyIterator<String> getIterator() {
        return iterator;
    }

    public void setIterator(List<String> elements) {
        this.iterator = new ListyIteratorImpl<>(elements);
    }

    public void run() throws IOException {

        while (this.hasInput){
            String line = this.reader.readLine();
            String[] args = line.split("\\s+");
            String command = args[0].trim();
            List<String> data = Arrays.stream(args).skip(1).collect(Collectors.toList());
            //this.commandDispatcher.dispatch(command,data);
        }
    }

    public void endInput() {
        this.hasInput=false;
    }


}
