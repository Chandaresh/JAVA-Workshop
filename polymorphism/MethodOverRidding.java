package polymorphism;

    class MethodOverRiding extends MethodOverLoading {
    int a=200;

    public MethodOverRiding() {
        super();
        System.out.println("Inside Child class constructor");
    }

    void add(int a, int b){
        System.out.println("Overriding Addition : "+(a+b));
    }

    void showData(){
        super.add(10,20);
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        MethodOverRiding overriding=new MethodOverRiding();
        overriding.showData();
    }

}
