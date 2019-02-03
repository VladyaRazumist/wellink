package User.Types;


import TypesOfUnits.Unit;
import User.Commands.ShootCommand;

public interface ShootingUnit<U extends ShootingUnit<U>> extends Unit<U> {
  U shoot (ShootCommand command);

  int getAmmunition ();
  default int shoot (int bullets) {
      return getAmmunition()-bullets;
  }
}
