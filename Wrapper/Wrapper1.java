/*| Primitive Type | Wrapper Class |
| -------------- | ------------- |
| `int`          | `Integer`     |
| `char`         | `Character`   |
| `boolean`      | `Boolean`     |
| `byte`         | `Byte`        |
| `short`        | `Short`       |
| `long`         | `Long`        |
| `float`        | `Float`       |
| `double`       | `Double`      |
 */

 //why to use Wrapper
 /*Primitive types are not objects, but Java is an object-oriented language, and some situations require objects. 
 That’s when wrapper classes are helpful.

✅ 1. To use in Collections
Java’s collection framework (like ArrayList, HashMap) only works with objects, not primitive types */

public class Wrapper1 {
    public static void main(String[] args) {
        // String to primitive int
        int x = Integer.parseInt("100");

        // String to Integer object
        Integer i1 = Integer.valueOf("100");

        // Binary String to Integer object
        Integer i2 = Integer.valueOf("1111", 2); // 15

        // Using max method
        int max = Integer.max(50, 70);

        // Double wrapper
        double d = Double.parseDouble("3.1416");

        // Boolean wrapper
        boolean flag = Boolean.parseBoolean("true");

        System.out.println("x = " + x);
        System.out.println("i1 = " + i1);
        System.out.println("i2 (binary) = " + i2);
        System.out.println("max = " + max);
        System.out.println("double = " + d);
        System.out.println("flag = " + flag);
    }
}
