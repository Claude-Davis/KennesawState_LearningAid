package IndependentProgram_MusicSystem;

import java.util.ArrayList;

class Playlist{
    // attributes
    private int id;
    private static int nextId = 1;
    private String name;
    private String description;
    private static ArrayList<Song> playlist;
    private static int playlistsCounter = 1;

    public Playlist(String name, String description, ArrayList<Song> playlist){
        this.name = name;
        this.description = description;
        this.playlist = playlist;
        this.playlistsCounter++;
        this.id = nextId;
        this.nextId++;
    }

    //method to add songs to "playlist"
    public ArrayList<Song> addSong(String title, String artist) {
        //create object of Song
        Song song = new Song(title, artist);

        //add Song object to playlist
        playlist.add(song);

        return playlist;
    }

    //method to print songs in a playlist
    public String listSongs(){
        String
        for (int s=0; s<=playlist.size(); s++){
            while (s<playlist.size()){
                String songP = playlist.get(s);
                s++;
            }
        }
        return playlist.get(s);
    }

    //method to reward user for certain actions
            //pending implementation....
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