public class Playlist implements QueueADT<Song> {
    private SongNode first;
    private SongNode last;
    private int numSongs;

    public Playlist() {
        numSongs = 0;
        first = last = null;
    }


    private void addFirst(SongNode element) {
        first = last = element;
        numSongs = 1;
    }
    @Override
    public void enqueue(Song element) {
        SongNode newNode = new SongNode(element);
        if (isEmpty()) {
            addFirst(newNode);
        }
        else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    @Override
    public Song dequeue() {
        Song output = first.getSong();
        first = first.getNext();
        return output;
    }

    @Override
    public Song peek() {
        return first.getSong();
    }

    @Override
    public boolean isEmpty() {
        return numSongs == 0;
    }

    @Override
    public int size() {
        return numSongs;
    }

    @Override
    public String toString() {
        String out = "";
        SongNode cur = first;
        for(int i = 0; i < numSongs; i++) {
            out = out + cur.getSong().toString() + System.lineSeparator();
            cur = cur.getNext();
        }
        return out;
    }


}
