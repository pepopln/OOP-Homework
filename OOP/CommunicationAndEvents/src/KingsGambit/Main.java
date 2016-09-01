package KingsGambit;

import KingsGambit.interfaces.CommandDispatcher;
import KingsGambit.interfaces.king.King;
import KingsGambit.interfaces.unit.Unit;
import KingsGambit.models.FoodMan;
import KingsGambit.models.KingImpl;
import KingsGambit.models.RoyalGuard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String kingName = reader.readLine();
        King king = new KingImpl(kingName);
        List<Unit> units = new LinkedList<>();
        String[] royalGuardsNames = reader.readLine().split("\\s+");
        addGuards(king,royalGuardsNames,units);
        String[] foodmenNames = reader.readLine().split("\\s+");
        addFootmen(king,foodmenNames,units);
        king.addUnits(units);

        CommandDispatcher commandDispatcher = new CommandDispatcherImpl(king);

        while (true){
            String[] params = reader.readLine().split("\\s+");
            if (params[0].toLowerCase().equals("end")){
                break;
            }
            commandDispatcher.execute(params);
        }


    }

    private static void addFootmen(King king, String[] foodmenNames, List<Unit> units) {
        for (String name : foodmenNames) {
            Unit unit = new FoodMan(name,king);
            units.add(unit);
        }
    }

    private static void addGuards(King king, String[] royalGuardsNames, List<Unit> units) {
        for (String name : royalGuardsNames) {
            Unit unit = new RoyalGuard(name,king);
            units.add(unit);
        }
    }
}
