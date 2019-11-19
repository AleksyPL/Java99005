import java.util.Scanner;

public class Teacher extends Person
{
    String univercity;
    boolean teacher_status;
    Teacher()
    {
        univercity = "";
        teacher_status = true;
    }
    public void main()
    {
        Person czlowiek = new Person();
        czlowiek.InputData();
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj nazwe uczelni: ");
        univercity = scan.nextLine();
        String[] data= new String[4];
        data[0]="Imie: "+ czlowiek.imie;
        data[1]="Nazwisko: "+ czlowiek.nazwisko;
        data[2]="Nauczyciel: "+ teacher_status;
        data[3]="Uczelnia: "+univercity;
        czlowiek.print_data(data);
    }
}
