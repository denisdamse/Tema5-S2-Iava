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
            String string_de_pus_in_fisier="";
            BufferedReader reader_verificare_valori = new BufferedReader(new FileReader("numere.dat"));
            String verificare_valori = reader_verificare_valori.readLine();
            if(interval.verificareValori(verificare_valori)==1)
            {
                reader_verificare_valori.close();
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
                    string_de_pus_in_fisier=string_de_pus_in_fisier+"Intervalul: "+interval_creat.limita_de_jos+" -> "+interval_creat.limita_de_sus+" are "+interval_creat.numere_din_interval+" numere; ";
                    string_de_pus_in_fisier=string_de_pus_in_fisier+"procentul obtinut este: "+(interval_creat.numere_din_interval*100)/interval.numar_de_teste+"%"+"\n";
                    interval_creat.scriereInterval(string_de_pus_in_fisier);
                    reader_valori.close();
            }
            reader_interval.close();
            }
            else
            {
                reader_verificare_valori.close();
                System.out.println("Aveti valori duplicate in fisier"); 
            }
        }
        catch(IOException e)
        {
            System.out.println("Nu exista fisierul");
        }
    }
}