import java.util.Scanner;
public class SumAvgOfArray
{
    static int sum_Of_Array;
    static int length_Of_Array;
    public static String getInputFromUser()
    {
        Scanner inputInstance = new Scanner(System.in);
        System.out.println("Enter the array:");
        String input_from_user = inputInstance.nextLine();
        inputInstance.close();
        return input_from_user;
    }

    public static int calculateSum(String[] user_Input_array)
    {
        int the_Sum_Of_array = 0;
        length_Of_Array = lengthOfArray(user_Input_array);
        for(int i = 0; i < length_Of_Array; i++)
           the_Sum_Of_array += Integer.parseInt(user_Input_array[i]);
        return the_Sum_Of_array;

    }

    public static double calculateAvg(int sum_Of_Array,int length_Of_Array)
    {
        double the_Avg_Of_Array;
        the_Avg_Of_Array = sum_Of_Array/length_Of_Array;
        return the_Avg_Of_Array;
    }

    public static String[] processStringToStringArray(String userInput)
    {
        String[] array_Of_Strings = userInput.split(" ");
        return array_Of_Strings;
    }

    public static int lengthOfArray(String[] array_Of_Strings)
    {
        return array_Of_Strings.length;
    }
    public static void printSum(String[] user_Input_array)
    {
        sum_Of_Array = calculateSum(user_Input_array);
        System.out.println("Sum is : " + sum_Of_Array);

    }
    public static void printAvg(String[] user_Input_array)
    {
        double avg_Of_Array = calculateAvg(sum_Of_Array,length_Of_Array);
        System.out.println("Avg is : " + avg_Of_Array);

    }
    public static void main(String[] args)
    {
        String user_Input;
        user_Input = getInputFromUser();
        String[] user_Input_Array= processStringToStringArray(user_Input);
        printSum(user_Input_Array);
        printAvg(user_Input_Array);
        
    }
}