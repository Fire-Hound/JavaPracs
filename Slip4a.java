import java.io.*;
class Slip4a
{

    public static void main(String[] args) throws IOException
    {
        String file = "a.txt";
        FileInputStream f = new FileInputStream(file);
        String Content = "";
        int ch;
        while((ch=f.read())!=-1)
        {
            Content+=((char)ch)+"";
        }
        f.close();
        
        String tobechanged = ((char)((int)(file.charAt(0))+2))+"";
        for(int i =1;i<file.length();i++)
        {
            tobechanged+=file.charAt(i);
        }
        FileOutputStream w = new FileOutputStream(tobechanged);
        for(int i = 0;i<Content.length();i++)
        {
            w.write(Content.charAt(i));
        }
        w.close();
    }
}