package Pr01ListyIterator;

import stackIterator.SimpleCommandDispatcherImpl;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        SimpleCommandDispatcherImpl commandDispatcher = new SimpleCommandDispatcherImpl();
        Core core = new Core(commandDispatcher);
        core.run();
    }

}
