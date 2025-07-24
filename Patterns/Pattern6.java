public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){//nested loops
            for(int j=1;j<=n-i+1;j++){//just like previous code but for upside down we use (n-i+1) condition
                System.out.print(j+" ");


            }
            System.out.println();
        }
    }
}
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1