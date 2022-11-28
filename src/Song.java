import java.io.IOException;

public class Song {
    private String artist;
    private AudioUtility audioClip;
    private int duration;
    private String title;


    public Song(String title, String artist, String filepath) throws IllegalArgumentException {
        this.title = title;
        this.artist = artist;
        try {
            this.audioClip = new AudioUtility(filepath);
        }
        catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        this.duration = audioClip.getClipLength();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public boolean isPlaying() {
        return audioClip.isRunning();
    }

    public void play() {
        if(audioClip.isReadyToPlay()) {
            audioClip.startClip();
        }
        else {
            audioClip.reopenClip();
        }
        System.out.println("Playing..." + toString());
    }

    public void stop() {
        audioClip.stopClip();
    }

    @Override
    public String toString() {
        return "\"" + getTitle() + "\" (" + Integer.toString(duration/60) + ":" + Integer.toString(duration%60)+") by " + getArtist(); 
    }

}
