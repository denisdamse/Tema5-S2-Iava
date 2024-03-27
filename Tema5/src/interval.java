import java.io.FileWriter;
import java.io.IOException;

public class interval {
    public Double limita_de_jos;
    public Double limita_de_sus;
    public static int numar_de_teste;
    public int numere_din_interval=0;
    public interval(Double limita_De_jos,Double limita_De_sus)
    {
        this.limita_de_jos=limita_De_jos;
        this.limita_de_sus=limita_De_sus;
    }
    public void verify(Double value)
    {
        interval.numar_de_teste++;
        if(value>=this.limita_de_jos && value<=this.limita_de_sus)
        {
            this.numere_din_interval++;
        }
    }
    public static int verificareValori(String s)
    {
        
        String[] string = s.split(" ");
        
        for(int i=0;i<string.length-2;i++)
        {
            for(int j=i+1;j<string.length-1;j++)
            {
                if(Double.parseDouble(string[i])==Double.parseDouble(string[j]))
                {
                    return 0;
                }
            }
        }
        return 1;
    } 
    public void scriereInterval(String string_de_pus_in_fisier)
    {
        try {
            FileWriter fileWriter = new FileWriter("statistica.dat");
            fileWriter.append(string_de_pus_in_fisier);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("IOException");
        }
    }
}