package academy.learnprogramming;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Blizzard","Song of destiny");
        album.addSong("Name1", 3.22);
        album.addSong("Name2", 4.22);
        album.addSong("Name3", 5.22);
        album.addSong("Name4", 6.22);
        album.addSong("Name5", 7.22);

        albums.add(album);

        album = new Album("Zeroing","Cataclysm");
        album.addSong("NoName1", 3.11);
        album.addSong("NoName2", 4.11);
        album.addSong("NoName3", 5.11);
        album.addSong("NoName4", 6.11);
        album.addSong("NoName5", 7.11);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Name1",playList);
        albums.get(0).addToPlayList("Name3",playList);
        albums.get(0).addToPlayList("Name2",playList);
        albums.get(0).addToPlayList("Name4",playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(4,playList);

        playMenu(playList);
    }

    private static void playMenu(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean forward = true;
        boolean quit = false;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            switch (action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next());
                    } else {
                        System.out.println("We are at the end of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of playlist");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We are at the start of playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }

    }






    private static void printMenu() {
        System.out.println("Available option:\npress:");
        System.out.println("0 - Quit\n" +
                "1 - Skip forward\n" +
                "2 - Skip backwards\n" +
                "3 - Replay the current song\n" +
                "4 - Show list of songs in playlist\n" +
                "5 - print available actions.");
    }

    public static void printList(LinkedList<Song> playList) {
        Iterator<Song> i = playList.iterator();
        System.out.println("=========================");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("=========================");
    }
}
