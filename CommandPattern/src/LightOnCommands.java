public class LightOnCommands implements Commands{
    Lights lights;
    public LightOnCommands(Lights lights){
        this.lights= lights;
    }
    public void execute(){
        lights.on();
    }
}
