public class Application{
    public static void main(String[] args) {
        // inefficient
        String info = "";

        info += "My name is Renyah";
        info += " ";
        info += "I am a programmer";

        System.out.println(info);
        
        // more efficient
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Renyah");
        sb.append(" ");
        sb.append("I am a programmer");

        System.out.println(sb.toString());

        // The same as above but nicer
        StringBuilder s = new StringBuilder("");
        s.append("My name is Renyah").append(" ").append("I am a programmer");

        // Formating

        // Outputing new lines and tab

        System.out.println("Here is some text.\tThas was a tab.\tThat was a new line.");
        System.out.println(" more text");

        /*
         * Formating integers
         * %-10d means: output an integer in a space ten characters wide
         * padding with space and left aligning(10%d would right align)
         */
        System.out.printf("Total cost %-10d; Quantity is %d\n", 5 ,120);

        // Demoing integer and string  formatting control sequences
        for(int i = 0; i < 20; i++){
            System.out.printf("%-2d: %s\n", i, "here is some text");
        }

        // Formating point value

        // Two decimal place:
        System.out.printf("Total value %.2f\n", 10.2005);

        // One decimal place: left-aligned in 6 charfield
        System.out.printf("Total value %-6.1f\n",102.02005);

        // you can also use the string format method if you want to retrieve a formatted string
        String formatted = String.format("This is a floating-point value: %.3f", 1.020005);
        System.out.println(formatted);

        // use double %% for outputting a % sign
        System.out.printf("Giving it %d%% is physicaly impossible", 100);
    }
}