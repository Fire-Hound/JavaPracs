import java.util.Scanner;
class Slip1a
{
    
    public static void main(String args[])
    {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String alphabet;
        boolean endFlag = false;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter end char: ");
        String end = s.next();
        
        for(int row = 0; row<=25; row++)
        {
            if(endFlag == true) break;
            for(int col = row; col>=0; col--)
            {
                alphabet = alphabets.charAt(col)+"";
                System.out.print(alphabet);

                if(alphabet.equals(end))       
                    endFlag = true;    
            }
            System.out.print("\n");
        }
    }
}