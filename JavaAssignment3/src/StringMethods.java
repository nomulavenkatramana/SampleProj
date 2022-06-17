public class StringMethods {
    public static void main(String[] args) {
        String str="Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println("In LowerCase :"+str.toLowerCase());
        System.out.println("In Uppercase :"+str.toUpperCase());
        System.out.println("to replace character a with $ :" +str.replace("a","$"));
        System.out.println("contains collection word in string  :"+str.contains("collection"));
        System.out.println("Matching the String :"+str.matches("Java String pool refers to collection of Strings which are stored in heap memory"));
        System.out.println("Matching the String another method :"+str.equals("Java String pool refers to collection of Strings which are stored in heap memory"));
    }
}
