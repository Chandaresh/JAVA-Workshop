package PracticePrograms;
import java.util.Scanner;
public class LeapYear {
    static int year;
    void CheckLeap()
    {
        if((year%4)==0)
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It is not a leap year");
        }

    }

    public static void main(String[] args) {
    LeapYear L= new LeapYear();
    Scanner S= new Scanner(System.in);
        System.out.println("Enter the year ");
    year =S.nextInt();
    L.CheckLeap();


    }
}
