public class Machine implements Information{
    private int id = 7;
    public void start(){
        System.out.println("Machine Started!.");
    }
    public void showInfo(){
        System.out.println("Machine ID is: " + id);
    }
}
