import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

    private static String readFileContents(String FileName) {
        StringBuilder contentBuilder = new StringBuilder();

        String fileName;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append(" ");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + fileName);
            e.printStackTrace();
            return null;
        }

        return contentBuilder.toString();
    }


}
