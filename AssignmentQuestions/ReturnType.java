package AssignmentQuestions;

public class ReturnType
{
    static int i =0;
        public static void getData(int[]array)
        {

            int a[]={1,2,3,4,5,6};

            System.out.println(a[i]);


            if(i<a.length-1)
            {
                i++;

                getData(array);
            }
        }
        static int[] getArray()
        {
            int []array = {1,2,3,4,5,6};
            return array;
        }

        public static void main(String[] args) {

            getData(getArray());
        }
}

