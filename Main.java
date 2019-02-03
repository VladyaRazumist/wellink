import Additional.Battleground;
import BasicUnits.Stone;
import Additional.Orientation;
import BasicUnits.Tractor;
import BasicUnits.Wind;
import DefaultCommands.MoveForwardCommand;
import DefaultCommands.RotateCommand;
import TypesOfUnits.Unit;
import User.Commands.ShootCommand;
import User.Units.Tank;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
     /* Tractor tractor = new Tractor (0,0,Orientation.N);
      Tank tank=new Tank (0,0,Orientation.N,100);
      Stone stone = new Stone(5,5);
      Wind wind = new Wind (Orientation.W);
        List<Unit> list = new ArrayList<>();
        list.add(tractor);
        list.add(tank);
        list.add(stone);
        list.add(wind);
        RotateCommand command = new RotateCommand(true);
        MoveForwardCommand mfcommand=new MoveForwardCommand(1);
        ShootCommand shootCommand= new ShootCommand(10);
        for (Unit unit : list){
            try {
             unit =   command.act((RotatableUnit)unit);
             unit= mfcommand.act((MovableUnit)unit);
             unit= shootCommand.act((ShootingUnit) unit);
            }
            catch(ClassCastException ex) {}
            System.out.println(unit.getClass());
            unit.print();
        }
 */
        Battleground field = new Battleground(100,100);
        Tractor tractor = new Tractor (0,0,Orientation.N);
        Tank tank=new Tank (0,0,Orientation.N,100);
        Stone stone = new Stone(5,5);
        Wind wind = new Wind (Orientation.W);
        List<Unit> list = new ArrayList<>();
        list.add(tractor);
        list.add(tank);
        list.add(stone);
        list.add(wind);
        field.addUnits(list);
        int x=field.getX();
        System.out.println(x);
      //  MoveForwardCommand mfcommand=new MoveForwardCommand(101); // Exception works
       // field.actInBattle(mfcommand);
        MoveForwardCommand mFcommand = new MoveForwardCommand(15);
        RotateCommand rotCommand = new RotateCommand(false); // Rotate left
        ShootCommand shooTCommand= new ShootCommand(13); // 13 bullets
        field.actInBattle(rotCommand);
        field.actInBattle(mFcommand);
        field.actInBattle(shooTCommand);
    }
}
