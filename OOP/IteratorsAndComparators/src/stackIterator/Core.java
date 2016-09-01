package stackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Core {
private SimpleCommandDispatcherImpl commandDispatcher;
    private BufferedReader reader;

    public Core(SimpleCommandDispatcherImpl commandDispatcher) {
        this.commandDispatcher = commandDispatcher;
        this.reader=new BufferedReader(new InputStreamReader(System.in));
    }
    public void run() throws IOException {
        while (true){
            String[] params = this.reader.readLine().split("[ ,]+");
            String command = params[0];
            List<Integer> toPush = Arrays.stream(params).skip(1).map(Integer::parseInt).collect(Collectors.toList());
            this.commandDispatcher.dispatch(command,toPush);
            if (command.equals("END")){
                break;
            }
        }
    }
}
