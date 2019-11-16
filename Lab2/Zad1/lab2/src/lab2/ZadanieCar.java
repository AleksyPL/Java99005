// Zaproponuj implementacje klasy abstrakcyjnej Samochod oraz klasy dziedziczacej ja: Mercedes.
// Stworz pola, metody, metody abstrakcyjne itp.
// Zaprezentuj dzia³anie klasy w ZadanieCar.

package lab2;



public class ZadanieCar 
{
	public static void wyswietl_dane(String[] dane)
	{
		for(int i=0;i<dane.length;i++)
		{
			System.out.println(dane[i]);
		}
	}
	public static void do_all()
	{
		Mercedes samochod = new Mercedes();
		samochod.podaj_dane();
		samochod.czy_drogi();
		String[] dane = new String[6];
		dane[0]="Marka: "+ samochod.marka;
		dane[1]="Model: "+ samochod.model;
		dane[2]="Kolor: "+ samochod.kolor;
		dane[3]="Rok produkcji: "+ samochod.rok_produkcji;
		dane[4]="Cena: "+ samochod.cena;
		dane[5]="Moc silnika: "+ samochod.moc;
		wyswietl_dane(dane);
	}
	public static void main(String[] Args)
	{
		do_all();
	}
}
