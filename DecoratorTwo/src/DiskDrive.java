public class DiskDrive extends RobotDecorator{
    public DiskDrive(Robot robot){
        super(robot);
    }
    public String assemble(){
        return robot.assemble() + " with a Disk Drive,";
    }
    public double cost(){
        return robot.cost() + 300.00;
    }
}
