package worlds;
 
public class oak extends plant {
     
    public oak() {
         
        // Won't work -- type is private
        // type = "tree";
         
        // This works --- size is protected, Oak is a subclass of plant.
        this.size = "large";
         
        // No access specifier; works because Oak and Plant in same package
        this.height = 10;
    }
 
}