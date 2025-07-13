abstract class Animal{
    Animal(String type){
        System.out.println("the string is from child to parent "+type);
    }
    abstract void Herbovorous();

    void walk(){
        System.out.println("animal can Walk");
    }

    static void legs(){
        System.out.println("animal have legs");
    }
}

class Dog extends Animal{
    Dog(int b){
        super( "hello");
        System.out.println("the value of the integer is " + b);
    }
    @Override
    void Herbovorous(){
        System.out.println("dog is not herbovoros");
    }

}





public class Abstract1 {
    public static void main(String[] args) {
        Animal a= new Dog(4);
        Animal.legs();
        a.walk();
        a.Herbovorous();


        
    }
}