class Person {
    // Instance variabes (data or "state")
    String name;
    int age;

    // CLasses contain :
    // 1. Data
    // 2. Subroutines as method

    void speak(){
        for(int i = 0; i < 3;i++){
            System.out.println("My name is: " + name + " and I am "+ age + " years old");
        }
    }

    void sayHello(){
        System.out.println("Hello there!");
    }
}

public class Application{
    public static void main(String[] args) {
        // Create a Person object using the person class
        Person person1 = new Person();
        person1.name = "r3nyah";
        person1.age = 17;

        // Create a second Person object
        Person person2 = new Person();
        person2.name = "r3nyah2nd";
        person2.age = 17;
        person2.speak();
        person2.sayHello();

        System.out.println(person1.name);
    }
}