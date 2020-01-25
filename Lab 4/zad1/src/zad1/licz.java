package zad1;

public class licz implements Runnable
{
	int st;
	int end;
	licz(int st, int end)
	{
		this.st=st;
		this.end=end;
	}
	public static void main(String []Args)
	{
		licz t0 = new licz(0,100);
		Thread t00 = new Thread(t0);
		t00.start();
		licz t1 = new licz(100,200);
		Thread t01 = new Thread(t1);
		t01.start();
		licz t2 = new licz(200,300);
		Thread t02 = new Thread(t2);
		t02.start();
		licz t3 = new licz(300,400);
		Thread t03 = new Thread(t3);
		t03.start();
		licz t4 = new licz(400,500);
		Thread t04 = new Thread(t4);
		t04.start();
	}
	public void run() 
	{
		for(int j=st;j<end;j++)
		{
			if(j%3==0)
			{
				System.out.println(j);
			}
		}
	}
}
