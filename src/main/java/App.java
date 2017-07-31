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
            System.out.println("Welcome to Tower Records! What would you like to do? Add an album or Exit?");

            try {

                String navigationChoice = bufferedReader.readLine();

                if (navigationChoice.equals("Add an album")) {
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
                    for (CD individualAlbum : allAlbums) {
                        System.out.println("----------------------");
                        System.out.println(individualAlbum.artistName);
                        System.out.println(individualAlbum.albumName);
                        System.out.println(individualAlbum.releaseYr);
                        System.out.println(individualAlbum.price);
                    }
                } else if (navigationChoice.equals("Exit")) {
                    System.out.println("Goodbye!");
                    programRunning = false;
                } else {
                    System.out.println("Error!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
