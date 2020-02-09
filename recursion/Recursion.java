package recursion;

public class Recursion {

        static int i=0;// static is used bcuz all the alteration is done in the same memory location
        public static void getData()
        {

            int a[]={1,2,3,4,5,6};

            System.out.println(a[i]);


            if(i<a.length-1)
            {
                i++;
                getData();
            }
        }

        public static void main(String[] args) {

            getData();
        }
    }


