// Wczytaj z klawiatury kilka parametrów. Wyœwietl je na ekran.
// Niech program pyta siê o parametry dopóki u¿ytkownik nie wpisze tekstu koñcz¹cego siê literami "end".
// Spójrz na metody klasy String - aby znaleŸæ t¹ która to u³atwi.

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
