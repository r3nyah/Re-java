import worlds.plant;
 
 
public class grass extends plant {
    public grass() {
         
        // Won't work --- Grass not in same package as plant, even though it's a subclass
        // System.out.println(this.height);
    }
}