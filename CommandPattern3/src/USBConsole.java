public class USBConsole {
    private Command onCommand;
    private Command offCommand;

    public void setOn(Command onCommand){
        this.onCommand = onCommand;
    }
    public void setOff(Command offCommand){
        this.offCommand = offCommand;
    }
    public void pressOn(){
        onCommand.execute();
    }
    public void pressOff(){
        offCommand.execute();
    }
}
