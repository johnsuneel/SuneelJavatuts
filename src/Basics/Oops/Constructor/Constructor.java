package Basics.Oops.Constructor;

public class Constructor {
//        public Constructor (){
//        this(10);
//        System.out.println("No-arg Constructor");
//    }
//    public Constructor(int i){
//        this(10.5);
//        System.out.println("Int-arg Constructor");
//    }
//    public Constructor(double d){
//        System.out.println("double-arg Constructor");
//    }



    String name;
    int salary;

    Constructor(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    Constructor(){
        this.name="sunil";
        this.salary=50000;
    }
    Constructor(String name){
       this.name=name;
       this.salary=40000;
    }
    public void displayInfo(){
        System.out.println("Name:"+this.name);
        System.out.println("Salary:"+this.salary);
    }
}
