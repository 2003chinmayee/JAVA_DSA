class Example {
    String name;  // instance variable

    // ❌ Method without using 'this'
    void setNameWrong(String name) {
        name = name; // Both are local — instance variable NOT updated
    }

    // ✅ Method using 'this'
    void setNameRight(String name) {
        this.name = name; // 'this.name' = instance, 'name' = local
    }

    void showName(String methodType) {
        System.out.println(methodType + " - name: " + name);
    }
}

public class ThisKeyword3{
    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example();

        // Using wrong method (no this)
        e1.setNameWrong("Chinmayee");
        e1.showName("Without this");  // Output will be: null

        // Using correct method (with this)
        e2.setNameRight("Chinmayee");
        e2.showName("With this");     // Output will be: Chinmayee
    }
}
