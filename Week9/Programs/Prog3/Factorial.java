package Prog3;

public class Factorial {
    private int num;
    private long factorial;

public Factorial(int num) {
    this.num = num;
    factorial = 1;
}

public void getFactorial() {
    for(int i = 1; i <= num; ++i) {
        factorial *= i;
    }

    System.out.printf("Factorial of %d = %d", num, factorial);
    System.out.println("");
    }
}
