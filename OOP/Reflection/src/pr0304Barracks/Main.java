package pr0304Barracks;

import pr0304Barracks.contracts.CommandInterpreter;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.Runnable;
import pr0304Barracks.contracts.UnitFactory;
import pr0304Barracks.core.Engine;
import pr0304Barracks.core.factories.UnitFactoryImpl;
import pr0304Barracks.data.UnitRepository;

public class Main {

	public static void main(String[] args) {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		//Injector dependencyInjector = new DependencyInjector();
		//CommandInterpreter commandInterpreter = new CommandInterpreterImpl(repository, unitFactory, dependencyInjector);
		Runnable engine = new Engine(repository, unitFactory);
		engine.run();
	}
}
