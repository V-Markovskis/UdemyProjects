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
            this.trackList = new ArrayList<>();
        }

        public boolean add(Song song) {
            if(this.trackList.contains(song)) {
                return false;
            } else {
                this.trackList.add(song);
                return true;
            }
        }

        private Song findSong(String title) {
            for(Song checkedSong:this.trackList) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if(index >= 0 && index < this.trackList.size()) {
                Song checkedSong = this.trackList.get(index);
                return checkedSong;
            }
            return null;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song checkedSong = songs.findSong(trackNumber);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song checkedSong = songs.findSong(title);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }
}
