import java.util.Scanner;

class matrix
{
    public static Scanner input_Instance = new Scanner(System.in);
    public static int matrixRow;
    public static int matrixCol;
    public static int[][] matrix;


    static void getMatrixData(int[][] matrix, int matrixRow, int matrixCol)
    {
        System.out.println("Enter Matrix Data");
          
        for (int currentRow = 0; currentRow < matrixRow; currentRow++)
        {
            for (int currentColumn = 0; currentColumn < matrixCol; currentColumn++)
            {
                matrix[currentRow][currentColumn] = input_Instance.nextInt();
            }
        }
    }
    public static void printMatrix(int[][] matrix, int matrixRow, int matrixCol)
    {
        System.out.println("Output Matrix is : ");
            
            for (int currentRow = 0; currentRow < matrixRow; currentRow++)
            {
                for (int currentColumn = 0; currentColumn < matrixCol; currentColumn++)
                {
                    System.out.print(matrix[currentRow][currentColumn]+"  ");
                }
                System.out.print("|"); 
                System.out.println();
            }
        System.out.print("- - - /");
    }
    static int[] calculateSumOfRows(int[][] matrix, int matrixRow, int matrixCol)
    {
        int[] sumRow = new int[matrixRow];
        for(int currentRow = 0; currentRow < matrixRow; currentRow++)
        {    
            for(int currentColumn = 0; currentColumn < matrixCol; currentColumn++)
            {  
              sumRow[currentRow] = sumRow[currentRow] + matrix[currentRow][currentColumn]; 
            }
        }
        return sumRow;
    }
    static int[] calculateSumOfColumns(int[][] matrix, int matrixRow, int matrixCol)
    {
        int[] sumColumn = new int[matrixCol];
        for(int currentRow = 0; currentRow < matrixRow; currentRow++)
        {    
            for(int currentColumn = 0; currentColumn < matrixCol; currentColumn++)
            {  
              sumColumn[currentColumn] = sumColumn[currentColumn] + matrix[currentRow][currentColumn]; 
            }
        }
        return sumColumn;
    }
    static int calculateSumOfDiagonal(int[][] matrix, int matrixRow, int matrixCol)
    {
        int sumDiagonal = 0;
        for(int currentRow = 0; currentRow < matrixRow; currentRow++)
        {    
            for(int currentColumn = 0; currentColumn < matrixCol; currentColumn++)
            { 
                if (currentColumn == currentRow)
                {
                    sumDiagonal = sumDiagonal + matrix[currentRow][currentColumn]; 
                }
            }
        }
        return sumDiagonal;
    }

    static void inputGetter()
    {
        System.out.println("Enter The Number Of Matrix Rows");
        int matrixRow = input_Instance.nextInt();
        System.out.println("Enter The Number Of Matrix Columns");
        int matrixCol = input_Instance.nextInt();
        int[][] matrix = new int[matrixRow][matrixCol];
        getMatrixData(matrix, matrixRow, matrixCol);
    }
    static void calculateOfMatrix()
    {
        
    }
    public static void main(String[] args) 
    {
        inputGetter();
        calculateSumOfRows(matrix,matrixRow, matrixCol);
        calculateSumOfColumns(matrix, matrixRow, matrixCol);
        calculateSumOfDiagonal(matrix, matrixRow, matrixCol);
        printMatrix(matrix, matrixRow, matrixCol);
        
    }
}