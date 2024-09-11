public class BrainWaveCommand implements Command{
    private BrainWave device;
    public BrainWaveCommand(BrainWave device){
        this.device = device;
    }
    public void execute(){
        device.powerOn();
    }
    public void undo(){
        device.powerOff();
    }
}
