
package Bike;

/**
 * 
 * This class models a simple Bike
 * 
 * Only has a colour and a size
 * 
 * Note how little code is contained in this class!
 * 
 * @author Roberto Duré
 */
public class Bicycle {
    
    private int size;
    private String colour;
    
    /**
     * Constructor - creates a specific bicycle with a given size and colour
     * 
     * @param size - the size of this bicycle
     * @param colour - the colour as a String; no validation is attempted here - better implementation later in  the course!
     */
    public Bicycle(int size, String colour){
        
        this.size = size;
        this.colour =  colour;
        
    }
    
    /**
     * 
     * @return - a simple message containing the colour of this bicycle.
     * 
     * NOTE: By returning the message as a String this is now flexible. For example the message could be saved
     * to a file. 
     */
    public String cycleBike(){
        
        return "I am cycling the " + this.colour + " bicycle.";
    }
    
}
