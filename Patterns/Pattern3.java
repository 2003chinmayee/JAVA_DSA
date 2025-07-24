public class Pattern3 {
    public static void main(String[] args) {
        int n=4;
        int m=4;
        for(int i=1;i<=n;i++){//nested loop 
            for(int j=1;j<=i;j++){//here we want * at each row as per row number means line 1 = one *,line 2= two ** ect
                System.out.print("* ");//so we give j<=i limit

            }
            System.out.println();

        }
    }
}