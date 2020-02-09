package AssignmentQuestions;
import java.util.*;
public class Pallindrome
{
    public static void main(String[] args)
    {   Scanner S = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = S.nextInt();
        int number=num;
        int rev=0;
        while (number != 0)
        {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        if(num == rev)
            System.out.println("it is a Palindrome number");
        else
            System.out.println("it is Not a Palindrome number");
    }
}