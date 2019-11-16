package lab22;
public class Figure implements NumberOfSidesPrintable
{
	int liczba_bokow;
	Figure()
	{
		liczba_bokow=0;
	}
	@Override
	public void printSidesNumber()
	{
		System.out.println(liczba_bokow);
	}
}