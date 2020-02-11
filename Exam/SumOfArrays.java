package Exam;

public class SumOfArrays {

        public static void main(String args[]){
            int[] array = {1, 2, 3, 4, 5,6};
            int sum = 0;

            for( int num : array) {
                sum = sum+num;
            }
            System.out.println("Sum of array elements is:"+sum);
        }
    }



