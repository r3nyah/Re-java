public class Application {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("r3nyah");
        person1.greet();

        Information info1 = new Machine();
        info1.showInfo();

        Information info2 = new Machine();
        info2.showInfo();

        System.out.println("");

        outputInfo(mach1);
        outputInfo(person1);
    }

    private static void outputInfo(Information info){
        info.showInfo();
    }
}
