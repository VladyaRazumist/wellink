package TypesOfUnits;

import Additional.Position;


public interface HavingPositionUnit <U extends HavingPositionUnit<U>> extends Unit<U> {

Position getPosition();

}
