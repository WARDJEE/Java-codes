package Peertutoring.Week11_JStream;

import java.util.List;

public class Main {
    public static void main() {
        MusicLibrary spotify = new MusicLibrary();

        Song s1 = new Song("Hello", "Adele", 295, 5000);
        Song s2 = new Song("Hello", "Adele", 300, 100); // Should be considered a duplicate!
        Song s3 = new Song("Bohemian Rhapsody", "Queen", 354, 9999);
        Song s4 = new Song("Someone Like You", "Adele", 285, 4000);

        System.out.println("--- Adding Songs ---");
        spotify.addSong(s1);
        spotify.addSong(s2); // Should fail/ignore
        spotify.addSong(s3);
        spotify.addSong(s4);

        System.out.println();
        System.out.println("--- Testing Duplicates ---");
        // Print total number of songs in library (Should be 3, not 4)
        System.out.println(spotify.getTopSongs().size());

        System.out.println();
        System.out.println("--- Testing Map ---");
        System.out.println("Songs by Adele: " + spotify.getSongsByArtist("Adele"));

        System.out.println();
        System.out.println("--- Testing Sort ---");
        List<Song> sorted = spotify.getTopSongs();
        for (Song s : sorted) {
            System.out.println(s);
        }
    }
}

