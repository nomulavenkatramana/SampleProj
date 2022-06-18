class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String msg){
        super(msg);
    }

}
class IllegalBankTransactionException extends Exception{
    public IllegalBankTransactionException(String msg){
        super(msg);
    }

}
public class Banking {
    private long id;
    private double balance;
    private double withdraw;
    private double deposit;

    public Banking(long id, double balance) {
        this.id = id;
        this.balance = balance;

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void Transaction(double withdraw){
        try{
            if(withdraw>=0 && withdraw<=getBalance()){
                setBalance(getBalance()-withdraw);
                System.out.println("transaction is successful");
                System.out.println("Remaining balance :"+getBalance());
            }
            else if(withdraw<=0){
                throw new IllegalBankTransactionException("Negative Amount is not accepted");
            }
            else{
                throw  new InsufficientBalanceException("Insufficient Account Balance");
            }
        }
        catch (IllegalBankTransactionException e1) {
            System.out.println( e1.getMessage());
        } catch (InsufficientBalanceException e2) {
            System.out.println( e2.getMessage());
        }
        catch (Exception e){
            System.out.println("Invalid Transaction");
        }
    }
    public static void main(String[] args) {
        Banking b=new Banking(1,5000);
         b.Transaction(2100);
    }
}
