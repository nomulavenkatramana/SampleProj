public class AssignmentOnStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("StringBuffer ");
        sb.append("is a peer class of String ");
        sb.append("that provides much of ");
        sb.append("the functionality of strings.");
        System.out.println(sb);
        StringBuffer sb1=new StringBuffer("It is Used to _ at the specified index position");
        sb1.insert(14,"Insert text");
        System.out.println(sb1);
        StringBuffer sb2=new StringBuffer();
        sb2.append("This method returns the reversed object on which it was called");
        sb2.reverse();
        System.out.println(sb2);
    }
}
