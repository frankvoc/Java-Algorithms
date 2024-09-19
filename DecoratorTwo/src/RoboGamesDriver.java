public class RoboGamesDriver {
    public static void main(String[] args) {
        Robot robot = new HumanoidRobot();

        //basic humanoid Robot
        System.out.println(robot.assemble() + " Cost: " + robot.cost());

        //robot with wheel and controller
        robot = new Wheel(robot);
        robot = new Controller(robot);

        System.out.println(robot.assemble() + " Cost: " + robot.cost());

        //full beans robot
        robot = new DiskDrive(robot);
        robot = new Controller(robot);
        robot = new Monitor(robot);
        robot = new Keyboard(robot);
        robot = new Wheel(robot);
        System.out.println(robot.assemble()+ " Cost: " + robot.cost());
    }
}
