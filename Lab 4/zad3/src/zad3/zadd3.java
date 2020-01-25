package zad3;

class zasoby
{
	int stan = 2137;
	int get_stan()
	{
		return stan;
	}
	void set_stan(int i)
	{
		this.stan = i;
	}
	void stan_konta() throws InterruptedException
	{
		Thread.sleep(500);
	}
	void pobierz_kase()
	{
		int wynik = get_stan();
		if(wynik>1000)
		{
			wynik-=1000;
			set_stan(wynik);
			System.out.println("Pobrano 1000z³");
		}
		else
		{
			System.out.println("Masz nie wystarczajace srodki do pobrania kwoty 1000z³");
		}
	}
}
public class zadd3 extends Thread
{
	zasoby zasob = new zasoby();
	public void run()
	{
		synchronized(zasob)
		{
			try
			{
				zasob.stan_konta();
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
class wykonaj
{
	public static void main(String args[]) 
    {
		zasoby zasob = new zasoby();
        zadd3 t0 = new zadd3();
        t0.start();
    }
}