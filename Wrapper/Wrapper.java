public class Wrapper {
    public static void main(String[] args) {
        int a=3;
        int b=6;
        int x=Integer.parseInt("8765");//Integer is the Wrapper class . 
        //ParseInt are the function inside the Integer class which are already defined or maid in java
        
        Integer a1 =Integer.valueOf(23);
        int r=Integer.max( a, b);// max is also afunction inside the Integer class
        //similaryly character ,Boolean ect are the wrapper class which have different functions
        
        System.out.println(r);
        
    }
}