package Threads;

public class CreateThread extends Thread {
    public void run(){
        System.out.println("thread is running");
    }
    public static void main(String[] args) throws InterruptedException {
    CreateThread t1= new CreateThread();
     CreateThread1 c1=new CreateThread1();
     CreateThread2 c2=new CreateThread2();
        t1.start();
     c1.start();

     c2.start();
    }
}



 class CreateThread1 extends Thread {
    public void run() {
        for(int i=1;i<=3;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


 class CreateThread2 extends Thread {
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println((char)(64+i));
        }
    }
}
