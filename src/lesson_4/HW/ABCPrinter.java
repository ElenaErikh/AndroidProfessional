package lesson_4.HW;

public class ABCPrinter {

    private final Object monitor = new Object();
    private int number = 6;
    private volatile char symbol = 'A';

    public static void main(String[] args) {
        ABCPrinter abc = new ABCPrinter();

        new Thread(()->{
            abc.printA();
        }).start();

        new Thread(()->{
            abc.printB();
        }).start();

        new Thread(()->{
            abc.printC();
        }).start();

    }

    public void printA(){
        synchronized (monitor) {
            try {
                for (int i = 0; i < number; i++) {
                    while (symbol != 'A') {
                        monitor.wait();
                    }
                    System.out.print("A");
                    monitor.notifyAll();
                    symbol = 'B';
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB(){
        synchronized (monitor) {
            try {
                for (int i = 0; i < number; i++) {
                    while (symbol != 'B') {
                        monitor.wait();
                    }
                    System.out.print("B");
                    monitor.notifyAll();
                    symbol = 'C';
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC(){
        synchronized (monitor) {
            try {
                for (int i = 0; i < number; i++) {
                    while (symbol != 'C') {
                        monitor.wait();
                    }
                    System.out.print("C");
                    monitor.notifyAll();
                    symbol = 'A';
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
