package TypesOfUnits;

import DefaultCommands.MoveForwardCommand;

public interface MovableUnit<U extends MovableUnit<U>> extends RotatableUnit<U>, HavingPositionUnit<U> {
     U move(MoveForwardCommand action);
    }


