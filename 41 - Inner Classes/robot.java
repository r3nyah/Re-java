public class robot {
    private int id;
    
    /*
     * Non static nested classes have acces to the enclosing classes instance data. implement iterable
     *http://www.caveofprogramming.com/java/using-iterable-java-collections-framework-video-tutorial-part-11/ Use them to group functionality.
     */
    private class Brain{
        public void think(){
            System.out.println("Robot "+id+" is thingking.");
        }
    }

    /*
     * static inner classes do not have access to instance data.They are really just like a normal classes,except that they are
     * grouped within an outer class. use them for grouping classes together.
     */
    public static  class  Battery{
        public void charge(){
            System.out.println("Battery is charging");
        }
    }

    public robot(int id){
        this.id = id;
    }

    public void start(){
        System.out.println("Starting robot "+id);
        /*
         * use brain. we dont have an instance of brain
         * until we create one
         * instance of braine are always associated with instance of robot(the enclossing class)
         */
        Brain brain = new Brain();
        brain.think();

        final String name = "Robert";

        // sometimes it is useful to create local classes
        // within method. you can use them only within method

        class  temp {
            public void doSomething(){
                System.out.println("id: "+ id);
                System.out.println("My name is: "+name);
            }
            
        }
        temp temp1 = new temp();
        temp1.doSomething();
    }
}
