package zad2;

public class zadd2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String []Args)
	{
		for(int i=0;i<10;i++)
		{
			zadd2 t0 = new zadd2();
			Thread t00 = new Thread(t0);
			t00.start();
			try
	        { 
	            t00.join(); 
	        } 
	  
	        catch(Exception ex) 
	        { 
	            System.out.println("Exception has " + "been caught" + ex); 
	        } 
		}
	}
}
