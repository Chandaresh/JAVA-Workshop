package constructor;
import keywords.StaticKey;
public class Constructor {




        private Constructor(){


            System.out.println("default Constructor");
        }

        Constructor(int a){
            System.out.println("Constructor : "+a);
        }


        public static void main(String[] args) {
            Constructor constructorDemo=new Constructor();
            StaticKey staticKey=new StaticKey();
            staticKey.getData();
            StaticKey.showData();
        }
    }

