public class Mouse3DCommand implements Command{
    private Mouse3D device;
    
    public Mouse3DCommand(Mouse3D device){
        this.device = device;
    }

    public void execute(){
        device.powerOn();
    }
    public void undo(){
        device.powerOff();
    }
}
