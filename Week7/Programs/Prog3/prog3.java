package Prog3;

class prog3 {
    public static void main(String[] args) {
        char codedLetter; 
        char decodedLetter;  
        char letter = '*';

        System.out.println( "Letter = " + letter);   
        codedLetter =  CodeLetter(letter);   
        System.out.println( "Coded Letter = " + codedLetter );  
        decodedLetter = DecodeLetter(codedLetter);   
        System.out.println( "Decoded Letter = " + decodedLetter );  
        char x = '@';    
        System.out.println(x); 
        x++;  
        System.out.println(x);
        System.out.println("Philip Pesic 3/5/23");

  }  
     public static char CodeLetter(char c) {
        return (++c);
    }
    public static char DecodeLetter(char c) {
        return --c;
    }
}

// This code runs because characters are stores are binary values. By editing the binary value, then decoding the new value, we get a different character.
