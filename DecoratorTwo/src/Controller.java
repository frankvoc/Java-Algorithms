public class Controller extends RobotDecorator{
    public Controller(Robot robot){
        super(robot);
    }
    public String assemble(){
        return robot.assemble() + " with a controller,";
    }
    public double cost(){
        return robot.cost() + 50.00;
    }
}
