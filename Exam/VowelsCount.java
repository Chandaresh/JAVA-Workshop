package Exam;

public class VowelsCount {
    public static void main(String[] args) {

    String str="ones";
    int vowels = 0, conso = 0;

        for (int i = 0; i < str.length(); i++)
    {

        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                || str.charAt(i) == 'o' || str.charAt(i) == 'u') {

            vowels++;
        }

        else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
        {
            conso++;
        }
    }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + conso);
}
}

