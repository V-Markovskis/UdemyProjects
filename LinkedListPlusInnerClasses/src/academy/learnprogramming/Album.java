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
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add (Song song) {
            if(this.songs.contains(song)) {
                return false;
            } else {
                this.songs.add(song);
                return true;
            }
        }

        private Song findSong(String titleOfSong) {
            for(int i = 0; i < this.songs.size(); i++) {
                Song songToCheck = this.songs.get(i);
                if(songToCheck.getTitle().equals(titleOfSong)) {
                    return songToCheck;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if(index >= 0 && index < songs.size()) {
                return this.songs.get(index);
            }
            return null;
        }
    }

    public boolean addSong(String titleOfSong, double durationOfSong) {
        return this.songs.add(new Song(titleOfSong, durationOfSong));
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(titleOfSong);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        return false;
    }
}
