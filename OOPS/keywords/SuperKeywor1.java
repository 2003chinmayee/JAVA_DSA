class Parent {
    Parent(String name) {
        System.out.println("Parent constructor: " + name);
    }
}

class Child extends Parent {
    Child(String name) {
        super(name);  // 👈 calling Parent(String name) constructor
        System.out.println("Child constructor: " + name);
    }
}

public class SuperKeywor1{
    public static void main(String[] args) {
        Child c = new Child("Chinmayee");
    }
}
/* Rule
 * When a child class constructor is created, 
 * Java automatically tries to call super() (no-arg constructor)
 * 
 * but If parent class has only parameterized  constructor like this code, 
 * then you must call one of them using super(args) in the child constructor.
 * 
 * ❗Why? Because:
Java always wants to fully construct the parent class first, 
before it builds the child object.

If the parent doesn’t have a default (no-arg) constructor, 
Java can’t call it automatically.

So it becomes your job to call the parent constructor using super(...).
 */
