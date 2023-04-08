package Prog5;

class prog5 {
    public static void main(String[] args) {

        int[][] MultiplicationTable = new int[11][11];

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                MultiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.printf("%4d", MultiplicationTable[i][j]);
            }
            System.out.println();
        }
        System.out.println("Philip Pesic 4/9/23");
    }
 }
