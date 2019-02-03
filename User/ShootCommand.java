package User.Commands;

import DefaultCommands.Command;
import User.Types.ShootingUnit;

public class ShootCommand<U extends ShootingUnit<U>>  implements Command<U> {
private final int bullets;
 public ShootCommand(){
     this.bullets=1;
 }
 public ShootCommand (int value){
     this.bullets=value;
 }
 public int getBullets () {
     return bullets;
 }
    @Override
   public U act (U unit){
        return unit.shoot(this);
    }

}
