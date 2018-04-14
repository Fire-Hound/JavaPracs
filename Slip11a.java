class InRange extends Exception{
    InRange()
    {
        super("In range of 1000 and 5000");
    }
}
public class Slip11a {
    int acc_no;
    double balance;
    String name;
    Slip11a(int acc_no, double balance, String name)
    {
        this.acc_no = acc_no;
        this.balance = balance;
        this.name = name;
        try{
        if(balance<5000 && balance>1000) throw new InRange();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Slip11a s = new Slip11a(1,2000,"vikram");
    }
    
}