import java.io.BufferedReader;
import java.io.IOException;

public class StringFinder
{
	public static void main(String[] argsFromConsole) throws IOException 
	{
		if (Validator.isValid(argsFromConsole))
		{
			String stringToCheck = argsFromConsole[1];
			String fileName = argsFromConsole[0];
			BufferedReader fileReader =  FileOperations.genrateReadFileInstance(fileName);
			FileOperations.printLineContainsString(fileReader, stringToCheck);
		}
		
	}
}