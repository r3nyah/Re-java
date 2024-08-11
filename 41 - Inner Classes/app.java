public class app {
    public static void main(String[] args) {
        robot robo = new robot(7);
        robo.start();
                 
        // The syntax below will only work if Brain is
        // declared public. It is quite unusual to do this.
        // Robot.Brain brain = robot.new Brain();
        // brain.think();
         
        // This is very typical Java syntax, using
        // a static inner class.
        robo.Battery battery = new robo.Battery();
        battery.charge();
    }
}
