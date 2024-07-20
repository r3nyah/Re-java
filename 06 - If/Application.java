public class Application {
    public static void main(String[] args) {
        // Some useful condition
        System.out.println(10 == 10);
        System.out.println(10 != 20);
        System.out.println(10 < 20);
        System.out.println(20 > 10);

        // Using loop with "break"
        int loop = 0;

        while(true){
            System.out.println("Looping: " + loop);
            if(loop == 3){
                break;
            }
            loop++;
            System.out.println("Running");
        }
    }
}
