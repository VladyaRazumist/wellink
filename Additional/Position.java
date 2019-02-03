package Additional;

import DefaultCommands.MoveForwardCommand;

public class Position {
    private  int x;
    private  int y;
    public Position(int x,int y){
        if (x>0 || y>0) {
            throw new IllegalArgumentException("Position coordinates must be >0");
        }
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
 public Position move (MoveForwardCommand command, Orientation direction){
     if (direction.equals(Orientation.N)) {
         y+=command.GetDistance();
     }
     if (direction.equals(Orientation.S)) {
         y-=command.GetDistance();
     }
     if (direction.equals(Orientation.W)) {
         x-=command.GetDistance();
     }
     if (direction.equals(Orientation.E)) {
         x+=command.GetDistance();
     }
    return new Position(x,y);
 }

}
