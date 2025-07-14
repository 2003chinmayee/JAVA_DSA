class A implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("process1 "+i);
            
        }}
    }

class B implements Runnable{
    @Override
   public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("process2 "+i);
            
        }}
    }





public class MultiTreading1 {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        Thread t1 = new Thread(a1);
         Thread t2 = new Thread(b1);
         t1.start();
         t2.start();
        
    }
}