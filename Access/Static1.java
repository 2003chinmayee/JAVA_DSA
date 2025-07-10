//accesing the variable x by creating an object
class A{
    private static int x;

    

    void fun1(){//this is an intance function
        x=78;
        System.out.println("value of x="+x);
    }
}
public class Static1 {
    public static void main(String[] args) {
        A a1=new A();//here we created a object because the instance function is not static
        // if it was then we can directly call it by class A.fun1(); like that

        a1.fun1();

        
    }
}