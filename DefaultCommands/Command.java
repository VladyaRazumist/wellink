package DefaultCommands;


import TypesOfUnits.Unit;

public interface Command<U extends Unit<U>> {
    U act (U unit);
}
