package abcd.example.app.find.text;

import abcd.example.find.text.FindTextInCurly;

import java.util.Scanner;

public class FindTextInCurlyApp {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a text: ");
            String str = kb.nextLine();

            if(str.equals("quit"))
                break;

            FindTextInCurly find = new FindTextInCurly(str);
            System.out.printf("%s%n", find.isValid() ? find.getResult() : "Invalid input..");
        }
    }
}
