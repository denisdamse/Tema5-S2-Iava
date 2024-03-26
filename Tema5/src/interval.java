import java.io.FileWriter;
import java.io.IOException;

public class interval {
    public Double limita_de_jos;
    public Double limita_de_sus;
    private static int numar_de_teste;
    private int numere_din_interval=0;
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
    
    public void scriereInterval()
    {               
        try 
        { 
            FileWriter fileWriter = new FileWriter("statistica.dat");
            fileWriter.append("Intervalul: "+this.limita_de_jos+" -> "+this.limita_de_sus+" are "+this.numere_din_interval+" numere;");
            fileWriter.append("procentul obtinut este: "+(this.numere_din_interval*100)/numar_de_teste+"%");
            fileWriter.append("\n");
            fileWriter.close();
        } 
        catch (IOException e) 
        {
            System.out.println("Nu am gasit fisierul");
        }
    }
}