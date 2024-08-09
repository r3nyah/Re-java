public class Person implements Information{
    private String name;
    public Person(String name){
        this.name = name;
    }
    public void greet(){
        System.out.println("Hello there.");
    }
    
    @Override
    public void showInfo(){
        System.out.println("Person name is: " +  name);
    }
}
