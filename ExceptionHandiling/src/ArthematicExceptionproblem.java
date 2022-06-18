import java.util.Scanner;

public class ArthematicExceptionproblem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Byte x= scan.nextByte();
        Byte y= scan.nextByte();
        try{
         int n=x/y;
            System.out.println(n);
        }
        catch (ArithmeticException ae){
            System.out.println("this number can't be divisible by zero");
        }
    }
}
