// Zastosuj nową wiedzę o Java 8. 
// Zaproponuj implementację obiektów: Person, VipPerson, UniversityPerson, Teacher, Student. 
// Sam zaproponuj co z czego dziedziczy/implementuje. 
// Zastosuj jeśli się da interfejsy i domyślne metody itp.
// Pokaż w klasie ZadaniePerson przykłady użycia.

import java.util.Scanner;

public class ZadaniePerson
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean out = false;
        do
        {
            System.out.println("Czy jesteś VIP'em?");
            System.out.print("(Y/N): ");
            String wyb;
            wyb = scan.nextLine();
            wyb.toUpperCase();
            switch(wyb)
            {
                case "Y":
                {
                    VIP czlowiek_vip = new VIP();
                    czlowiek_vip.main();
                    out=true;
                    break;
                }
                case "N":
                {
                    do
                    {
                        System.out.println("Czy jesteś w jakimś stopiu połączony z jakimś uniwersytetem?");
                        System.out.print("(Y/N): ");
                        wyb = scan.nextLine();
                        wyb.toUpperCase();
                        switch(wyb)
                        {
                            case "Y":
                            {
                                do
                                {
                                    System.out.println("Czy jesteś w nauczycielem?");
                                    System.out.print("(Y/N): ");
                                    wyb = scan.nextLine();
                                    wyb.toUpperCase();
                                    switch(wyb)
                                    {
                                        case "Y":
                                        {
                                            Teacher nauczyciel = new Teacher();
                                            nauczyciel.main();
                                            out=true;
                                            break;
                                        }
                                        case "N":
                                        {
                                            Student studenciak = new Student();
                                            studenciak.main();
                                            out=true;
                                            break;
                                        }
                                        default:
                                        {
                                            break;
                                        }
                                    }
                                } while (out == false);
                                break;
                            }
                            case "N":
                            {
                                NormalPerson normik = new NormalPerson();
                                normik.main();
                                out=true;
                                break;
                            }
                            default:
                            {
                                break;
                            }
                        }
                    } while(out==false);
                    break;
                }
                default:
                {
                    break;
                }
            }
        } while (out==false);
    }
}