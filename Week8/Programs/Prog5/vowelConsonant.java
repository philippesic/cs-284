package Prog5;
public class vowelConsonant {
    private char ch; 

    public vowelConsonant() {
        ch = 'j';
    }

    public void convert() {
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
        System.out.println(ch + " is a vowel"); 
    }

    else {
        System.out.println(ch + " is a consonant"); 
    }
}
}
