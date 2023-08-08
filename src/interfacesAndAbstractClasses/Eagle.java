package interfacesAndAbstractClasses;

public class Eagle extends Animal implements FlightCapable{

    public void makeNoise() {
        System.out.println("Screech (in freedom)");
    }

    public void takeOff() {
        System.out.println("Flap wings");
    }
}
