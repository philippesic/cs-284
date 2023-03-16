package Prog0;

public class Computer {
    private OperatingSystem os = new OperatingSystem();
    private PowerSupply ps = new PowerSupply();

    Computer() {
        ps.turnOn();    
    }

    void allDone() {
        os.shutDown();
        ps.turnOff();
    }
}
