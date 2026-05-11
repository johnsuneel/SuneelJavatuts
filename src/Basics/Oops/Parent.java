package Basics.Oops;

public class Parent {
    public Parent() {
        System.out.println(" parent no-arg");
    }


    public static class Child extends Parent {
        public Child() {
            //super();
            System.out.println("Child no-arg");
        }
    }

//    public static void main(String[] args) {
//        Child child=new Child();
//    }
}


