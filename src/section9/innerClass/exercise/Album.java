package section9.innerClass.exercise;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public boolean addSong(String title, double duration) {
        if (songList.findSong(title) == null) {
            songList.addSong(new Song(title, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index > 0) && (index <= songList.getSongs().size())) {
            playList.add(songList.getSongs().get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = songList.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList {

        private ArrayList<Song> songs;

        public SongList() {
            songs = new ArrayList<>();
        }

        public ArrayList<Song> getSongs() {
            return songs;
        }

        public void addSong(Song song) {
            songs.add(song);
        }

        public Song findSong(String title) {
            for (Song checkedSong : songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }
    }
}
