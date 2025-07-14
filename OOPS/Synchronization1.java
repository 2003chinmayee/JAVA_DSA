import java.util.*;
class Account extends Thread{
    int ammount=1000;

    Account(int b){
        this.ammount=b;

    }

     public boolean  isSufficient(int wd){
        if (ammount > wd){
            return true;
        }
        else{
            return false;
        }

    }
    public void Withraw( String name ,int wd){
        ammount=ammount-wd;
        System.out.println("withdrawal succesful");
        System.out.println("the remaning balace is"+ammount+"by"+name);
        

    }

   
}

class Customer extends Thread{

    String name;
    Account x1;

    Customer(String name,Account x1){
        this.name=name;
        this.x1=x1;
    }
    @Override
    public void run(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the amount you wanted to withdraw");
        int outvalue = s1.nextInt();


        synchronized (x1) {
            if (x1.isSufficient(outvalue)){
            x1.Withraw(name,outvalue);
        }
        else{
            System.out.println("balace insuffient");
        }
            
        }
        




    }

}
public class Synchronization1 {
    public static void main(String[] args) {
        Account a1= new Account(1000);

      
        Customer c1 = new Customer("Neha",a1);
         Customer c2 = new Customer("Nehar",a1);
        
        
         c1.start();
         c2.start();
       
        
    }
}