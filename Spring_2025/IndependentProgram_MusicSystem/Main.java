package  IndependentProgram_MusicSystem;

import java.util.ArrayList;
import  java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Song> songs = new ArrayList<>();

        //title
        System.out.println("{Music System}");
        System.out.println(" ");

        //initialize "option"
        int option = 0;

        while (option != 7){
            //menu
            System.out.println("1. Download a song");
            System.out.println("2. Make a playlist");
            System.out.println("3. Add a song to a playlist");
            System.out.println("4. List all songs");
            System.out.println("5. List all playlists");
            System.out.println("6. Search songs");
            System.out.println("7. Exit program");
            System.out.println("Enter option: ");
            option = sc.nextInt();


            switch(option){
                default:
                    System.out.println(" ");

                    if (option != 7)  {System.out.println("Invalid Entry");}

                    System.out.println(" ");
                    break;
                case 1:  //download a song
                System.out.println(" ");
                //prompt for information
                    System.out.println("Enter the  Song's Title: ");
                    sc.nextLine();
                    String title = sc.nextLine();
                    System.out.println("Enter the Artist's Name: ");
                    String artist = sc.nextLine();
                    
                //create song object
                    Song newSong = new Song(title, artist);

                //save song to "songs" list
                    songs.add(newSong);

                //statement
                    System.out.println("New song downloaded!");

                System.out.println(" ");
                break;

                case 4: //list all songs
                    System.out.println(" ");

                    //loop to print the toString() method for each song
                    for (int s=0; s<=songs.size(); s++){
                        while (s<songs.size()){
                            System.out.println(songs.get(s).toString());
                            s++;
                        }
                    }

                    System.out.println(" ");
                    break;

                case 6:  //search all songs
                System.out.println(" ");

                //initialize "option2"
                    int option2 = 0;
            
                    //menu 2
                    System.out.println("1. Search by title");
                    System.out.println("2. Search by artist");
                    System.out.print("Choice #");
                    option2 = sc.nextInt();
            
                    switch(option2){
                        case 1:
                            System.out.println(" ");

                            //prompt for song title
                            System.out.println("Enter song title: ");
                            String songTitle = sc.nextLine();

                            //search "songs" list for matching "title"
                            for (int t=0; t<=songs.size(); t++){
                                while (t<songs.size()){
                                    if (songs.get(t).getTitle().equals(songTitle)){
                                        System.out.println(songs.get(t).toString());
                                    } else {System.out.println("There are no songs with this title.");}
                                    t++;
                                }
                            }

                            System.out.println(" ");
                            break;
                        case 2:
                            System.out.println(" ");

                            //prompt for artist name to search for
                            System.out.println("Enter artist name: ");
                            String artistName = sc.nextLine();

                            //search "songs" list for matching "artist"
                            for (int a=0; a<=songs.size(); a++){
                                while (a<songs.size()){
                                    if (songs.get(a).getArtist().equals(artistName)){
                                        System.out.println(songs.get(a).toString());
                                    } else {System.out.println("No songs match this artist.");}
                                    a++;
                                }
                            }

                            System.out.println(" ");
                            break;
                    }

                    System.out.println(" ");
                    break;
            }
        }
        System.out.println(" ");
        System.out.println("Goodbye!");
    }
}