public class Car extends Machine {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    public void wipeWindshield(){
        System.out.println("Wiping Windshield");
    }

    public void showInfo(){
        System.out.println("Car Name: " + name);
    }
}
