import models.CD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * Created by Guest on 7/31/17.
 */

public class App {
    public static void main(String[] args) {

        ArrayList<CD> allAlbums = new ArrayList<CD>();

        boolean programRunning = true;

        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to Tower Records! What would you like to do? Add an Album, See Inventory, Search by Year, Search by Artist, or Exit?");

            try {

                String navigationChoice = bufferedReader.readLine();

                if (navigationChoice.equals("Add an Album")) {
                    System.out.println("Artist name: ");
                    String userArtistName = bufferedReader.readLine();
                    System.out.println("Album name: ");
                    String userAlbumName = bufferedReader.readLine();
                    System.out.println("Release year: ");
                    int userReleaseYr = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Price: ");
                    float userPrice = Float.parseFloat(bufferedReader.readLine());
                    CD newCD = new CD(userArtistName, userAlbumName, userReleaseYr, userPrice);
                    allAlbums.add(newCD);
                } else if (navigationChoice.equals("See Inventory")) {
                    for (CD anAlbum : allAlbums) {
                        System.out.println("----------------------");
                        System.out.println(anAlbum.artistName);
                        System.out.println(anAlbum.albumName);
                        System.out.println(anAlbum.releaseYr);
                        System.out.println(anAlbum.price);
                    }
                } else if (navigationChoice.equals("Exit")) {
                    System.out.println("Goodbye!");
                    programRunning = false;
                } else if (navigationChoice.equals("Search by Year")) {
                    System.out.println("What year would you like to search?");
                    String stringUserYear = bufferedReader.readLine();
                    int userYear = Integer.parseInt(stringUserYear);
                    for (CD anAlbum : allAlbums) {
                        if (anAlbum.rightYear(userYear)) {
                            System.out.println("----------------------");
                            System.out.println(anAlbum.artistName);
                            System.out.println(anAlbum.albumName);
                            System.out.println(anAlbum.releaseYr);
                            System.out.println(anAlbum.price);
                        }
                    }
                } else if (navigationChoice.equals("Search by Artist")) {
                    System.out.println("Which artist would you like to search?");
                    String userArtist = bufferedReader.readLine();
                    for (CD anAlbum : allAlbums) {
                        if (anAlbum.rightArtist(userArtist)) {
                            System.out.println("----------------------");
                            System.out.println(anAlbum.artistName);
                            System.out.println(anAlbum.albumName);
                            System.out.println(anAlbum.releaseYr);
                            System.out.println(anAlbum.price);
                        }
                    }
                } else {
                    System.out.println("Error!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
