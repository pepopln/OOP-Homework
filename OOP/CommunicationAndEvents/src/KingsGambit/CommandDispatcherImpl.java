package KingsGambit;

import KingsGambit.interfaces.CommandDispatcher;
import KingsGambit.interfaces.king.King;
import KingsGambit.interfaces.unit.Unit;

import java.util.LinkedList;
import java.util.List;

public class CommandDispatcherImpl implements CommandDispatcher{

    private King king;
    private List<Unit> units;

    public CommandDispatcherImpl(King king) {
        this.king = king;

    }

    @Override
    public void execute(String... args) {
        switch (args[0]){
            case "Attack":
                this.king.respondToAttack();
                break;
            case "Kill":
                String unitName = args[1];
                this.king.respondToKill(unitName);
                break;
            default:
                throw new IllegalStateException();

        }
    }
}
