public class Cammand3 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        int sum=a+b;
        System.out.println("addithin of cammand value ="+sum);

        
    }
}
/*Feature	       Details
args.length	       Number of command-line arguments
args[0]	           First argument
args[1]	           Second argument

Need conversion	   If you pass a number, and need to use it as int, use Integer.parseInt(args[i]) */

/*public static void main(String[] args)
Here, args is an array of Strings — it holds the command-line arguments.


Command Line Arguments are values (inputs) you give to your Java program while running it — through the terminal/command prompt.

These values are passed into the main() method using the String[] args parameter.*/