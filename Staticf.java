class Giraf{
    static void func1(){
        System.out.println("i am from static function of annoter class");

    }
    void func(){
        System.out.println("hello i am from another class and non static");
    }

}


public class Staticf {
    static void fun(){
        System.out.println("hello i am from same class but in static function");
    }
    public static void main(String[] args) {
        fun();
        Giraf g1 =new Giraf();
        g1.func();
        Giraf.func1();
        
    }
}