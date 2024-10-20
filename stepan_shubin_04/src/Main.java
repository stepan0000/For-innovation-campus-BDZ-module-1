import java.util.Arrays;
import java.util.Locale;
import  java.util.Scanner;
import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start_str = scanner.next();
        start_str = start_str.toLowerCase();
        String end_str = scanner.next();
        end_str = end_str.toLowerCase();

        String image_start;
        String image_end;
        char s;
        String f;
        int pos;
        if ( !(start_str.length() == end_str.length())) {
            System.out.println("NO");
          return;
        };

        for (int i = 0; i<start_str.length();i++) {

            f = start_str.substring(i, i+1);
            pos = end_str.indexOf(f);

            if ((pos == 0) && (pos < end_str.length())) {
                if (end_str.length()==1) {
                    end_str = "";}
                else
                {
                    end_str = end_str.substring(pos + 1, end_str.length()-1);
                }
            }
            if (pos > 0) {
                end_str = end_str.substring(0, pos - 1) + end_str.substring(pos + 1, end_str.length());
            }
        }
        if (end_str.isEmpty()) {
            System.out.println("YES");
        } else
        {
            System.out.println("NO");
        };

    }
}