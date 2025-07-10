
class A{
    private static int x;
     void fun1(){
        x=34;
    }

    void fun(){
        System.out.println("the value of x is ="+x);
    }

}




public class StaticMember {

    public static void main(String[] args) {
        A a1 = new A();
        a1.fun1();
        a1.fun();
        
    }
}
