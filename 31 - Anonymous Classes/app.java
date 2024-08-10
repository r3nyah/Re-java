class Machine{
    public void start(){
        System.out.println("Starting machine...");
    }
}

interface Plant{
    public void grow();
}

public class app {
    public static void main(String[] args) {
        // this is equivalent to creating a class that extends
        // machine and overrides the start method
        Machine machine1 = new Machine(){
            @Override public void start(){
                System.out.println("Camera snapping...");
            }
        };
        machine1.start();

        //this is equivalent to creating a that implements
        //the plant interface
        Plant plant1 = new Plant(){
            @Override public void grow(){
                System.out.println("Plant growing");
            }
        };
        plant1.grow();
    }
}
