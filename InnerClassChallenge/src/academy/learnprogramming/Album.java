package academy.learnprogramming;

import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    ArrayList<Songs> album;
    SongList list = new SongList();

    public void addSongToAlbum(Songs song){
        list.addSongToAlbum(song);
    }

    public LinkedList<Songs>  addSongToPlaylist(LinkedList<Songs> playlist, Songs song){
       return list.addSongToPlaylist(playlist,song);
    }

    private class SongList {

        public SongList() {
            album = new ArrayList<>();
        }

        public void addSongToAlbum(Songs song) {
            album.add(song);
        }

        public LinkedList<Songs> addSongToPlaylist(LinkedList<Songs> playlist, Songs song) {
            if (findSong(song)) {
                playlist.add(song);
                return playlist;
            } else {
                System.out.println("Please add song first to album");
                return null;
            }
        }

        private boolean findSong(Songs song) {
            int isExists = album.indexOf(song);
            if (isExists >= 0) {
                return true;
            } else {
                return false;
            }

        }
    }

}
