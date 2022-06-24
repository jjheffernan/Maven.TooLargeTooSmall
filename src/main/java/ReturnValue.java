import java.util.Scanner;

public class ReturnValue {

    /*
    Not good!! See comments
     */

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = in.nextLine();
            // refactor this to test item
        name = processName(name);

        // name
        System.out.println(name);
    }

    private static String processName(String name) {
        name = name.toUpperCase();
        name = name + " Maybe you'll be a Zipcoder someday\n";
        return name;
    }
}
