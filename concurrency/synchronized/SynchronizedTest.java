public class SynchronizedTest implements Runnable {
  SynchronizedRGB colour;

  public SynchronizedTest() {
    colour = new SynchronizedRGB(0, 0, 0, "Pitch Black");
  }

  // main method of the main thread
  public static void main(String... args) {

   // start another thread invoking color.set on a loop
   ( new Thread( new SynchronizedTest() ) ).start();


   /*
   If another thread invokes color.set after statement 1 but before statement 2,
   the value of myColourInt won't match the value of myColourName. To avoid that
   the two statements would have to be 'bound together' in some way.
   */
   // statement 1
   int myColourInt = colour.getRGB();
   // statement 2
   String myColourName = colour.getName();

   while(true) {
     System.out.println(myColourName + ": " + myColourInt);
   }
  }

  // implement the only method of the Runnable interface
  public void run() {
    while(true) {
      SynchronizedTest.colour.set(000, 000, 000, "Bright White");
      SynchronizedTest.colour.set(128, 128, 128, "Mid Grey");
    }
  }

}
