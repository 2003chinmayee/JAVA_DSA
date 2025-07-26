public class Pattern15 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){//first printing the space
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++){
                System.out.print(j+" ");//then printing the number
            }
            System.out.println();
        }
    }
}