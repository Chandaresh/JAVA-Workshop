package Exam;
public class FirstPrime {


    public static void main (String[] args)
    {
        int i=0;
        int num=0;
        String  pn = "";
        for (i = 1; i <= 100; i++)
        {
            int count=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    count = count + 1;
                }
            }
            if (count ==2)
            {

               pn = pn + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(pn);
    }
}


