import java.util.Scanner;

public class Person implements Input
{
    String imie;
    String nazwisko;
    @Override
    public void InputData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        imie = scan.nextLine();
        System.out.print("Podaj nazwisko: ");
        nazwisko = scan.nextLine();
    }
    Person()
    {
        imie = "";
        nazwisko="";
    }
    void print_data(String[] data)
    {
        System.out.println();
        System.out.println();
        for(int i=0;i<data.length;i++)
        {
            System.out.println(data[i]);
        }
    }
}
