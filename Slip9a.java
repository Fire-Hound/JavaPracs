import java.util.Scanner;
class Slip9a
{
    enum CCType {VISA, XYZ, ABC}
    static int calcDiscount(double amt, String card)
    {
        CCType ctype = CCType.valueOf(card);
        switch(ctype)
        {
            case VISA: 
                if(amt<5000) return 10;
                else return 20;
            
            case XYZ:
                if(amt<10000) return 15;
                else return 25;
            case ABC:
                if(amt<8000) return 12;
                else return 15;
        }
        return 0;
    }
    static double calcNet(double amt, int discount){return amt-(amt * discount/100);}
    public static void main(String[] args) {
        System.out.print("Enter Card type: ");
        Scanner s = new Scanner(System.in);
        String card = s.next();
        System.out.print("Enter amount: ");
        double amt = s.nextDouble();
        int discount = calcDiscount(amt, card);
        System.out.println("Net price = " + calcNet(amt,discount));
    }
}