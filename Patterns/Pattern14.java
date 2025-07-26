public class Pattern14 {
    public static void main(String[] args) {
        int n=4;

        // upword patter
        /*
   *
  ***
 *****
*******


         */
        for(int i=1;i<=n;i++){
              for(int j=1;j<=n-i;j++){
                System.out.print(" ");


        }
        for(int j=1;j<=i;j++){
                System.out.print("*");


        }
         for(int j=2;j<=i;j++){
                System.out.print("*");


        }
        System.out.println();


        }

// down pattern
/*
 



*******
 *****
  ***
   *

 */

        for(int i=n;i>=1;i--){//remember this contion i goes from n to 1 very important
              for(int j=1;j<=n-i;j++){
                System.out.print(" ");


         }
            for(int j=1;j<=i;j++){
                System.out.print("*");


         }
             for(int j=2;j<=i;j++){
                System.out.print("*");

         }
        System.out.println();


        }
    }
}

/*
 
   *
  ***
 *****
*******
*******
 *****
  ***
   *      full patter



 */