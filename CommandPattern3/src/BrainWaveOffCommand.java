public class BrainWaveOffCommand implements Command{
    private BrainWave device;
    public BrainWaveOffCommand(BrainWave device){
        this.device = device;
    }
    public void execute(){
        device.powerOff();
    }
    public void undo(){
        device.powerOn();
    }
}
