package zad34;

import java.util.*;

public class People implements Comparable <People>
{
	String imie;
	String nazwisko;
	int wiek;
	public void set1(String imiee)
	{
		this.imie=imiee;
	}
	public void set2(String nazwiskoo)
	{
		this.nazwisko=nazwiskoo;
	}
	public void set3(int wiekk)
	{
		this.wiek=wiekk;
	}
	public String get1()
	{
		return imie;
	}
	public String get2()
	{
		return nazwisko;
	}
	public int get3()
	{
		return wiek;
	}
	public void getAll()
	{
		System.out.println(this.imie + " " + this.nazwisko + " " + this.wiek);
	}
	People(String imie, String nazwisko, int wiek)
	{
		set1(imie);
		set2(nazwisko);
		set3(wiek);
	}
	public static void main(String[] args) 
	{
		List<People>lista = new ArrayList<People>();
		List<People>lista2 = new ArrayList<People>();
		lista.add(new People("Jakub","Bauer",23));
		lista.add(new People("Karol","Wojtyla",21));
		lista.add(new People("Warol","Kojtyla",37));
		lista.add(new People("Aleksy","Aleksy",420));
		lista2 = lista;
		lista.forEach(People::getAll);
		System.out.println();
		Collections.sort(lista2);
		lista2.forEach(People::getAll);
	}

	@Override
	public int compareTo(People o)
	{
		if(this.get3() < o.get3())
		{
			return 1;
		}
		else if(this.get3() > o.get3())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
