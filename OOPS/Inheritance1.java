class Animal {

    void walk(){
        System.out.println("you can walk");
    }

}

class Dog extends Animal{ //single inheritance
    void bark(){
        System.out.println("he can bite you");
    }
}


class cow extends Animal{// hierarchical  - multiple classes inherits from one parent like cow and Dog extends Animal
    void eat(){
        System.out.println("i am herbivorus");
    }

}
 
class goat extends cow{ // this is multilevel inheritance because cow inherits from animal and goat inherites from cow
    void milk(){
        System.out.println("i give milk");

    }
}



public class Inheritance1 {
    public static void main(String[] args) {
        Dog g = new Dog();
        g.walk();
        g.bark();

        cow c = new cow();
        c.walk();
        c.eat();

        goat o = new goat();
        o.milk();
        o.eat();
        
    }
}