public final class HelloThread extends Thread {

  @Override
  public void run() {
    System.out.println("Hello from a subclass of Thread!");
  }

  public static void main(String args[]) {
    (new HelloThread()).start();
  }

}
