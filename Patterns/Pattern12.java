public class Pattern12 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){//printing space
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){//this is very important stape j goes to i to 1 note that this is important
                System.out.print(j);// here we printing reverse 321 ,4321,5321 like that
            }
            for (int j=2;j<=i;j++){//then again printing another hallf
                System.out.print(j);// here we printhing 23,234,2345 ect like this
            }
            
            System.out.println();


        }
    }
}/*


    1
   212
  32123
 4321234
543212345 printing this pattern






*/