package worlds;

class Something{

}

public class plant {
    // Bad practice
    public String name;

    // Acceptable practice
    public final static int ID = 8;

    private String type;

    protected String size;

    int height;

    public plant(){
        this.name = "r3nyah";
        this.type = "plant";
        this.size = "medium";
        this.height = 10;
    }
}
