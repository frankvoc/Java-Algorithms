public class WiiFitCommand implements Command{
    private WiiFit device;
    public WiiFitCommand(WiiFit device){
        this.device = device;
    }
    public void execute(){
        device.powerOn();
    }
    public void undo(){
        device.powerOff();
    }
}
