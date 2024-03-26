import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main 
{
    public static void main(String[] args) 
    {
        try
        {
            BufferedReader reader_interval = new BufferedReader(new FileReader("intervale.dat"));
            String line=reader_interval.readLine();
            while(line!=null)
            {
                String new_string=line.replace("[", "");
                String final_string=new_string.replace("]","");
                String[] string_interval = final_string.split(",");
                interval interval_creat=new interval(Double.parseDouble(string_interval[0]),Double.parseDouble(string_interval[1]));
                line = reader_interval.readLine();
                BufferedReader reader_valori = new BufferedReader(new FileReader("numere.dat"));
                String valori = reader_valori.readLine();
                String[] valori_fara_spatii = valori.split(" ");  
                    
                    for(int i=0;i<valori_fara_spatii.length;i++)
                    {
                        Double x=Double.parseDouble(valori_fara_spatii[i]);
                        interval_creat.verify(x);
                    }
                interval_creat.scriereInterval();
                reader_valori.close();
            }
            reader_interval.close();
        }
        catch(IOException e)
        {
            System.out.println("Nu exista fisierul");
        }
    }
}