import java.util.*;

class Song {
    int songId;
    String songName;
    String singerName;
    double duration;

    Song next;
    Song prev;

    Song(int songId, String songName, String singerName, double duration) {
        this.songId = songId;
        this.songName = songName;
        this.singerName = singerName;
        this.duration = duration;
        next = prev = null;
    }
}

class Playlist {

    Song head = null;
    Song tail = null;
    Song current = null;

    // Add song at beginning
    public void addAtBeginning(int id, String name, String singer, double duration) {

        Song newSong = new Song(id, name, singer, duration);

        if (head == null) {
            head = tail = newSong;
        } else {
            newSong.next = head;
            head.prev = newSong;
            head = newSong;
        }

        System.out.println("Song added at beginning.");
    }

    // Add song at end
    public void addAtEnd(int id, String name, String singer, double duration) {

        Song newSong = new Song(id, name, singer, duration);

        if (head == null) {
            head = tail = newSong;
        } else {
            tail.next = newSong;
            newSong.prev = tail;
            tail = newSong;
        }

        System.out.println("Song added at end.");
    }

    // Display playlist
    public void displayPlaylist() {

        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        Song temp = head;

        System.out.println("\nPlaylist:");

        while (temp != null) {
            System.out.println(
                temp.songId + " | " +
                temp.songName + " | " +
                temp.singerName + " | " +
                temp.duration + " mins"
            );

            temp = temp.next;
        }
    }

    // Search song
    public void searchSong(String name) {

        Song temp = head;

        while (temp != null) {

            if (temp.songName.equalsIgnoreCase(name)) {

                System.out.println("Song Found:");
                System.out.println(
                    temp.songId + " | " +
                    temp.songName + " | " +
                    temp.singerName
                );

                return;
            }

            temp = temp.next;
        }

        System.out.println("Song not found.");
    }

    // Remove song
    public void removeSong(int id) {

        if (head == null) {
            System.out.println("Playlist empty.");
            return;
        }

        Song temp = head;

        while (temp != null) {

            if (temp.songId == id) {

                // only one node
                if (head == tail) {
                    head = tail = null;
                }

                // remove head
                else if (temp == head) {
                    head = head.next;
                    head.prev = null;
                }

                // remove tail
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }

                // middle node
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Song removed.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Song not found.");
    }

    // Start playing
    public void playFirstSong() {

        if (head == null) {
            System.out.println("Playlist empty.");
            return;
        }

        current = head;

        System.out.println("Now Playing: " + current.songName);
    }

    // Play next song
    public void playNext() {

        if (current == null || current.next == null) {
            System.out.println("No next song.");
            return;
        }

        current = current.next;

        System.out.println("Now Playing: " + current.songName);
    }

    // Play previous song
    public void playPrevious() {

        if (current == null || current.prev == null) {
            System.out.println("No previous song.");
            return;
        }

        current = current.prev;

        System.out.println("Now Playing: " + current.songName);
    }

    // Shuffle playlist
    public void shufflePlaylist() {

        if (head == null) {
            return;
        }

        ArrayList<Song> list = new ArrayList<>();

        Song temp = head;

        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        Collections.shuffle(list);

        System.out.println("\nShuffled Playlist:");

        for (Song s : list) {
            System.out.println(s.songName);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Playlist p = new Playlist();

        p.addAtEnd(1, "Perfect", "Ed Sheeran", 4.5);
        p.addAtEnd(2, "Believer", "Imagine Dragons", 3.8);
        p.addAtBeginning(3, "Shape of You", "Ed Sheeran", 4.2);

        p.displayPlaylist();

        p.searchSong("Believer");

        p.playFirstSong();
        p.playNext();
        p.playPrevious();

        p.removeSong(2);

        p.displayPlaylist();

        p.shufflePlaylist();
    }
}
