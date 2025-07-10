//acces the private variable without creating the object
class A{
    private static  int y;

    static void fuc(){//here the instance function is static
        y=89;
        System.out.println("value of y="+y);

    }
}

public class Static2 {
    public static void main(String[] args) {
        A.fuc();//the intance function is static so we directly call it by class
        
    }
}