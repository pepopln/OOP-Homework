package stackIterator;



import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
SimpleCommandDispatcherImpl simpleCommandDispatcher = new SimpleCommandDispatcherImpl();
        Core core = new Core(simpleCommandDispatcher);
        core.run();
    }
}
