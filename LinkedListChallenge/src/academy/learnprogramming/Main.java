package academy.learnprogramming;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static LinkedList<Songs> playList = new LinkedList<>();
    private static ListIterator<Songs> listIterator;
    private static Album album = new Album();
    private static int i = 0, j = 0;
    private static boolean isForward = true;

    public static void main(String[] args) {
        Songs HelloSong = new Songs("Hello", 4.5);
        Songs HiSong = new Songs("Here I am", 5.6);
        Songs QuickPlaySong = new Songs("Quick play", 7.8);
        Songs YesSong = new Songs("Yes Boss", 6);
        album.addSongToAlbum(HelloSong);
        album.addSongToAlbum(HiSong);
        album.addSongToAlbum(QuickPlaySong);
        album.addSongToAlbum(YesSong);
        album.addSongToPlaylist(playList, HelloSong);
        album.addSongToPlaylist(playList, HiSong);
        album.addSongToPlaylist(playList, QuickPlaySong);
        playList = album.addSongToPlaylist(playList, YesSong);
        listIterator = playList.listIterator();
        int choice = 0;
        printMenu();
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    quit = true;
                    break;
                case 2:
                    printMenu();
                    break;
                case 3:
                    forwardSong();
                    break;
                case 4:
                    backwardSong();
                    break;
                case 5:
                    replaySong();
                    break;
                case 6:
                    printSongList();
                    break;
                default:
                    System.out.println("You have entered incorrect choice");
                    break;
            }
        }

    }

    public static void printMenu() {
        System.out.println("Enter key to" +
                "\t\n 1 - To quit application" +
                "\t\n 2 - To print menu list" +
                "\t\n 3 - To forward song" +
                "\t\n 4 - To backward song" +
                "\t\n 5 - To replay song" +
                "\t\n 6 - To print song list");
    }

    public static void forwardSong() {
        if (i > 0) {
            if (listIterator.hasNext()) {
                listIterator.next();
                i = 0;
            }
        }
        if (i == 0) {
            isForward = true;
            if (listIterator.hasNext()) {
                System.out.println("Now playing song " + listIterator.next().toString());
                j++;
            }
        } else {
            System.out.println("You are at the end of the list");
        }
    }

    public static void backwardSong() {
        if (j > 0) {
            if (listIterator.hasPrevious()) {
                listIterator.previous();
                j = 0;
            }
        }
        if (j == 0) {
            isForward = false;
            if (listIterator.hasPrevious()) {
                System.out.println("Now playing song " + listIterator.previous().toString());
                i++;
            }
        } else {
            System.out.println("You are at the start of the list");
        }
    }

    public static void replaySong() {
        if (isForward == true) {
            if (listIterator.hasPrevious()) {
                System.out.println("Now playing song" + listIterator.previous().toString());
                listIterator.next();
            }
        } else {
            if (listIterator.hasNext()) {
                System.out.println("Now playing song " + listIterator.next().toString());
                listIterator.previous();
            }else{
                System.out.println("were at the end of the list");
            }
        }
    }

    public static void printSongList(){
        System.out.println("Songs in current playlist are");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next().toString());
        }
        while (listIterator.hasPrevious()){
            listIterator.previous();
        }
    }
}
