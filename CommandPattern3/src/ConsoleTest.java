public class ConsoleTest {
    public static void main(String[] args) {
        //reciever
        WiiFit wiiDevice = new WiiFit();
        Mouse3D mouse3Device = new Mouse3D();
        BrainWave brainDevice = new BrainWave();

        //creating command objs
        WiiFitCommand onFit = new WiiFitCommand(wiiDevice);
        WiiFitOffCommand offFit = new WiiFitOffCommand(wiiDevice);

        Mouse3DCommand onMouse = new Mouse3DCommand(mouse3Device);
        Mouse3DOffCommand offMouse = new Mouse3DOffCommand(mouse3Device);

        BrainWaveCommand onBrain = new BrainWaveCommand(brainDevice);
        BrainWaveOffCommand offBrain = new BrainWaveOffCommand(brainDevice);

        //invoker
        USBConsole usbConsole = new USBConsole();

        //TESTING
        usbConsole.setOn(onBrain);
        usbConsole.setOff(offBrain);
        usbConsole.pressOn();
        usbConsole.pressOff();

        usbConsole.setOn(onFit);
        usbConsole.setOff(offFit);
        usbConsole.pressOn();
        usbConsole.pressOff();

        usbConsole.setOn(onMouse);
        usbConsole.setOff(offMouse);
        usbConsole.pressOn();
        usbConsole.pressOff();
    }
}
