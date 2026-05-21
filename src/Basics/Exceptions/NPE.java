package Basics.Exceptions;

public class NPE {
    public static void main(String[] args) {
        String name = null;

        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Error: The object you are trying to use is null!");
        }
    }
}
