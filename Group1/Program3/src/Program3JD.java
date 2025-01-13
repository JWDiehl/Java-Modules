public class Program3JD {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("error: please provide at least two arguments - text file name and Dale-Chall words file name.");
            return;
        }

        //Text file name and DaleChallWordsname here
        String textFileName = args[0];
        String daleChallWordsFileName = args[1];

        String text = readFileContents(textFileName);
        if (text == null) {
            System.err.println("Failed to read the text file. Exciting");
            return;
        }

        Text newText = new Text(text);
        DaleChall newDC = new DaleChall(newText, daleChallWordsFileName);
        newDC.printGradeLevel();
    }

    private static String readFileContents(String textFileName) {
    }


}
