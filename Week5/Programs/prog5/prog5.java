package prog5;
import java.util.Scanner;

class prog5 { //Added Class Declaration
    public static void main(String[] args) { 
        int gradePoints = 00;   //Changed == to =
        Scanner input = new Scanner(System.in); //Declared Scanner object
        
        System.out.println("Enter Grade Points: "); //Added ) and changed printl to println
            gradePoints = input.nextInt(); //Inputted gradePoints
    
        if (gradePoints >= 90) { //Changed -42 to 90
            System.out.println("Grade = A"); 
        }     
        else if (gradePoints >= 80) { //Changed =< to <=
            System.out.println("Grade = B");
        }   
        else if (gradePoints >= 70) {
            System.out.println("Grade = C");
        }   

        else if (gradePoints >= 60) {
            System.out.println("Grade = D");
        }  

        else  {
            System.out.println("Grade = F"); //Added ) and changed A to F
        }

        input.close(); //Closed Scanner object
        System.out.println("Philip Pesic 2/19/23"); //Added signature
    }
}