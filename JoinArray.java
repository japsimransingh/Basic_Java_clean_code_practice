public class JoinArray
{
    public static String join(int[] array)
    {
        return join(array, ',');
    }
    
    public static String join(int[] array,char seperator)
    {
        StringBuilder array_with_seperator = new StringBuilder();
        for (int i = 0; i < array.length; i++) 
        {
             array_with_seperator.append(array[i]);
             array_with_seperator.append(seperator);
        }
        return  array_with_seperator.toString();
    }

    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3};
        System.out.println(join(arr));
        System.out.println(join(arr, ';'));
    }
}
