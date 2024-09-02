public class Sound {
    public String soundName;
    public int lengthOfSoundInSeconds;

    public Sound(String soundName, int lengthOfSoundInSeconds){
        this.soundName = soundName;
        this.lengthOfSoundInSeconds = lengthOfSoundInSeconds;
    }
    

    public String getSoundName() {
        return soundName;
    }


    public void setSoundName(String soundName) {
        this.soundName = soundName;
    }


    public int getLengthOfSoundInSeconds() {
        return lengthOfSoundInSeconds;
    }


    public void setLengthOfSoundInSeconds(int lengthOfSoundInSeconds) {
        this.lengthOfSoundInSeconds = lengthOfSoundInSeconds;
    }

    public String toString(){
        return "Sound name is: " + soundName + ", length of sound is about: " + lengthOfSoundInSeconds + " seconds";
    }
}
