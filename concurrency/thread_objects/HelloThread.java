/*
There are two ways of providing an instance of Thread with the code that will
run in the thread. One is to provide it with a Runnable object. The other is to
subclass Thread (since it implements Runnable), override its run method, and
provide the code in that. This example illustrates the second way, subclassing
Thread.
*/

// subclass Thread
public final class HelloThread extends Thread {
  //provide the thread with the code to run
  @Override
  public void run() {
    System.out.println("Hello from a subclass of Thread!");
  }

  // run the thread
  public static void main(String args[]) {
    (new HelloThread()).start();
  }

}
