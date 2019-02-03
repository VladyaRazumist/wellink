package TypesOfUnits;

import DefaultCommands.RotateCommand;
import Additional.Orientation;

public interface RotatableUnit<U extends RotatableUnit<U>> extends Unit<U> {
    Orientation getOrientation ();
    U rotate(RotateCommand action);


    default  Orientation rotate (boolean right){
        if (right){
            return this.getOrientation().rotateRight();
        }else {
            return this.getOrientation().rotateLeft();
        }

    }

}
