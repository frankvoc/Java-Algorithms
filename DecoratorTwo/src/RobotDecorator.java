public abstract class RobotDecorator implements Robot{
    protected Robot robot;
    public RobotDecorator(Robot robot){
        this.robot = robot;
    }
    public String assemble(){
        return robot.assemble();
    }
    public double cost(){
        return robot.cost();
    }
}
