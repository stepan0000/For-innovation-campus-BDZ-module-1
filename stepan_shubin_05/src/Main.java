//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {

    private static final int[] normal_year_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] leap_year_days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int days_from_start_year(day int, month int, year int) {
        int d integer = 0;

        if year % 4 {
            for (int i = 0; i < month; i++) {
                d = d + leap_year_days[i];
            } else
            {
                for (int i = 0; i < month; i++) {
                    d = d + normal_year_days[i];
                }
                ;

                d = d + days;

                return d;

            }
        }
    };

    public static void main(String[] args) {

        int today [3] = {20 10 2024};
        int today_weekday = 7;

       x = days_from_start_year(20,10,2024);

       System.out.println(x);


    }
}