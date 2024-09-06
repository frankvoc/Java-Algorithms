public class SimpleRemoteControl {
    Commands slot;
    public void setCommand(Commands commands){
        slot = commands;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
