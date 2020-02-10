package PracticePrograms;
import java.util.Scanner;
public class Vowels {
    static char letter;
    void CheckVowels()
    {
        if(letter=='a'||letter=='A'||letter=='e'||letter=='E'||letter=='i'||letter=='I'||letter=='o'
                ||letter=='O'||letter=='u'||letter=='U')
        {
            System.out.println("It is a vowel");
        }
        else
        {
            System.out.println("It is not a vowel");
        }

    }

    public static void main(String[] args) {
        Vowels V = new Vowels();
        Scanner S= new Scanner(System.in);
        System.out.println("Enter the year ");
        letter =S.next().charAt(0);
        V.CheckVowels();
    }
}
