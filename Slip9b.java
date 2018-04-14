
public class Slip9b {
    public static void main(String[] args) {
        int decimal = 17;
        String binary = "";
        while(decimal!=0)
        {
            binary = (decimal % 2) + binary;
            decimal/=2;
        }
        System.out.println(binary);
    }
    
}