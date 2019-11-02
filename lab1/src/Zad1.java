import java.util.Scanner;
import java.util.Arrays;

public class Zad1
{
    public static int input()
    {
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj bok trojakta: ");
        x = scan.nextInt();
        return x;
    }
    public static void pole (int arr[])
    {
        int suma = 0;
        int [] arr2= new int[3];
        for(int i=0; i<arr.length;i++)
        {
            suma = suma + arr[i];
            arr2[i]=arr[i];
        }
        double p = 0.5 * suma;
        System.out.println("Pole trojkata to: " + Math.sqrt(p*(p-arr2[0]))*(p-arr2[1])*(p-arr2[2]));
    }
    public static void prostokatny(int arr[])
    {
        double a=Math.pow(arr[2],2);
        double b=Math.pow(arr[1],2);
        double c=Math.pow(arr[0],2);
        if(a==b+c)
        {
            System.out.println("Trojkat jest prostokatny");
        }
        else
        {
            System.out.println("Trojkat nie jest prostokatny");
        }
    }
    public static void rozwartokatny(int arr[])
    {
        double a=Math.pow(arr[2],2);
        double b=Math.pow(arr[1],2);
        double c=Math.pow(arr[0],2);
        if(a>b+c)
        {
            System.out.println("Trojkat jest rozwartokatny");
        }
        else
        {
            System.out.println("Trojkat nie jest rozwartokatny");
        }
    }
    public static void all_about_triangle(int arr[])
    {
        Arrays.sort(arr);
        System.out.println("Twoje boki w kolejnosci rosnacej to: " + arr[2] + "," + arr[1] + "," + arr[0]);
        if(arr[0]<arr[1]+arr[2])
        {
            System.out.println("Mozna utowrzyc trojkat");
            pole(arr);
            prostokatny(arr);
            rozwartokatny(arr);
        }
        else
        {
            System.out.println("Nie mozna utowrzyc trojkata");
            System.out.println("Trojkat nie bedzie prostokatny gdyz nie mozna go utworzyc");
            System.out.println("Trojkat nie bedzie rozwartokatny gdyz nie mozna go utworzyc");
        }
    }
    public static void main(String[] args)
    {
        int [] arr= new int[3];
        arr[0]= input();
        arr[1]= input();
        arr[2]= input();
        all_about_triangle(arr);
    }
}
