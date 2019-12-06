import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;

public class przetw
{
    public static void main(String tab)
    {
        tab= RegExUtils.removeAll(tab,"[a-z]");
        tab= RegExUtils.removeAll(tab,"[A-Z]");
        if(tab.contains("+")||tab.contains("-")||tab.contains("*")||tab.contains("/"))
        {
            String[] tab2= new String[tab.length()];
            tab2=StringUtils.splitByCharacterType(tab);
            float wynik=0;
            for(int i=1;i<tab2.length;i+=2)
            {
                if(tab2[i].equals("+"))
                {
                    if(i==1)
                    {
                        float temp1=Float.parseFloat(tab2[i-1]);
                        float temp2=Float.parseFloat(tab2[i+1]);
                        wynik=temp1+temp2;
                    }
                    else
                    {
                        float temp1 = Float.parseFloat(tab2[i + 1]);
                        wynik += temp1;
                    }
                }
                if(tab2[i].equals("-"))
                {
                    if(i==1)
                    {
                        float temp1=Float.parseFloat(tab2[i-1]);
                        float temp2=Float.parseFloat(tab2[i+1]);
                        wynik=temp1-temp2;
                    }
                    else
                    {
                        float temp1 = Float.parseFloat(tab2[i + 1]);
                        wynik -= temp1;
                    }
                }
                if(tab2[i].equals("*"))
                {
                    if(i==1)
                    {
                        float temp1=Float.parseFloat(tab2[i-1]);
                        float temp2=Float.parseFloat(tab2[i+1]);
                        wynik=temp1*temp2;
                    }
                    else
                    {
                        float temp1 = Float.parseFloat(tab2[i + 1]);
                        wynik *= temp1;
                    }
                }
                if(tab2[i].equals("/"))
                {
                    if(i==1)
                    {
                        float temp1=Float.parseFloat(tab2[i-1]);
                        float temp2=Float.parseFloat(tab2[i+1]);
                        wynik=temp1/temp2;
                    }
                    else
                    {
                        float temp1 = Float.parseFloat(tab2[i + 1]);
                        wynik /= temp1;
                    }
                }
            }
            System.out.println(tab+"="+wynik);
        }
    }
}
