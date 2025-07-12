class Example {
    int number = 100;  // instance (reference) variable

    void showNumber() {
        int number = 50;  // local variable (inside the method)

        System.out.println("Without this: " + number);       // prints local variable
        System.out.println("With this: " + this.number);     // prints instance variable
    }

    void changeNumber(int number) {
        // parameter is also named 'number' (local)
        this.number = number;  // this.number is instance, number is local
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Example obj = new Example();

        obj.showNumber();  // shows difference between local and this.variable

        obj.changeNumber(200);  // updates instance variable using this

 
    }
}
