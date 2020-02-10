package PracticePrograms;
import java.util.Scanner;
public class ReverseNo {

    //while loop
  /*      public static void main(String args[])
        {
            int num=0;
            int reversenum =0;
            System.out.println("Input your number and press enter: ");

            Scanner in = new Scanner(System.in);

            num = in.nextInt();

            while( num != 0 )
            {
                reversenum = reversenum * 10;
                reversenum = reversenum + num%10;
                num = num/10;
            }

            System.out.println("Reverse of input number is: "+reversenum);
        }
    }
*/
 /*   public static void main(String args[])
    {
        int num=0;
        int reversenum =0;
        System.out.println("Input your number and press enter: ");

        Scanner in = new Scanner(System.in);
         num = in.nextInt();
        for( ;num != 0; )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }

        System.out.println("Reverse of specified number is: "+reversenum);
    }
}
*/

    public static void reverseMethod(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        }
        else {
            System.out.print(number % 10);

            reverseMethod(number/10);
        }
    }
    public static void main(String args[])
    {
        int num=0;
        System.out.println("Input your number and press enter: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        System.out.print("Reverse of the input number is:");
        reverseMethod(num);
        System.out.println();
    }
}