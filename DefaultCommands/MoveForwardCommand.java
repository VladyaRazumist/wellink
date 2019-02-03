package DefaultCommands;

import TypesOfUnits.MovableUnit;

public class MoveForwardCommand<U extends MovableUnit<U>>  implements Command<U> {
   private final int distance;
    public MoveForwardCommand(){
        this.distance=1;
    }
     public MoveForwardCommand(int distance){
         this.distance=distance;
     }
     public int GetDistance (){
        return distance;
     }
     @Override
     public U act (U unit) {

        return unit.move(this);
     }

}
