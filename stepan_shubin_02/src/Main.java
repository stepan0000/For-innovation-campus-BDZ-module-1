//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner (System.in);
        String a = scanner.next();
        char b = a.charAt(0);
        char c = a.charAt(0);
        String ans = "";
        ans = ans + b;
        int counter = 1;

        for (int i=1;i<a.length();i++) {
            c = a.charAt(i);
            //System.out.println(c);
            if (b==c) {
                counter++;
            } else {
                ans = ans + Integer.toString(counter);
                b = c;
                ans = ans + b;
                counter = 1;
            }

        }
        ans = ans + Integer.toString(counter);
        System.out.print(ans);


    }
}