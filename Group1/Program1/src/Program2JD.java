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

    private static void printSums(int[][] array, boolean b) {
    }

    private static int[][] readArray(int i, int i1) {
    }
}
