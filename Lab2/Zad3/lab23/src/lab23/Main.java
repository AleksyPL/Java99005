// Wczytaj z klawiatury kilka parametr�w. Wy�wietl je na ekran.
// Niech program pyta si� o parametry dop�ki u�ytkownik nie wpisze tekstu ko�cz�cego si� literami "end".
// Sp�jrz na metody klasy String - aby znale�� t� kt�ra to u�atwi.

package lab23;

import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		while(true)
		{
			String ciag="";
			ciag=scan.nextLine();
			if(ciag.endsWith("end"))
			{
				break;
			}
			else
			{
				continue;
			}
		}
		System.out.println("Udalo sie");
	}
}
