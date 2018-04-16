public class CozaLozaWoza {
    public static void main(String[] args) {
        for(int i=1; i<=110; i++)
        {   
            String output = "";
            if(i%3==0) output+= "Coza ";
            if(i%5==0) output+= "Loza ";
            if(i%7==0) output+= "Woza ";

            if(output == "") System.out.print(i + " ");
            else System.out.print(output);

            if(i%11==0) System.out.println();
        }
    }
    
}