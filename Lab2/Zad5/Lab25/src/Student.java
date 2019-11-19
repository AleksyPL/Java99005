import java.util.Scanner;

public class Student extends Person
{
    String univercity;
    boolean student_status;
    Student()
    {
        univercity = "";
        student_status = true;
    }
    public void main()
    {
        System.out.println("Skoro nie jesteś na uczycielem to musisz być studentem");
        Person czlowiek = new Person();
        czlowiek.InputData();
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj nazwe uczelni: ");
        univercity = scan.nextLine();
        String[] data= new String[4];
        data[0]="Imie: "+ czlowiek.imie;
        data[1]="Nazwisko: "+ czlowiek.nazwisko;
        data[2]="Student: "+ student_status;
        data[3]="Uczelnia: "+univercity;
        czlowiek.print_data(data);
    }
}