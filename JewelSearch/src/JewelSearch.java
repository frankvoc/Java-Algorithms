import java.util.Random;
public class JewelSearch {
    //Method to generate positions for jewels
	//For purpose of the lap, this DOES NOT check for overlaps, this is meant by design
	//using [][] as a 2D Array
	//2D Arrays are utilized in this program by storing jewelPositions, and this is good in our case because 2D Arrays can be visualized as an array where each element is another array
	//jewelPositions is a way to keep track of all coordinates where a jewel is found
	//
	//Here is where we generate jewels (allowing overlaps)
    public static void generateJewelPositions(int numberOfJewels, int[][] jewelPositions) {
        Random rand = new Random();
        //create a loop to generate random positions to place a jewel
        for (int count = 0; count < numberOfJewels; count++) {
        	//generate them row and column
            int x = rand.nextInt(9);
            int y = rand.nextInt(9);
            //give positions to the arrays
            jewelPositions[count][0] = x;
            jewelPositions[count][1] = y;
        }
    }
    //Here is where we print where the jewels are in our 2D array (Grid)
    public static void printJewelPositions(int[][] jewelPositions) {
    	//another loop through the array  
        for (int[] position : jewelPositions) {
        	//print out each row and column where the jewel is located
            System.out.println("Jewel found at: Row " + position[0] + ", Column " + position[1]);
        }
    }
    public static void main(String[] args) {
    	//place 5 random jewels
        int numberOfJewels = 5;
        //initializes jewelPositions array
        int[][] jewelPositions = new int[numberOfJewels][2];
        //generate jewel positions and store in 2D
        generateJewelPositions(numberOfJewels, jewelPositions);
        //print
        printJewelPositions(jewelPositions);
    }
}
