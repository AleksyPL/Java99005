package zad31;
//Napisz metodê klasyczn¹ (nie statyczn¹), o nazwie contains,
//która przyjmuje typ generyczny <T> która przyjmuje 2 argumenty:
//	- Dowoln¹ listê obiektów typu T
//	- Jeden element typu T

//Metoda zwraca true, jeœli element podany w drugim parametrze znajduje siê w tablicy
//(z dok³adnoœci¹ do metody equals).

public class Main <T,L>
{	  
	
	public boolean contains(T alpha[], L beta)
	{
		for(int i=0;i<alpha.length;i++)
		{
			if(alpha[i].equals(beta))
			{
				return true;
			}
			else
			{
				;
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		String[] array = {"element", "item"};
	    String element1 = "element";
	    String element2 = "element2";
	    
	    Main main = new Main();
	    System.out.println(main.contains(array, element1));
	    System.out.println(main.contains(array, element2));
	}
}