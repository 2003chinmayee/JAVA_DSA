public class Pattern13 {
    public static void main(String[] args) {
        int n=4;
        for (int i=1;i<=n;i++){
            //first half
            for (int j=1;j<=i;j++){
                System.out.print("*");

            }
            //secand half (spaces)
             for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");

            }
            //third half
             for (int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();

            /*
              


*      *
**    **
***  ***
******** this above code this pattern
             */

        }
         for (int i=n;i>=1;i--){// here only we change the condition (remenber this)
            //first half
            for (int j=1;j<=i;j++){
                System.out.print("*");

            }
            //secand half (spaces)
             for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");

            }
            //third half
             for (int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();

            /*
                

********
***  ***
**    **
*      * and this code print this pattern
             */

        }
          
        
    }
}