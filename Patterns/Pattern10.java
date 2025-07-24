public class Pattern10 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
             for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}/*

   *
  **
 ***
****  this is the pattern we want to print so first we print the space(n-i) then the *



*/