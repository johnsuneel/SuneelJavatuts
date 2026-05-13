package Basics.Oops;


public class Parent {
    public void display() {
        System.out.println("parent display method");
    }

    public static class Child extends Parent {
       // @Override
        public void display() {
            super.display();
            System.out.println("Child display method");
        }
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}

