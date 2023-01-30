package lecture.threads;

public class SDAThread extends Thread {

    private String name;

    public SDAThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName() + " person name: " + name);
    }
}
