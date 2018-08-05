package src.main.java.threadChallenge;


//create a new custom thread class that implements Runnable - have your thread
// class instantiate a Thread object in the controller and pass it the name of the thread.
// do whatever you want inside the run() - try to make it a little different than our example in class.
// Once done, create a controller class with a main() that creates and runs multiple instances of your
// thread class.


public class ThreadChallenge implements Runnable {

    Thread t;
    String name;

    ThreadChallenge(String name) {
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {

        for (int i = -100; i < 0; i++) {
            System.out.println(this.t.getName() + "& count = " + i);
        }
    }
}













