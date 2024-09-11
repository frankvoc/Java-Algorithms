public class WiiFitOffCommand implements Command{
    private WiiFit device;
    public WiiFitOffCommand(WiiFit device){
        this.device = device;
    }
    public void execute(){
        device.powerOff();
    }
    public void undo(){
        device.powerOn();
    }
}
