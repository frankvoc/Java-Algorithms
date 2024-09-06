public class RemoteControllerTest {
    public static void main(String[] args) {
        //Lights
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Lights lights = new Lights();
        LightOnCommand lightOn = new LightOnCommands(lights);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        //Garage door
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommands garageDoorOpen = new GarageDoorOpenCommands(garageDoor);
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}
