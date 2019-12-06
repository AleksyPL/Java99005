import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class podstawa
{
    static String[] input_from_string(String[] tab)
    {
        Scanner scan = new Scanner(System.in);
        int i=0;
        do
        {
            tab[i]=scan.nextLine();
            i++;
        } while (!tab[i-1].contains("koniec"));
        return tab;
    }
    static String[] input_from_file(String[] tab) throws FileNotFoundException
    {
        File plik = new File("./src/obliczenia.txt");
        Scanner scan = new Scanner(plik);
        int i=0;
        while(scan.hasNextLine()){
            tab[i]=scan.nextLine();
            i++;
        }
        return tab;
    }
    public static void main(String[] Args) throws FileNotFoundException
    {
        String[] tab=new String[100];
        int pom_esc=0;
        Scanner scan = new Scanner(System.in);
        do
        {
            System.out.println("Kalkulator - Michał Aleksandrowicz");
            System.out.println("Realizuje działania z w jednej linii z pominieciem kolejnosci wykonywania działań.");
            System.out.println("Maksymalnie 100 poleceń, można jednak zakończyć wczytywanie wcześniej wpisując słowo \"koniec\".");
            System.out.println("1. Wykonuj polecenia poprzez wpisywanie ich ręcznie.");
            System.out.println("2. Wczytaj polecenia z pliku tekstowego.");
            System.out.println();
            System.out.print("Twój wybór to: ");
            String wyb="";
            wyb=scan.nextLine();
            wyb=wyb.toLowerCase();
            switch (wyb)
            {
                case "1":
                {
                    tab=input_from_string(tab);
                    pom_esc=1;
                    break;
                }
                case "2":
                {
                    tab=input_from_file(tab);
                    pom_esc=1;
                    break;
                }
                default:
                {
                    break;
                }
            }
        } while (pom_esc==0);
        int pomoc=100;
        for(int i=0;i<100;i++)
        {
            if (tab[i] == null || tab[i].contains("koniec"))
            {
                pomoc--;
            }
        }
        przetw secondfile= new przetw();
        for(int i=0;i<pomoc;i++)
        {
            secondfile.main(tab[i]);
        }
    }
}
