package IndependentProgram_MusicSystem;

import java.util.ArrayList;

class Playlist{
    // attributes
    private String name;
    private ArrayList<String> playlist;
    private ArrayList<String> allPlaylists;

    public Playlist(String name, ArrayList<String> playlist){
        this.name = name;
        this.playlist = playlist;
        allPlaylists.add(playlist);
    }

    //method to reward user for certain actions
    public void awards(int song){
        //reward for saving 10 songs
        if (playlist.size() == 10){
            System.out.println("- - Digital DJ - -");
            System.out.println("You've downloaded 10 songs!");
        }
        if (allPlaylists.size() == 10){
            System.out.println("- - Mixtape Maestro - - ");
            System.out.println("You've made 10 playlists!");
        }
    }

    //getter (playlist)
    public String getPlaylist()  {return playlist;}

    //getter (name)
    public String getPlaylistName() {return name;}

    //toString() method
}