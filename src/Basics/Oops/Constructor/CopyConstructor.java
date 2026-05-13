package Basics.Oops.Constructor;

public class CopyConstructor {
    String Studentname;
    int RollNum;

    CopyConstructor(String Studentname,int RollNum){
        this.Studentname=Studentname;
        this.RollNum=RollNum;}

        CopyConstructor(CopyConstructor AnotherStudent ){
            this.Studentname=AnotherStudent.Studentname;
            this.RollNum=AnotherStudent.RollNum;

        }
    }


