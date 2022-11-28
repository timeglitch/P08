public class SongNode {
    private SongNode next;
    private Song song;

    public SongNode(Song data) {
        next = null;
        song = data;
    }

    public SongNode(Song data, SongNode next) {
        this.next = next;
        song = data;
    }

    public SongNode getNext() {
        return next;
    }

    public Song getSong() {
        return song;
    }

    public void setNext(SongNode next) {
        this.next = next;
    }

}
