package Prog2;
import java.util.Scanner; 

public class prog2 { 
    public static void main(String[] args) { 

        Scanner reader = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int inNum = reader.nextInt(); 
        reader.close();

        if(inNum % 2 == 0) {
            System.out.println(inNum + " is even"); 
        }
        else {
            System.out.println(inNum + " is odd"); 
        }
        
        System.out.println("Philip pesic 3/12/23");
    } 
} 