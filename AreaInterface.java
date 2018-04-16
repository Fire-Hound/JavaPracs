import java.io.*;

public class AreaInterface {
    public static void main(String[] args) throws IOException{
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        r.AreaCompute();
        c.AreaCompute();
    }
} 
interface AInterface
{
    public void AreaCompute() throws IOException;
}
class Rectangle implements AInterface {
    public void AreaCompute() throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Length: ");
        int length = Integer.parseInt(bf.readLine());
        System.out.print("\nEnter Breadth: ");
        int breadth = Integer.parseInt(bf.readLine());
        System.out.println("Area of Rectangle: " + (length*breadth));
    }
}
class Circle implements AInterface{
    public void AreaCompute() throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Radius: ");
        int rad = Integer.parseInt(bf.readLine());
        System.out.println("Area of Circle: " + (3.14*rad*rad));
    }
}