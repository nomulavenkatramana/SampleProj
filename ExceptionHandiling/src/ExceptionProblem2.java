import java.util.Scanner;

public class ExceptionProblem2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Byte x= scan.nextByte();
        Byte y= scan.nextByte();
        try{
            int n=x/y;
            System.out.println(n);
        }
        catch (Exception ae){
            System.out.println("UnsupportedOperationException");
        }
    }
}
