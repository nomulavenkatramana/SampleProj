import java.util.Scanner;
public class ArmstrongNumbersFrom100_999 {
    public static void isArmstrong(int n){
        int sum=0;
        int temp=n;
        while(n>0){
            int last_digit=n%10;
            sum+=last_digit*last_digit*last_digit;
            n=n/10;
        }
        if(sum==temp){
            System.out.println(sum);
        }

    }
    public static void main(String[] args){
        for(int i=100;i<999;i++){
            isArmstrong(i);
        }
    }

}
