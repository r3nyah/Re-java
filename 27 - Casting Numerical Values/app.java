public class app {
   public static void main(String[] args) {
       byte byteValue = 20;
       short shortValue = 55;
       int intValue = 888;
       long longValue = 23355;

       float floatValue = 8834.8f;
       float floatValue2 = (float)99.3;
       double doubleValue = 32.4;

       System.out.println(Byte.MAX_VALUE);

       intValue = (int)longValue;
       System.out.println(intValue);

       doubleValue = intValue;
       System.out.println(doubleValue);
       
       intValue = (int)floatValue;
       System.out.println(intValue);

       // the following wont work as we expect it to 128 is to big for a byte
       byteValue = (byte)128;
       System.out.println(byteValue);
   } 
}
