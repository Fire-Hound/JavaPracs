import java.io.*;

class Slip7b{
    public static void main(String[] args) throws IOException
    {
        FileInputStream f1 = new FileInputStream("f1.txt");
        FileInputStream f2 = new FileInputStream("f2.txt");
        String content="";
        while(f1.available()!=0)
        {
            content += (char)f1.read();
        }
        f1.close();
        while(f2.available()!=0)
        {
            content += (char)f2.read();
        }
        f2.close();
        FileOutputStream f3 = new FileOutputStream("f3.txt");
        for(int i=0; i<content.length(); i++)
        {
            f3.write(content.charAt(i));
        }
        f3.close();
    }
}