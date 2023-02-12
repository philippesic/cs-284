package prog3;

class prog3 {
    public static void main(String[] args) {
        double a = 18, b = 6, c = 3;
        double sum1, sum2, sum3;
        
        sum1 = a + b / c; //Computes b/c then adds a
        sum2 = ( a + b ) / c; // divides sum of a + b by c
        sum3 = a + ( b / c ); //Same as sum1

        System.out.println("a + b / c = " + sum1);
        System.out.println("( a + b ) / c = " + sum2);
        System.out.println("a + ( b / c ) = " + sum3);

        System.out.println("Philip Pesic 2/12/23");

    }
}
