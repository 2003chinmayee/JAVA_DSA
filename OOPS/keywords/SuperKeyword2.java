class Parent {
    void display() {
        System.out.println("Hello from Parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Hello from Child class");

        // Call parent class version of display()
        super.display();  // 👈 super used inside method
    }
}

public class SuperKeyword2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}

/*It is used in a child class (subclass) to:

Access parent class methods

Access parent class variables

Call parent class constructor (in constructor only)




You use super in a method when:

You want to call the method of the parent class from inside the child class.

The child class has overridden the method — and you still want to use the parent’s version.*/
