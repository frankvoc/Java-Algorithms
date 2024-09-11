public class Mouse3DOffCommand implements Command{
    private Mouse3D device;

    public Mouse3DOffCommand(Mouse3D device){
        this.device = device;
    }
    public void execute(){
        device.powerOff();
    }
    public void undo(){
        device.powerOn();
    }
    
}
