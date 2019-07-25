import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations
{
	public static BufferedReader readingInstance;
	public static BufferedReader genrateReadFileInstance(String fileName)  
	{
		try
		{
			readingInstance = new BufferedReader(new FileReader(fileName));
		}
		catch (Exception e)
		{	
			System.out.print("No such File Found");			
		}
		return readingInstance;
	}
	public static void printLineContainsString(BufferedReader readingInstance,String stringToCheck) throws IOException
	{
		String currentLine;
		while ((currentLine =readingInstance.readLine()) != null) 
		{
            if (currentLine.contains(stringToCheck))
            {
            	System.out.println(currentLine);
            }
         }       		
	}
}
