package AssignmentQuestions;
import java.util.*;

public class greaterthan {
    public static void main(String[] args) {
        int i = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array length");
        int num = s.nextInt();
        int array[] = new int[num];
        for (i = 0; i < num ; i++) {
            System.out.println("Enter Element no. :" + i);
            array[i] = s.nextInt();
            if(i==num-1)
            {
                for (int j = 0; j < num ; j++) {

                System.out.println(array[j]);
            }
                }
            for(int a=0;a<num;a++)
            {
                if(array[a]>array[a+1])
                {

                }
            }


        }


    }
}
