public class SynchronizedTest2 {
  // variables that will be shared by threads
  private static SynchronizedRGB colour
    = new SynchronizedRGB(0, 0, 0, "Pitch Black");
  private static int count = 0;

  // inner class subclasses Thread
  private static class WorkerThread extends Thread {
    private int count = 0;
    // override run
    public void run() {
      // the task of the worker thread
      while(count < 500) {
        colour.setColour(000, 000, 000, "Bright White");
        colour.setColour(128, 128, 128, "Mid Grey");
        count++;
        Thread.yield(); // use yield only for debug or test
      }
    }

  }

  // main method of the main thread
  public static void main(String... args) {
    new WorkerThread().start();

  // the task of the main thread

   /*
   If another thread invokes color.setColour after statement 1 but before
   statement 2, the value of myColourInt won't match the value of myColourName.
   To avoid that the two statements would have to be 'bound together' in some
   way.
   */
   while(count < 500) {
     // statement 1
     int myColourInt = colour.getRGB();
     // statement 2
     String myColourName = colour.getName();
     System.out.println(myColourName + ": " + myColourInt);
     count++;
     Thread.yield(); // use yield only for debug or test
   }
  }

}
/* SAMPLE OUTPUT
Pitch Black: 0
Mid Grey: 8421504
Mid Grey: 8421504
Mid Grey: 8421504
Bright White: 8421504 //erroneous
Mid Grey: 8421504
Mid Grey: 8421504
Mid Grey: 8421504
Bright White: 8421504  //erroneous
Mid Grey: 8421504
Mid Grey: 8421504
Mid Grey: 8421504
*/
