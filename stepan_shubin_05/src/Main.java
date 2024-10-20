import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {


    private static final int[] normal_year_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] leap_year_days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public  static int days_from_start_year(int day , int month , int year ) {
        int d = 0;

        if (year % 4 == 0) {
            for (int i = 0; i < month-1; i++) {
                d = d + Main.leap_year_days[i];
            }
        } else {
            for (int i = 0; i < month-1; i++) {
                d = d + Main.normal_year_days[i];
            }
        }

        d = d + day;
        return d;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner scanner = new Scanner(System.in);

        int date[];
        date = new int[3];


        date[0] = scanner.nextInt();
        date[1] = scanner.nextInt();
        date[2] = scanner.nextInt();

        int today[] = {20, 10, 2024};

        int days1 = days_from_start_year(today[0],today[1],today[2]);
        int days2 = days_from_start_year(date[0],date[1],date[2]);

        int leap_years_between = ((today[2]-date[2]) / 4);
        int normal_years = ((today[2]-date[2])-leap_years_between+1);


        int days_between = normal_years*365+leap_years_between*366+days1 - days2;

        System.out.print(days1 + " " + days2 + " " + leap_years_between + " " + normal_years + " " + days_between);

    }
}