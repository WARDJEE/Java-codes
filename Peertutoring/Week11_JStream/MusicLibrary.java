package Peertutoring.Week11_JStream;

import java.util.*;

public class MusicLibrary {
    // TODO: Define your collections here
    // private ... library;
    private Set<Song> library;
    // private ... artistMap;
    private Map<String, List<Song>> artistMap;

    public MusicLibrary() {
        // TODO: Initialize your collections
        this.library = new HashSet<>();
        this.artistMap = new HashMap<>();
    }

    public void addSong(Song s) {
        // TODO: Add to library (prevent duplicates)
        this.library.add(s);
        // TODO: Add to artist map
        this.artistMap.put(s.getArtist(), getSongsByArtist(s.getArtist()));
    }

    public List<Song> getSongsByArtist(String artist) {
        // TODO: Return the list for this artist, or an empty list if not found
        List<Song> songs = new ArrayList<>();
        for (Song song : this.library) {
            if (song.getArtist().equals(artist)){
                songs.add(song);
            }
        }
        if (songs.isEmpty()) return null;
        return songs;
    }

    public List<Song> getTopSongs() {
        // TODO: Return a sorted list
        List<Song> songs = new ArrayList<>(this.library);
        Collections.sort(songs, new SongComparator());
        return songs;
    }
}
