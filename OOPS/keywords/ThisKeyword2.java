class Parent {
    int x = 10;
}
//If subclass and superclass have the same variable name, 
//use super to refer to parent class’s variable.
class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println(super.x);  // prints 10
        System.out.println(this.x);   // prints 20
    }
}
public class ThisKeyword2 {
    public static void main(String[] args) {
        Child c= new Child();
        c.show();
    }
}