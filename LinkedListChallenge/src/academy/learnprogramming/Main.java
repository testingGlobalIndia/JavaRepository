package academy.learnprogramming;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Album album = new Album();
    private static LinkedList<Song> playlist1 = new LinkedList<>();
    private static int i=0,j=0;
    private static boolean isForward=false;
    private  static ListIterator<Song> listIterator;

    public static void main(String[] args) {

        Song song = new Song("Hey Ram",10.23);
        Song song2 = new Song("Mera Bhola hei Bandari",10.23);
        Song song3 = new Song("Subh Subh le",10.23);
        album.addSongToAlbum(song);
        album.addSongToAlbum(song2);
        album.addSongToAlbum(song3);
        album.addSongToPlayList(playlist1,song);
        album.addSongToPlayList(playlist1,song2);
        album.addSongToPlayList(playlist1,song3);
        album.printSongsInPlaylist(playlist1);
        album.forwardToNextSong();
        listIterator = playlist1.listIterator();
        int choice =0;
        boolean quit = false;
        printMenu();
        while (!quit){
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    quit = true;
                    break;
                case 2:
                    forwardToNextSong();
                    break;
                case 3:
                    backwardToPreviousSong();
                    break;
                case 4:
                    replaySong();
                    break;
                case 5:
                    printPlayList();
                    break;
                case 6:
                    printMenu();
                    break;
                default:
                    System.out.println("You have pressed wrong key");
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("Given choices are " +
                "\n\t 1 - Quit application" +
                "\n\t 2 - Forward to next song" +
                "\n\t 3 - Backward to previous song" +
                "\n\t 4 - Replay song" +
                "\n\t 5 - Print song list in playlist" +
                "\n\t 6 - Print menu option");
    }

    public static void forwardToNextSong(){
        if(i>0){
            listIterator = album.forwardToNextSong();
            listIterator.next();
            i=0;
        }
        if(i==0) {
            listIterator = album.forwardToNextSong();
            isForward =true;
            if(listIterator == null) {
                System.out.println("You are at the end of the song list");
            }else {
                System.out.println("Now playing " + listIterator.next().toString());
                j++;
            }
        }
       }

    public static void backwardToPreviousSong(){
        if(j>0){
            listIterator = album.backwardToPreviousSong();
            listIterator.previous();
            j=0;
        }
        if(j==0) {
            isForward =false;
            listIterator = album.backwardToPreviousSong();
            if(listIterator == null) {
                System.out.println("You are at the starting of the song list");
            }else{
            System.out.println("Now playing "+listIterator.previous().toString());
            i++;

        }
        }
    }

    public static void replaySong() {
        if(isForward == true){
            if(listIterator.hasPrevious()){
                System.out.println("Replaying song "+listIterator.previous().toString());
                listIterator.next();
            }else{
                System.out.println("were at the start of the list");
            }
        } else {
            if(listIterator.hasNext()){
                System.out.println("Replaying song "+listIterator.next().toString());
                listIterator.previous();
            }else{
                System.out.println("were at the end of the list");
            }
        }
        }

    public static void printPlayList(){
        while (listIterator.hasNext()){
            System.out.println(listIterator.next().toString());
        }
    }

}
