package lab2;
import java.util.Scanner;

public class Mercedes extends Samochod
{
	Scanner scan = new Scanner(System.in);
	public void podaj_dane()
	{
		System.out.print("Podaj marke: ");
		marka = scan.nextLine();
		System.out.print("Podaj model: ");
		model = scan.nextLine();
		System.out.print("Podaj kolor: ");
		kolor = scan.nextLine();
		System.out.print("Podaj rok produkcji: ");
		rok_produkcji = scan.nextInt();
		System.out.print("Podaj cene: ");
		cena = scan.nextInt();
		System.out.print("Podaj moc silnika: ");
		moc = scan.nextInt();
	}
	public void czy_drogi()
	{
		if(cena>1000)
		{
			System.out.println("Drogi");
		}
		else
		{
			System.out.println("Nie drogi");
		}
	}
}
