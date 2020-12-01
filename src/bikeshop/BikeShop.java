/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop;

import Bike.Bicycle;
import Utilities.InputUtilities;

/**
 *
 * @author Roberto Duré
 */
public class BikeShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create 5 bikes and prompt user for  details
        
        Bicycle[] myBikes = new Bicycle[5];
        
        for(int i=0; i<myBikes.length; i++){
            
            //use our existing InputUtilities to do the work for us
            int bikeSize = InputUtilities.getUserInt("Please enter the size of the Bike", 16, 30);
            String bikeColour = InputUtilities.getUserText("Please enter the colour of the bike (tesxt only!)");
            //valid data has been  entered
            
            Bicycle newBicycle = new Bicycle(bikeSize, bikeColour);    //this actually creates a bicycle
            
            myBikes[i] = newBicycle; // add it to the array
        }
        
        // All bikes now exist
        
        //*** TEST - Not required for HW *******//
        
        for(Bicycle b: myBikes){
            //process every bike in the array myBikes
            
            System.out.println(b.cycleBike()); //output the message on screen
        }
    }
    
}
