class A{
    int a;
    int b;

     A(){   // default contructor
        System.out.println("hi i am call from constructor");
    }

     A(int c,int d){
        a=c;
        b=d;   // parameterised  contructor
        System.out.println("the value of a and b"+a+ ""+b);
    }

    A( A copy){
        a=copy.a;
        b=copy.b;
       
        
           // parameterised  contructor
        System.out.println("the value of copy"+a+ ""+b);
    }

    


}


public class Constructor1 {
   
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A(5,7);
        A a3 = new A(a2);
        
    }
}
/*class Student {
    String name;
    int age;

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy Constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Chinmayee", 20);  // Line A
        Student s2 = new Student(s1);               // Line B
        s2.display();                               // Line C
    }
}
 */