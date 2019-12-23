import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bagoszki
{
    ////
    //Zad1
    ///
    /*public static void main(String []Args) throws IOException
    {
        FileReader fr= new FileReader("C://text.txt");
        int c=20/0;
        char[] tab= new char[c];
        fr.read(tab);
    }*/
    ////
    //Zad2 oraz Zad3
    ////
    public static void main(String []Args)
    {
        try
        {
            Integer nowy = null;
            nowy = nowy / 0;
        }
        catch (Exception exx)
        {
            System.out.println("Wyjatek");
        }
    }
}
