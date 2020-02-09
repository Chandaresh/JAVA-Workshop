package AssignmentQuestions;

public class Factorial {
    void ShowData(){
        int a=6;
        int i ;
        int fact=1;
        for(i=1;i<=a;i++){
            fact=fact*i;

        }
        System.out.println("Factorial of "+a+" is: "+fact);
    }
    public static void main(String args[]){
        Factorial fac=new Factorial();
        fac.ShowData();

    }
}