import java.io.*;

public class outputcl {

    public static void main(String[] args) throws IOException {
        
        FileOutputStream f = new FileOutputStream("data.txt");

        String output_string = "";
        for(int i=0; i<args.length;i++)
        {
            output_string += args[i] + " ";//extra " " to seperate String
        }
        
        f.write(output_string.getBytes());
        f.close();
    }
}