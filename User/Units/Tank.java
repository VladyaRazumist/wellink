package User.Units;

import Additional.Orientation;
import Additional.Position;
import DefaultCommands.MoveForwardCommand;
import DefaultCommands.RotateCommand;
import TypesOfUnits.HavingPositionUnit;
import TypesOfUnits.MovableUnit;
import TypesOfUnits.RotatableUnit;
import User.Commands.ShootCommand;
import User.Types.ShootingUnit;

public class Tank implements  MovableUnit<Tank>,HavingPositionUnit<Tank>, RotatableUnit<Tank>, ShootingUnit<Tank> {
    private final Position position;
    private final Orientation orientation;
    private final int ammo;

    public Tank(Position position, Orientation orientation, int ammo) {
        this.position = position;
        this.orientation = orientation;
        this.ammo = ammo;
    }

    public Tank(int x, int y, Orientation orientation, int ammo) {
        this.position = new Position(x, y);
        this.orientation = orientation;
        this.ammo = ammo;
    }

    public Tank() {
        this.position = new Position(0, 0);
        this.orientation = Orientation.N;
        this.ammo = 0;
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
    public Tank rotate (RotateCommand command){
        return new Tank(position,rotate(command.getSide()),ammo);

    }

    @Override
    public Tank shoot (ShootCommand command){
        return new Tank(position,orientation,shoot(command.getBullets()));
    }
    @Override
    public void print (){
        System.out.println(" Direction "+orientation);
        System.out.println(" x "+position.getX()+" y " +position.getY());
        System.out.println(" ammo "+ammo);
    }
    @Override
    public Tank move(MoveForwardCommand command) {
        Position pos = position.move(command, orientation);
        Tank tank = new Tank(pos, orientation, ammo);
        return tank;
    }

}