package BasicUnits;

import DefaultCommands.RotateCommand;
import Additional.Orientation;
import TypesOfUnits.RotatableUnit;

public class Wind implements RotatableUnit <Wind> {
    private final Orientation orientation;
    public Wind (Orientation orientation){
        this.orientation=orientation;
    }
    public  Wind(){
        orientation=Orientation.N;
    }
    @Override
    public Wind rotate (RotateCommand command){
        return new Wind (rotate (command.getSide()));
    }
    @Override
    public Orientation getOrientation (){
        return orientation;
    }
    @Override
    public  void print (){
        System.out.println(" Direction "+orientation);

    }
}
