public class app {
 
    public static void main(String[] args) {
         
         
        plant plant1 = new plant();
         
        // Tree is a kind of Plant (it extends Plant)
        tree tree = new tree();
         
        // Polymorphism guarantees that we can use a child class
        // wherever a parent class is expected.
        plant plant2 = tree;
         
        // plant2 references a Tree, so the Tree grow() method is called.
        plant2.grow();
         
        // The type of the reference decided what methods you can actually call;
        // we need a Tree-type reference to call tree-specific methods.
        tree.shedLeaves();
         
        // ... so this won't work.
        //plant2.shedLeaves();
         
        // Another example of polymorphism.
        doGrow(tree);
    }
     
    public static void doGrow(plant plant) {
        plant.grow();
    }
 
}