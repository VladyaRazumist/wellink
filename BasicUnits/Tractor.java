package BasicUnits;

import DefaultCommands.MoveForwardCommand;
import DefaultCommands.RotateCommand;
import Additional.Orientation;
import Additional.Position;
import TypesOfUnits.MovableUnit;


public class Tractor implements  MovableUnit<Tractor> {

   private final Position position;
   private final Orientation orientation;

   public Tractor (Position position, Orientation direction){
       this.position=position;
       this.orientation =direction;

   }
   public Tractor (int x,int y,Orientation direction){
       position=new Position(x,y);
       orientation=direction;
   }
@Override
    public Tractor move(MoveForwardCommand command){
       Position pos = position.move(command,orientation);
       Tractor tractor = new Tractor (pos,orientation);
       return tractor;
}

@Override
    public Tractor rotate(RotateCommand command) {
    return new Tractor(position, rotate(command.getSide()));
    }
@Override
    public Position getPosition(){
    return position;
    }

@Override
    public Orientation getOrientation() {

       return orientation;
    }
    @Override
    public void print (){
        System.out.println(" Direction "+orientation);
        System.out.println(" x "+position.getX()+" y " +position.getY());
    }


}