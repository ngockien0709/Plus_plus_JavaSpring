package B1;

public class Ex2 {
    public static void main(String[] args) {
        Thread t1 = new MyThread("ABC",3500);
        t1.start();
        Thread t2 = new MyThread("DEF",2500);
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread{
    String name;
    long sleep;

    public MyThread(String name, long sleep) {
        this.name = name;
        this.sleep = sleep;
    }

    boolean start = false;

    @Override
    public void run() {
        while (true){
//            if (start == false) {
//                System.out.println(name);
//                start = true;
//            }
            System.out.println(name);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

