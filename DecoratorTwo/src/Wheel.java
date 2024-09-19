public class Wheel  extends RobotDecorator{
    public Wheel(Robot robot){
        super(robot);
    }
    public String assemble(){
        return robot.assemble() + " with wheels,";
    }
    public double cost(){
        return robot.cost() + 250.00;
    }

}
