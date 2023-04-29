package Prog;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

class prog {

    public static void shuffleArrayInPlace(String arr[], int size) {
        Random rand = new Random();

        for (int i = 0; i < size; i++) {

            int lastIndex = size - i - 1;

            int randomIndex = rand.nextInt(lastIndex + 1);
            String tempSwapper = arr[lastIndex];
            arr[lastIndex] = arr[randomIndex];
            arr[randomIndex] = tempSwapper;
        }
    }

    public static void main(String[] args) {
        String cars[] = new String[50];
        int i = 0;
        try {
            File car = new File("Prog/Cars.txt");
            Scanner in = new Scanner(car);
            while (in.hasNextLine()) {
                cars[i] = in.nextLine();
                i++;
                if (i >= 50) {
                    break;
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        shuffleArrayInPlace(cars, 50);
        for (int x = 0; x < 50; x++) {
            System.out.print(cars[x] + " ");
        }
        System.out.println("\nPhilip Pesic 4/30/23");
    }
}