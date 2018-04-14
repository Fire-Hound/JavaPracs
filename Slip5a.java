import java.util.Scanner;
class Slip5a
{
    public static void main(String[] args) {
        System.out.print("Enter inches: ");
        Scanner s = new Scanner(System.in);
        int inches = Integer.parseInt(s.next());

        int feet = inches/12;
        inches = inches%12;

        System.out.print(String.valueOf(feet)+ " Feet " + 
        String.valueOf(inches) + "Inches");
    }
}