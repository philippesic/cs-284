package Prog4;

public class Digits {
    private int count, num;

    public Digits(int num) {
        this.num = num;
        count = 0;
    }

    public void getDigits() {
        
        while(num != 0) {
            num /= 10;
            ++count;
        } 

        System.out.println("Number of digits: " + count);
    }
}
