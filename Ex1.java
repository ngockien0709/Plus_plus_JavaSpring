package B1;

public class Ex1 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            Thread t = new MyThread(i);
            t.setName(i+"");
            t.start();
        }

    }
}

class MyThread extends Thread{
    int stt;
    boolean start = false;
    public MyThread(int stt){
        this.stt = stt;
    }

    @Override
    public void run() {
        while (true){
            if(start == false){
                System.out.println("Thread "+stt);
                start = true;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
