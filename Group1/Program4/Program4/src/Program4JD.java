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
            return
        }
    }
}
