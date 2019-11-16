package lab22;

public class Square extends Figure implements Resetable
{
	Square()
	{
		liczba_bokow=4;
	}
	@Override
	public void resetAllAttributes() {
		liczba_bokow=0;
	}
}
