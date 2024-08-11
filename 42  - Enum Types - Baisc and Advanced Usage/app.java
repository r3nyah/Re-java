public class app {
    public static void main(String[] args) {
        animal animal1 = animal.DOG;

        switch(animal1) {
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                break;
            default:
                break;
     
            }
             
            System.out.println(animal.DOG);
            System.out.println("Enum name as a string: " + animal.DOG.name());
             
            System.out.println(animal.DOG.getClass());
             
            System.out.println(animal.DOG instanceof Enum);
             
            System.out.println(animal.MOUSE.getName());
             
            animal animal2 = animal.valueOf("CAT");
             
            System.out.println(animal2);
        }
     
    }