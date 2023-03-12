package Prog4;

public class ascii {

    private char ch; 
    private int ascii; 
    private int castAscii; 

    public ascii() {
        ch = '!';
        ascii = ch;
        castAscii = (int) ch;
    }

    public void asciiOut() {
        System.out.println("The ASCII value of " + ch + " is: " + ascii); 
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}
