//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt();
        int t[][];
        t = new int[n][n];

        for (int i=0;i<n;i++) {
            for (int j=0;j<=i;j++) {
               t[i][j] = scanner.nextInt();
            }
            }

        /*
        for (int i=0;i<n;i++) {
            System.out.println(Arrays.toString(t[i]));
        }
        */

        int total = 0,row_max;

            for (int i=0;i<n;i++) {
            row_max = Integer.MIN_VALUE;
            for (int j=0;j<=i;j++) {
                row_max = Math.max(row_max,t[i][j]);
            }
            total = total+row_max;
        }

    System.out.println(total);

    }
}