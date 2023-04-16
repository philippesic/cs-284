package Prog4;

class prog4 {

    static void polySound(animal poly) {
        poly.animalSound();
    }
    
    public static void main(String[] args) {
        animal[] animals = {new cat(), new dog(), new bird(), new elephant(), new mouse()};
        for(int i = 0; i < 5; i++) {
            polySound(animals[i]);
        }
        System.out.println("Philip Pesic 4/16/23");
    }
}
