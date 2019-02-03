package User.Units;

import Additional.Orientation;
import Additional.Position;
import DefaultCommands.RotateCommand;
import TypesOfUnits.HavingPositionUnit;
import TypesOfUnits.RotatableUnit;
import User.Commands.ShootCommand;
import User.Types.ShootingUnit;

public class DefensiveTower implements HavingPositionUnit<DefensiveTower>, RotatableUnit<DefensiveTower>, ShootingUnit<DefensiveTower> {
    private final Position position;
    private final Orientation orientation;
    private final int ammo;
    public DefensiveTower (Position position, Orientation orientation, int ammo){
        this.position=position;
        this.orientation=orientation;
        this.ammo=ammo;
    }
    public DefensiveTower (int x,int y,Orientation orientation, int ammo) {
        this.position=new Position(x,y);
        this.orientation=orientation;
        this.ammo=ammo;
    }
    public DefensiveTower(){
        this.position=new Position(0,0);
        this.orientation=Orientation.N;
        this.ammo=0;
    }
    @Override
    public Position getPosition (){
        return position;
    }
    @Override
    public int getAmmunition () {
        return ammo;
    }
    @Override
    public Orientation getOrientation (){
        return orientation;
    }
    @Override
    public DefensiveTower rotate (RotateCommand command){
        return new DefensiveTower(position,rotate(command.getSide()),ammo);

    }

    @Override
    public DefensiveTower shoot (ShootCommand command){
        return new DefensiveTower(position,orientation,shoot(command.getBullets()));
    }
    @Override
    public void print (){
        System.out.println(" Direction "+orientation);
        System.out.println(" x "+position.getX()+" y " +position.getY());
        System.out.println(" ammo "+ammo);
    }
}
