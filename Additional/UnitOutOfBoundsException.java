package Additional;

import TypesOfUnits.HavingPositionUnit;


public class UnitOutOfBoundsException extends RuntimeException{
    final HavingPositionUnit unit;
    final String message;
    final Position position;
    public UnitOutOfBoundsException (HavingPositionUnit  unit){
        this.unit=unit;
        this.position=unit.getPosition();
        message =unit.getClass()+ " trying to move outside battleground, desired position : " +
               " x : "+ position.getX()+ " y : "+position.getY();
    }
    @Override
    public String getMessage (){
        return message;
    }
    public Position getPosition(){
        return position;
    }
    public HavingPositionUnit getUnit (){
        return unit;
    }
}
