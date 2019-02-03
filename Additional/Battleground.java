package Additional;

import DefaultCommands.Command;
import TypesOfUnits.HavingPositionUnit;
import TypesOfUnits.Unit;
import java.util.ArrayList;
import java.util.List;

public class Battleground <U extends Unit<U>, C extends Command<U>> {
private final int x;
private final int y;
private List<U> units = new ArrayList<>();
 public Battleground (int x,int y){
     if (x<0 || y<0){
         throw new IllegalArgumentException("Battleground coordinates must be >0");
     }
     this.x=x;
     this.y=y;
 }
    public void addUnits (List <U> units){
     this.units.addAll(units);
 }
    public void addUnits (U unit){
     units.add(unit);
 }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public List getUnits (){
     return units;
    }

    public void actInBattle(C command ){
     System.out.println(command.getClass()+" :");
     for (U unit : units){
         try {
            unit=command.act(unit);
         }
         catch(ClassCastException ex) {}
         this.isLegalPosition(unit);

         System.out.println(unit.getClass());
         unit.print();
     }
 }
 private void isLegalPosition (U unit) {
     if (unit instanceof HavingPositionUnit){
         int x1=((HavingPositionUnit) unit).getPosition().getX();
         int y1=((HavingPositionUnit)unit).getPosition().getY();
         if (x1>x || x1<0 || y1>y || y1<0){
           throw new UnitOutOfBoundsException((HavingPositionUnit)unit);
         }
     }
 }

}
