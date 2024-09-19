public class Keyboard extends RobotDecorator{
    public Keyboard(Robot robot){
        super(robot);
    }
    public String assemble(){
        return robot.assemble() + " with a Keyboard,";
    }
    public double cost(){
        return robot.cost() + 125.00;
    }
}
