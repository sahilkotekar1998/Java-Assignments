import java.io.FileInputStream;
public class Checked_Exceptions_example
{
    public static void main (String[] args) 
    {
        try
        {
            FileInputStream fos = new FileInputStream("d:/abc.txt");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}