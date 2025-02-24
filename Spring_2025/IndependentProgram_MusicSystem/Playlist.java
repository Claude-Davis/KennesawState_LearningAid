package IndependentProgram_MusicSystem;

import java.util.ArrayList;

class Playlist{
    // attributes
    private int id;
    private static int nextId = 0;
    private String name;
    private String description;
    private ArrayList<Song> playlist;
    private static int playlistsCounter = 1;

    public Playlist(String name, String description, ArrayList<Song> playlist){
        this.name = name;
        this.description = description;
        this.playlist = playlist;
        this.playlistsCounter++;
        this.id = nextId;
        this.nextId++;
    }

    //method to reward user for certain actions
    public void awards(int song){
        //reward for saving 10 songs
        if (playlist.size() == 10){
            System.out.println("- - Digital DJ - -");
            System.out.println("You've downloaded 10 songs!");
        }
        if (playlistsCounter == 10){
            System.out.println("- - Mixtape Maestro - - ");
            System.out.println("You've made 10 playlists!");
        }
    }

    //setter (description)
    public String setDescription(){
        if (description.equals("")){                    //if the user leaves the description empty..
            description = "None";                           //replace it with the value "None"
        }
        return description;
    }

    //getter (playlist)
    public ArrayList<Song> getPlaylist()  {return playlist;}

    //getter (name)
    public String getPlaylistName() {return name;}

    //getter (id)
    public int getId() {return id;}

    //toString() method
    public String toString()  {return "Playlist #" + id + ":  " + name + "\n   Description: " + description;}
}