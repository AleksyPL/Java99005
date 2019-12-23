package zad33;

import java.util.HashMap;
import java.util.Map;

public class Maps
{

	public static void main(String[] args)
	{
		Map<Integer, String> map= new HashMap<Integer,String>();
		map.put(950926087,"Bauer");
		map.put(123456789,"Aleksy");
		map.put(420692137,"Olaf");
		map.put(478467766,"Kaczor donald");
		map.put(757557757,"Kononowicz");
		map.put(696969696,"Konstanty");
		System.out.println(map.get(950926087));
		System.out.println(map.containsValue("Bauer"));
	}
}
