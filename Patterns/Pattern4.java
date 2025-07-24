public class Pattern4 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){//nested loop
            for(int j=1;j<=n-i+1;j++){//here we printing one star less in each row so logic is j<=n-i+1
                System.out.print("*");


                
            }
              System.out.println();

        }
    }
}