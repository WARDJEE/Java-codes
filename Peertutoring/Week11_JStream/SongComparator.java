package Peertutoring.Week11_JStream;

import java.util.Comparator;

public class SongComparator implements Comparator<Song> {
    public int compare(Song s1, Song s2){
        int played = s2.getPlayCount()-s1.getPlayCount();
        if (played != 0) return played;

        return s1.getDuration()-s2.getDuration();
    }

}
