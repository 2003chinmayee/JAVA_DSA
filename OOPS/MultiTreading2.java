//this is the code for multitreading using thread class

class A extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("process1 "+i);
        }

    }


}
class B extends Thread{
     public void run(){
        for (int i=0;i<10;i++){
            System.out.println("process2 "+i);
        }
        
    }
    

}

public class MultiTreading2 {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        a1.start();
        b1.start();
        
    }
}