//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static int int_power(int a, int b) {
      if (b == 0) return 1;
      int ans = a;
      for (int i=1;i<b;i++) {
          ans = ans*a;
      }
      return ans;
    };

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();
        int n = 0,d,x,y=0, p=0;

        d = a;

        while (d>0) {
            d = d / 10;
            n++;
        };
        d = a;

        for (int i=0;i<n;i++) {
            x = d % 10;
            d = d / 10;
            y = y+x*Main.int_power(10,n-i-1);
        };

        System.out.print(y);

    }
}