package BasicUnits;

import Additional.Position;
import TypesOfUnits.HavingPositionUnit;

public class Stone implements HavingPositionUnit <Stone> {
    private final Position position;
    public Stone (Position position){
        this.position=position;
    }
    public Stone (int x,int y){
        this.position=new Position(x,y);
    }

    public Position getPosition() {
        return position;
    }
    @Override
    public void print (){
        System.out.println(" x "+position.getX()+" y " +position.getY());
    }
}
