package onlineBookShop;
public class AudioBook extends Item {
    private int audioLength;
    
    public AudioBook(int audioLength) {
    	super();
        this.audioLength = audioLength;
    }
    public int getAudioLength() {
        return audioLength;
    }
    public void setAudioLength(int audioLength) {
        this.audioLength = audioLength;
    }
}