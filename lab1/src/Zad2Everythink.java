import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Locale;

public class Zad2Everythink
{
    public static String[] load(String[] pytanie) throws FileNotFoundException {
        File plik = new File("./src/quiz.txt");
        Scanner scan = new Scanner(plik);
        for(int i=0;i<30;i++)
        {
            pytanie[i] = scan.nextLine();
        }
        return pytanie;
    }
    public static int showquestions(String[] pytanie)
    {
        Scanner scan = new Scanner(System.in);
        int wynik=0;
        for(int i=0;i<5;i++)
        {
            System.out.println(pytanie[i*6+0]);
            System.out.println(pytanie[i*6+1]);
            System.out.println(pytanie[i*6+2]);
            System.out.println(pytanie[i*6+3]);
            System.out.println(pytanie[i*6+4]);
            System.out.print("Twoja odpowiedz to: ");
            String answer = scan.nextLine();
            answer = answer.toLowerCase();
            if(answer.equals(pytanie[i*6+5]))
            {
                System.out.println("Dobra odpowiedź");
                wynik++;
            }
            else
            {
                System.out.print("Zła odpowiedź, poprawna odpowiedź to: ");
                System.out.println(pytanie[i*6+5]);
            }
        }
        return wynik;
    }
    public static void main() throws FileNotFoundException {
        String pytanie[] = new String[30];
        load(pytanie);
        int wynik = showquestions(pytanie);
        System.out.println("Twój wynik to: " + wynik + "/5");
    }
}
