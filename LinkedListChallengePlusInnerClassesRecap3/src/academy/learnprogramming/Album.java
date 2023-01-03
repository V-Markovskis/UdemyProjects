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
        private ArrayList<Song> songList;

        public SongList() {
            this.songList = new ArrayList<>();
        }

        public boolean add(Song song) {
            if(songList.contains(song)) {
                System.out.println("Song is already in song list");
                return false;
            } else  {
                songList.add(song);
                System.out.println("Successfully added song to song list");
                return true;
            }
        }

        private Song findSong(String titleOfSong) {
            for(Song checkedSong:this.songList) {
                if(checkedSong.getTitle().equals(titleOfSong)) {
                    return checkedSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if(index >= 0 && index < this.songList.size()) {
                return this.songList.get(index);
            }
            return null;
        }
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title,duration));
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
