import java.util.Scanner;

public class Program2JD {

    public static void main(String[] args) {
        System.out.println("Enter five rows with five numbers in each row:");
        
        //Reads a 5x5 array from user input
        int[][] array = readArray(5, 5); 
        
        System.out.println("\nSum of each row:");
        
        //print sum of each row
        printSums(array, true); 
        
        System.out.println("\nSum of each column:");
        
        //print sum of each column!
        printSums(array, false);
    }

    //this method calculates and prints the sum of rows or cols
    private static void printSums(int[][] array, boolean b) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += b ? array[i][j] : array[j][i];
            }
            System.out.println(sum);
        }
    }

    private static int[][] readArray(int rows, int cols) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[rows][cols];
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }
}
