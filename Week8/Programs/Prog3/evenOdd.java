package Prog3;
import java.util.Scanner; 

public class evenOdd { 
    private int inNum;
    public evenOdd() { 
        inNum = 0;
    }

    public void calc() {
        Scanner reader = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        inNum = reader.nextInt(); 
        reader.close();

        if(inNum % 2 == 0) {
            System.out.println(inNum + " is even"); 
        }
        else {
            System.out.println(inNum + " is odd"); 
        }
    } 
} 