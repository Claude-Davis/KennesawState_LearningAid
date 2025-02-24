package IndependentProgram_MusicSystem;

class Song{
    //attributes
    private int id;
    private static int nextId = 0;   //NOTE: include **static**  for updating variables!
    private String title;
    private String artist;

    public Song(String title, String artist){
        this.id = nextId;
        this.nextId++;
        this.title = title;
        this.artist = artist;
    }

    //getter (title)
    public String getTitle()  {return title;}

    //getter (artist)
    public String getArtist()  {return artist;}

    //getter (id)
    public int getId()  {return id;}

    public String toString()  {return "Song #" + id + ": '" + title + "' by " + artist;}
}