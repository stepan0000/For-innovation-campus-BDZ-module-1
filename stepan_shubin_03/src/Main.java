//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt(), v =0;


        int a[];
        a = new int[n];


        for (int i=0;i<n;i++) {
            a[i] = scanner.nextInt();
        }

        int ans[];

        ans = new int [0];
        boolean v_found_in_answer;

        for (int i=0;i<n;i++) {
            v = a[i];

            v_found_in_answer = false;

            for (int j=0; j<ans.length;j++) {
                if (ans[j] == v) {
                    v_found_in_answer = true;
                    break;
                }
            }

            if (!v_found_in_answer) {
                ans = Arrays.copyOf(ans,ans.length +1);
                ans[ans.length-1]=v;
            }
        }
        System.out.println(Arrays.toString(ans));


    }
}