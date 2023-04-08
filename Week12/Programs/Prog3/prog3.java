package Prog3;
import java.util.Scanner;

class prog3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[6];

        for(int i = 0; i < 6; i++) {
            names[i] = input.nextLine();
        }

        for(int i = 0; i < 6; i++) {
            System.out.println(names[i]);
        }
        input.close();
        System.out.println("Philip Pesic 4/9/23");
    }
}
