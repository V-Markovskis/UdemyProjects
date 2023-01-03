package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String titleOfSong, double durationOfSong) {
        if(findSong(titleOfSong) == null) {
            this.songs.add(new Song(titleOfSong,durationOfSong));
            return true;
        }
        System.out.println("Song with title " + titleOfSong + " already in album");
        return false;
    }

    private Song findSong(String titleOfSong) {
        for(int i = 0; i < songs.size(); i++) {
            Song checkedSong = songs.get(i);
            if(checkedSong.getTitle().equals(titleOfSong)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if(index >= 0 && index <= this.songs.size()) {
            playList.add(this.songs.get(index));
            System.out.println("Song with track number " + trackNumber + " added to playlist");
            return true;
        }
        System.out.println("Song with " + trackNumber + " was not found");
        return false;
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playList) {
        Song checkedSong = findSong(titleOfSong);
        if(checkedSong != null) {
            playList.add(checkedSong);
            System.out.println("Song with title " + titleOfSong + " added to playlist");
            return true;
        }
        System.out.println("Song with title " + titleOfSong + " is not in this album");
        return false;
    }
}
