import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int last_digit=n%10;
            sum+=last_digit*last_digit*last_digit;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not Armstrong");
        }
    }
}
