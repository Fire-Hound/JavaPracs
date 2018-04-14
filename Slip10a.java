import java.util.Scanner;
public class Slip10a {
    public static void main(String[] args) {

        System.out.println("Enter num1: ");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        System.out.println("Enter num2: ");
        int num2 = s.nextInt();
        
        int count = 0;
        for(int i = num1+1; i<num2; i++)
        {
            boolean prime = true;
            for(int j = 2; j<i; j++)
            {
                if(i%j==0) prime = false;
            }
            if(prime) {
                count++;
            }
        }

        System.out.println("Count of prime numbers between " + num1 + 
        " and " + num2 + ": " + count);
    }
    
}