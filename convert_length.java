import java.util.Scanner;
class lengthConvertor
{
  double convertedLength;
  String from_Inch_to_Feet(double inputlength)
  {
    convertedLength = inputlength/12;  //Formula
    return inputlength + " Inch = " + convertedLength  + " Feet";
  }
  String from_Feet_to_Inch(double inputlength)
  {
    convertedLength =  inputlength*12; //Formula
    return inputlength + " Feet = " + convertedLength  + " Inch ";
  }
  String from_Inch_to_Meter(double inputlength)
  {
    convertedLength = inputlength/39.37;  //Formula
    return inputlength + " Inch = " + convertedLength  + " Meter(s)";
  }
  String from_Meter_to_Inch(double inputlength)
  {
    convertedLength = inputlength*39.37;  //Formula
    return inputlength + "  Metre(s) = " + convertedLength  + " Inch";
  }
  String from_Feet_to_Meter(double inputlength)
  {
    convertedLength = inputlength/3.2808;  //Formula
    return inputlength + " Feet = " + convertedLength  + " Meter(s)";
  }
  String from_Meter_to_Feet(double inputlength)
  {
    convertedLength = inputlength*3.2808;  //Formula
    return inputlength + "  Metre(s) = " + convertedLength  + " Feet";
  }
}


class master
{
  private static Scanner inputInstance;
  private static lengthConvertor ConvertorObj = new lengthConvertor() ;


  public static Scanner getInputInstance()
  {
    if (inputInstance == null)
    inputInstance = new Scanner(System.in);

    return inputInstance;
  }


  public static int convert_input_to_int(String userinputinString)
  {
    int user_input_in_int;
    try 
    {
       user_input_in_int = Integer.valueOf(userinputinString);
    } 
    catch (Exception e) 
    {
      user_input_in_int = 0;
    }
    return user_input_in_int;
  }

  public static boolean isInputValid(String userInput)
  {
    int userinput = convert_input_to_int(userInput);
    return (userinput > 0 && userinput < 8); 
  }

  public static void printUsermenu()
  {
    System.out.println("-----------Convertor----------");
    System.out.println("1.From Inch to Feet");
    System.out.println("2.From Feet to Inch");
    System.out.println("3.From Inch to Meter(s)");
    System.out.println("4.From Meter(s) to Inch");
    System.out.println("5.From Feet to Meter(s)");
    System.out.println("6.From Meter(s) to Feet");
    System.out.println("7.Exit From Program");

  }
  public static String getUserInput()
  {
    System.out.print("Enter the option:");
    String userInputString = inputInstance.nextLine();
    return userInputString;
  }
  public static double get_user_input_of_Length()
  {
    // while will run until user enters an valid input or exits the program by force
    while(true)
    {
      System.out.print("Enter the length that need's to be converted:");
      try{
        String get_user_input_of_Length = inputInstance.nextLine();
        return Double.parseDouble(get_user_input_of_Length);
      }
      catch(Exception e)
      {
        System.out.println("Enter input is not valid. Enter the input again.");
      }
    }
  }
  public static void ConversionHandler(String user_Input)
  {
    if (user_Input.equals("7"))
    System.exit(0);
    
    double length_to_be_converted = get_user_input_of_Length();
    String converted_length = "";
    switch(user_Input)
    {
      case "1":
      converted_length = ConvertorObj.from_Inch_to_Feet(length_to_be_converted);
      break;
      case "2":
      converted_length = ConvertorObj.from_Feet_to_Inch(length_to_be_converted);
      break;
      case "3":
      converted_length = ConvertorObj.from_Inch_to_Meter(length_to_be_converted);
      break;
      case "4":
      converted_length = ConvertorObj.from_Meter_to_Inch(length_to_be_converted);
      break;
      case "5":
      converted_length = ConvertorObj.from_Feet_to_Meter(length_to_be_converted);
      break;
      case "6":
      converted_length = ConvertorObj.from_Meter_to_Feet(length_to_be_converted);
      break;
    }

    System.out.println("\n" + converted_length + "\n");
  }


  public static void userInteractiveMenu()
  {
    while (true)
    {
      printUsermenu();
      String user_Input = getUserInput();

      if (isInputValid(user_Input))
      {
        ConversionHandler(user_Input);
      }
      else
      System.out.println("Input was not valid. kindly Enter Again.");
    }
  }
  
  public static void main(String[] args)
  {
    getInputInstance();
    userInteractiveMenu();
  }
}