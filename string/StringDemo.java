package string;

public class StringDemo {
    public static void main(String[] args) {
        String s ="java";
        String s1="java";
        System.out.println("location of s"+s.hashCode());
        System.out.println(s.length());
        System.out.println(s.contains(s1));
        System.out.println(s.charAt(3));
        System.out.println(s.endsWith("q"));

        // == & .equals
 if(s==s1)
 {
     System.out.println(true);

 }
 else
     System.out.println(false);
    }
}
