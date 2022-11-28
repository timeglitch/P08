import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MusicPlayer300 {

    private String filterArtist;
    private boolean filterPlay;
    private Playlist playlist;

    public MusicPlayer300() {
        filterArtist = null;
        filterPlay = false;
        playlist = new Playlist();
    }

    public void clear() {

    }

    public void loadPlaylist(File file) throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()) {

        }

    }

    public void loadOneSong(String title, String artist, String filepath) {
        playlist.enqueue(new Song(title, artist, filepath));
        

    }

    
}
