package DefaultCommands;

import TypesOfUnits.RotatableUnit;

public class RotateCommand<U extends RotatableUnit<U>> implements Command<U> {
    boolean right;
    public RotateCommand(boolean side){
        right =side;
    }
    public boolean getSide () {
        return right;
    }
    @Override
    public U act (U unit) {

        return unit.rotate(this);
        }

    }



