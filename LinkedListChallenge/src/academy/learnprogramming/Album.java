package academy.learnprogramming;

import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Album {

    private static ArrayList<Song> songs;
    private LinkedList<Song> playlist = new LinkedList<>();
    private ListIterator<Song> listIterator;

    public Album() {
        songs = new ArrayList<>();
    }

    public void addSongToAlbum(Song song) {
        songs.add(song);
    }

    public void printSongsInPlaylist(List<Song> playList) {
        System.out.println("You have " + playlist.size() + " playlist");
        ListIterator<Song> songListIterator = playList.listIterator();
        while (songListIterator.hasNext()) {
            System.out.println(songListIterator.next().getTitle());
        }
    }

    public void addSongToPlayList(LinkedList<Song> playlist, Song song) {
          boolean isSongExists = findSong(song);
          this.playlist = playlist;
          if(isSongExists) {
              this.playlist.add(song);
          }
        listIterator = this.playlist.listIterator();
    }

    private static boolean findSong(Song song){
        int position = songs.indexOf(song);
        if(position >=0){
            return true;
        }else{
            return false;
        }
    }

    public ListIterator<Song> forwardToNextSong() {
        if (listIterator.hasNext()) {
            return listIterator;
        }
        return null;
    }

    public ListIterator<Song> backwardToPreviousSong() {
        if (listIterator.hasPrevious()) {
            return listIterator;
        }
        return null;
    }


}
