public class Pattern7 {
    public static void main(String[] args) {
        int number=1;
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;

            }
            System.out.println();//this is important line otherwise all the number return in simgle line
        }
    }
}