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
            System.out.println("7. Delete a song");
            System.out.println("8. Delete a playlist");
            System.out.println("9. Exit program");
            System.out.println("Enter option: ");
            option = sc.nextInt();


            switch(option){
                default:
                    System.out.println(" ");

                    if (option != 9)  {System.out.println("Invalid Entry");}
                    break;
                case 1:                                                                             // 1. download a song
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

                case 4:                                                                             // 4. list all songs
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

                case 6:                                                                             // 6. search all songs
                System.out.println(" ");
            
                    //menu 2
                    System.out.println("1. Search by title");
                    System.out.println("2. Search by artist");
                    System.out.println("3. Return to main menu");
                    System.out.print("Choice #");
                    int option2 = sc.nextInt();
            
                    switch(option2){
                        default:                                                         //default case
                            System.out.println(" ");
                            System.out.println("Invalid Entry");
                            break;
                        case 1:                                                                 //search by title
                            System.out.println(" ");

                            //prompt for song title
                            System.out.println("Enter song title: ");
                            sc.nextLine();
                            String songTitle = sc.nextLine();

                            //search "songs" list for matching "title"
                            for (int t=0; t<=songs.size(); t++){
                                while (t<songs.size()){
                                    if ((songs.get(t).getTitle().toLowerCase()).contains(songTitle.toLowerCase())){
                                        System.out.println(songs.get(t).toString());
                                    } else if (false)  {System.out.println("There are no songs with this title.");}
                                    t++;
                                }
                            }

                        System.out.println(" ");
                        break;
                        case 2:                                                                //search by artist
                            System.out.println(" ");

                            //prompt for artist name to search for
                            System.out.println("Enter artist name: ");
                            sc.nextLine();
                            String artistName = sc.nextLine();

                            //search "songs" list for matching "artist"
                            for (int a=0; a<=songs.size(); a++){
                                while (a<songs.size()){
                                    if ((songs.get(a).getArtist().toLowerCase()).contains(artistName.toLowerCase())){
                                        System.out.println(songs.get(a).toString());
                                    } else if (false)   {System.out.println("No songs match this artist.");}
                                    a++;
                                }
                            }

                        System.out.println(" ");
                        break;
                        case 3:  //return to main menu 
                            System.out.println(" ");
                            break;
                    }

                System.out.println(" ");
                break;

                case 7:                                                              // 7. delete songs
                System.out.println(" ");

                // menu 3
                    System.out.println("1. Delete a downloaded song");
                    System.out.println("2. Delete from a playlist");
                    System.out.print("Choice #");
                    int option3 = sc.nextInt();

                    switch(option3){
                        default:                                                       // default case
                            System.out.println(" ");
                            System.out.println("Invalid Entry");
                            break;
                        case 1:
                            System.out.println(" ");

                            System.out.print("Enter song title: ");
                            sc.nextLine();
                            String deleteSong = sc.nextLine();

                            //delete song from "songs" list
                            for (int d=0; d<=songs.size(); d++){
                                while (d<songs.size()){
                                    if ((songs.get(d).getTitle().toLowerCase()).contains(deleteSong.toLowerCase())) {                   //find song(s) by title
                                        System.out.println(songs.get(d).toString());
                                    } else if (false) {
                                        System.out.println("There are no songs with that title.");
                                    }
                                    d++;
                                }
                            }

                            for (int d=0; d<=songs.size(); d++){
                            System.out.println("Enter id # to delete: ");
                            int deleteId = sc.nextInt();
                                if (songs.get(d).getId() == deleteId) {                                                                                 //specify song by id #
                                    songs.remove(d);
                                    break;
                                }
                            }

                            //statement
                                System.out.println("Song deleted.");
                                for (int s=0; s<=songs.size(); s++){
                                    while (s<songs.size()){
                                        System.out.println(songs.get(s).toString());
                                    }
                                }

                            System.out.println(" ");
                            break;
                        case 2:
                            System.out.println(" ");

                            //

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