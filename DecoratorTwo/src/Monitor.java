public class Monitor extends RobotDecorator{
    public Monitor(Robot robot){
        super(robot);
    }
    public String assemble(){
        return robot.assemble() + " with a Monitor,";
    }
    public double cost(){
        return robot.cost() + 450.00;
    }

}
