public class Pattern2 {
    public static void main(String[] args) {
        int n=4;
        int m=5;
         for(int i=1;i<=n;i++){//here we use nested loop like previous example  from 1 to n for vertical
            for(int j=1;j<=m;j++){//here from 1 to 5 for horizatal row
                if(i==1||j==1||i==n||j==m){//condition
                    System.out.print("*");

                }else{
                    System.out.print(" ");//space between two stars middle one
                }
            }
            System.out.println();//to go next line
         }
        
    }
}