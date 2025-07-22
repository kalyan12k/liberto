package demo;

class MyTask extends Thread {
    private String taskname;

    public MyTask(String taskname) {
        this.taskname = taskname;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskname + " Step " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class SImpleConcurrency {
    public static void main(String[] args) {
        MyTask t1 = new MyTask("Cooking");
        MyTask t2 = new MyTask("Washing");

        t1.start();
        t2.start();
    }
}