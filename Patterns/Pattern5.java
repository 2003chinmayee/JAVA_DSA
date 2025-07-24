public class Pattern5 {
    public static void main(String[] args) {
        int n= 5;
        for(int i=1;i<=n;i++){//nested loop
            for(int j=1;j<=i;j++){//condition j will run till i means size of i each time 
                System.out.print(j+" ");//printing  j

            }
            System.out.println();

        }
    }
}
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5 this is the outpput