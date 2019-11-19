public class NormalPerson extends Person
{
    boolean average_person;
    NormalPerson()
    {
        average_person=true;
    }
    public void main()
    {
        Person czlowiek = new Person();
        czlowiek.InputData();
        String[] data= new String[3];
        data[0]="Imie: "+ czlowiek.imie;
        data[1]="Nazwisko: "+ czlowiek.nazwisko;
        data[2]="Normalny człowiek: "+ average_person;
        czlowiek.print_data(data);
    }
}
