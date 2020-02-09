package Abstraction;



public class CheckAbstraction extends Abstract implements InterfaceDemo {
    @Override//annotation
    void showData() {
        System.out.println("inside show data.");
    }

    public static void main(String[] args) {
        CheckAbstraction abstraction=new CheckAbstraction();
        abstraction.showData();
    }

    @Override
    public void add() {

    }
}
