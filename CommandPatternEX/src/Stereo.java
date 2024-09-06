public class Stereo {
    int volume;
    String room;
    public Stereo(String room){
        this.room = room;
    }
    public void on(){
        System.out.println(room + " stereo is on");
    }
    public void off(){
        System.out.println(room + " stereo is off");
    }
    public void setCD(){
        System.out.println(room + " stereo is set for CD Input");
    }
    public void setDVD(){
        System.out.println(room + " stereo is set for DVD input");
    }
    public void setRadio(){
        System.out.println(room + " stereo is set for Radio input");
    }
    public void setVolume(){
        System.out.println(room + " stereo volume is set to" + volume);
    }
}
