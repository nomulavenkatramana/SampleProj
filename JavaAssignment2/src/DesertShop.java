import java.sql.SQLOutput;
import java.util.Scanner;

abstract class DessertItem{
    String name;
    public DessertItem(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract double  getCost();
}
class Candy extends DessertItem{
    double candyweight;
    double candyprice;

    public Candy(String name) {

        super(name);
        System.out.println("candy added");
    }

    public Candy(String name, double candyweight, double candyprice) {
        super(name);
        this.candyweight = candyweight;
        this.candyprice = candyprice;
    }
    public String getName() {
        return name;
    }
    @Override
    public double getCost() {
        double cost=Math.round(candyprice*candyweight);
        double totalcost=cost+cost*0.03;
        return totalcost*60;
    }


}
class Cookie extends DessertItem{
    public Cookie(String name, double cookiePrice, int cookieCount) {
        super(name);
        this.cookiePrice = cookiePrice;
        this.cookieCount = cookieCount;
    }

    public Cookie(String name) {
        super(name);
        System.out.println("cookies added");
    }

    private double cookiePrice;
    private int cookieCount;


    @Override
    public double getCost() {
        double cost=Math.round(cookieCount/12 *cookiePrice);
        double totalcost=cost+cost*0.03;
        return totalcost*70;
    }
}
class IceCream extends DessertItem{
    public IceCream(String name) {
        super(name);
        System.out.println("icecream added");
    }

    public IceCream(String name, double iceCreamCost) {
        super(name);
        this.iceCreamCost = iceCreamCost;
    }

   private double iceCreamCost;

    @Override
    public double getCost() {
        double cost=Math.round(iceCreamCost);
        double totalcost=cost+cost*0.03;
        return totalcost;
    }
}
public class DesertShop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("give 1 for owner and give 2 for customer");
        int n= scan.nextByte();

        if(n==1){
            DessertItem si=new Candy("Gummybear");
            DessertItem dc=new Cookie("cookies");
            DessertItem di=new IceCream("icecream");

        }
        if(n==2){
            Candy candy =new Candy("gummybear",2,5);
            System.out.println("Total order cost for candy :"+candy.getCost());
            Cookie cookie=new Cookie("cookies",5,24);
            System.out.println("Total order cost for cookies :"+cookie.getCost());
            IceCream icecream=new IceCream("vennila",50);
            System.out.println("Total order cost for iceCream :"+icecream.getCost());
        }
    }
}


