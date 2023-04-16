package Prog3;

class prog3 {

    static void polySound(animal poly) {
        poly.animalSound();
    }
    
    public static void main(String[] args) {
        animal a = new animal();
        animal c = new cat();
        animal d = new dog();
        
       polySound(a);
       polySound(c);
       polySound(d);
       polySound(new bird());

        System.out.println("Philip Pesic 4/16/23");
    }
}
