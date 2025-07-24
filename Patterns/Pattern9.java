public class Pattern9 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");//first we print the space (n-i ) for each iteration 
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");//then we print * n times after the space
            }
            System.out.println();

        }
    }
}/*
    *****
   *****
  *****
 *****
*****      patten output*/