public class Program4JD {

    public static void main (String[] args) {
        //Input arguments
        if (args.length < 2) {
            System.out.println("Usage: wordsearch <order> <wordfilename>");
            return
        }

        //grid order
        int order;
        try {
            order = Integer.parseInt(args[0]);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid order: " + args[0]);
            return;
        }

        //get file name containing words
        String fileName = args[1];

        //create and initialize puzzle
        Puzzle puzzle = new Puzzle(order, fileName);
        if (puzzle.createPuzzle()) {
            //display the grid with ounly the placed words
            puzzle.display();

            //fill remaining spaces with random letters and display the complete grid
            puzzle.fillRandom();
            puzzle.display();
        } else {
            System.out.println("Unable to create the puzzle.");
        }
    }
}
