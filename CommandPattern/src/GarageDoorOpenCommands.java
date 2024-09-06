public class GarageDoorOpenCommands implements Commands {
    GarageDoor garageDoor;
    public GarageDoorOpenCommands(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    public void execute() {
        garageDoor.up();
    }
}
