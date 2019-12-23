import java.util.*;
import java.util.TreeSet;

public class People2 implements Comparable<People2>
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
    People2(String imie, String nazwisko, int wiek)
    {
        set1(imie);
        set2(nazwisko);
        set3(wiek);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People2 people2 = (People2) o;
        return wiek == people2.wiek &&
                Objects.equals(imie, people2.imie) &&
                Objects.equals(nazwisko, people2.nazwisko);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(imie, nazwisko, wiek);
    }

    public static void main(String[] args)
    {
        HashSet<People2>lista = new HashSet<>();
        lista.add(new People2("Jakub","Bauer",23));
        lista.add(new People2("Karol","Wojtyla",21));
        lista.add(new People2("Warol","Kojtyla",37));
        lista.add(new People2("Aleksy","Aleksy",420));
        lista.add(new People2("Aleksy","Aleksy",420));
        lista.forEach(People2::getAll);
        System.out.println();
        TreeSet<People2>lista2 = new TreeSet<>();
        lista2.add(new People2("Jakubb","Bauerr",233));
        lista2.add(new People2("Karoll","Wojtylaa",211));
        lista2.add(new People2("Waroll","Kojtylaa",377));
        lista2.add(new People2("Aleksyy","Aleksyy",4200));
        lista2.add(new People2("Aleksyy","Aleksyy",4200));
        lista2.forEach(People2::getAll);
        System.out.println();
        TreeSet<People2>lista3 = new TreeSet<>();
        lista3= (TreeSet<People2>) lista2.descendingSet();
        lista3.forEach(People2::getAll);
    }

    @Override
    public int compareTo(People2 o)
    {
        if(this.wiek==o.wiek)
        {
            return 0;
        }
        else if(this.wiek>o.wiek)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
