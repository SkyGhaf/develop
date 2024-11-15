import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("wat moet je eten?:");

        String eten1 = scanner.nextLine();

        System.out.println ("je moet " + eten1 + " eten");
    }
}