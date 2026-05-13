
    package Basics.Oops.CallByReference;

    public class Market {
//        public  void displayFruits(){
//            String[] fruits={"Apple","Orange","Banana"};
//            int count=fruits.length;
//            System.out.println("no.of fruits stock in market:"+count);
//            for(int i=0;i<fruits.length;i++) {
//                System.out.println( fruits[i]);
//            }
//    }
        public void displayFruits(){
            String[] fruits={"grapes","litchi","gouva","papaya"};
            System.out.println("no.of fruits stock available in the market:"+fruits.length);
            for(String f:fruits){
                System.out.println(f);
            }
        }



    }
