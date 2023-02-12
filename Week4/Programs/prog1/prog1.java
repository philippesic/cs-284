package prog1;
import java.util.Scanner; //Changed inport to import and deleted spaces

class prog1 {  //Added class declaration
public static void main (String[] args) {//Added public keyword and added [] to String and added {}
  
 // Declare and Initialize Variables   //Added /
    int height = 0;  //Removed space in height
    int feet = 0; //Added ; 
    int inches = 0;  //Changed Int to int
  
  // Prompt for height    
    System.out.println("Enter your height In inches: "); //Changed System spelling and corrected ""
    Scanner scanIn = new Scanner(System.in); 
    height = scanIn.nextInt(); //Removed int declaration and changed Line to Int for height
    scanIn.close(); //Closed scanner object
  
  // Calculate Height in feet and inches  
    feet = height / 12; //Reversed order
    inches = height % 12;  
  
  //Print out height in feet and inches //Added /
      System.out.println("You are " + feet + " feet and " + inches + " inches"); //Fixed quotes and changed , to +
      System.out.println("Philip Pesic 2/12/23"); //Added signature
}
}