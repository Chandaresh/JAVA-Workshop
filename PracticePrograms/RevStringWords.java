package PracticePrograms;
import java.util.*;

public class RevStringWords
{
    public void reverseWordInMyString(String str)
    {

        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(str);
        System.out.println(reversedString);
    }
    public static void main(String[] args)
    {
        RevStringWords obj = new RevStringWords();
        Scanner S = new Scanner(System.in);
        System.out.println("Enter S1");

        String S1 = S.nextLine();
        System.out.println("Enter S2");
        String  S2= S.nextLine();
        obj.reverseWordInMyString("S1"+S1);
        obj.reverseWordInMyString("S2"+S2);
    }
}