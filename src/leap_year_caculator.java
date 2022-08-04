import java.util.Scanner;

public class leap_year_caculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        year = scanner.nextInt();
        System.out.println("Enter a year: ");
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            }
            else
            {
                isLeapYear = true;
            }
        }
        if(isLeapYear){
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }

    }
}
