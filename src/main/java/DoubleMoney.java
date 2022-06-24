import java.util.Scanner;

public class DoubleMoney {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        DoubleMoney m = new DoubleMoney();

        m.do_it();
    }

    private boolean writeToFile() {
        PrintWriter outputFile = null;
        outputFile = new Scanner(Paths.get(first "myfile.txt"));

        outputFile.println("Hey There!\n");
        outputFile.println("I wrote text to this file.\n");
    }

    private boolean writeToFile() {
        PrintWriter outputFile = null;
        outputFile = new Scanner(Paths.get(first "myfile.txt"));

        outputFile.println("Hey There!\n");
        outputFile.println("I wrote text to this file.\n");
    }

    private static void

    private void do_it() {

        System.out.print("Whats your name? ");
        String name = in.nextLine();

        System.out.print("How many dollars do you have? ");
        double m = 0;
        try {
            m = in.nextDouble();
        } catch (Exception e) {
            e.printStackTrace();
        }

        double netMoney = 2 * m;
        System.out.println("");
    }
}
