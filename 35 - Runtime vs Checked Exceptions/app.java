public class app {
    public static void main(String[] args){
        //Null pointer exception
        String text = null;
        System.out.println(text.length());

        // Arithmetic exception(divide by zero)
        int value = 7/0;

        /*
         * You can actually handle runtime exception if you want to
         * for example here we handle an array index out of bounds exeption
         */
        String[] texts = {
            "one",
            "two",
            "three",
        };
        try {
            System.out.println(texts[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }   
    }
}
