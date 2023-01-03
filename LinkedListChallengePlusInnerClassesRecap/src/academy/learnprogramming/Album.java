package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public class SongList {
        private ArrayList<Song> trackList;

        public SongList() {
            this.trackList = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if (this.trackList.contains(song)) {
                return false;
            } else {
                this.trackList.add(song);
                return true;
            }
        }

        private Song findSong(String title) {
            for (Song checkedSong : this.trackList) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if(index >= 0 && index < this.trackList.size()) {
                return this.trackList.get(index);
            }
            return null;
        }
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title,duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song checkedSong = this.songs.findSong(title);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }
}
