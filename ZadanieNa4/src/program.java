import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class program
{
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void print_all(ArrayList<Integer> lista)
    {
        for(int i:lista)
        {
            if(isPrime(i) && i>0)
            {
                System.out.println("Liczba pierwsza: " + i);
            }
            else if(!isPrime(i) && i>0)
            {
                System.out.println("Liczba dodatnia: " + i);
            }
            else if(i<0)
            {
                System.out.println("Liczba ujemna:  " + i);
            }
        }
    }
    static public void main(String []Args)
    {
        Scanner scanner = new Scanner(System.in);
        String userstring="";
        do
        {
            String temp = "";
            temp = scanner.nextLine();
            userstring+=temp;
        } while (!userstring.endsWith("N"));
        userstring = userstring.replaceAll("\\p{Space}", "");
        userstring = userstring.replaceAll("[\\p{Punct}&&[^-]]+","");
        userstring = userstring.replaceAll("N", "");
        String userstring2[] = StringUtils.splitByCharacterType(userstring);
        for(int i=0;i<userstring2.length;i++)
        {
            if(userstring2[i].equals("-") && i+1<userstring2.length)
            {
                userstring2[i+1]=StringUtils.join('-',userstring2[i+1]);
            }
        }
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i=0;i<userstring2.length;i++)
        {
            if(StringUtils.isNumeric(userstring2[i]))
            {
                lista.add(Integer.parseInt(userstring2[i]));
            }
            else if(StringUtils.startsWith(userstring2[i],"-") && !userstring2[i].equals("-"))
            {
                String temp = StringUtils.remove(userstring2[i],"-");
                Integer temp2 = -Integer.parseInt(temp);
                lista.add(temp2);
            }
            else if(StringUtils.isAlpha(userstring2[i]))
            {
                String tempString = userstring2[i];
                int wynik = 0;
                for(int j=0;j<tempString.length();j++)
                {
                    int temp = (int)tempString.charAt(j);
                    wynik+=temp;
                }
                lista.add(wynik);
            }
        }
        if(lista.isEmpty())
        {
            System.out.println("Żaden element nie został dopisany do listy");
        }
        else
        {
            program obiekt = new program();
            System.out.println("Pierwotna lista");
            obiekt.print_all(lista);
            System.out.println("Posortowana lista");
            Collections.sort(lista);
            obiekt.print_all(lista);
        }
    }
}
