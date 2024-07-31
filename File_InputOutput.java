import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_InputOutput
{
    public static void main(String[] args)
    {
        String csvFile = "D:\\CSVDemo.csv";
        String line = "";
        String csvSplitBy = ",";

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("D:\\CSVDemo.csv"));
            while ((line = br.readLine()) != null)
            {
                String[] data = line.split(csvSplitBy);
                for (String value : data)
                {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


