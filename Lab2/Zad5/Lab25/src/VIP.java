public class VIP extends Person
{
    boolean vip_status;
    VIP()
    {
        vip_status=true;
    }
    public void main()
    {
        Person czlowiek = new Person();
        czlowiek.InputData();
        String[] data= new String[3];
        data[0]="Imie: "+ czlowiek.imie;
        data[1]="Nazwisko: "+ czlowiek.nazwisko;
        data[2]="Status VIP: "+ vip_status;
        czlowiek.print_data(data);
    }
}
