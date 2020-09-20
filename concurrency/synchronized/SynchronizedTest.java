public class SynchronizedTest {

  public static void main(String... args) {
   SynchronizedRGB colour = new SynchronizedRGB(0, 0, 0, "Pitch Black");

   /*
   If another thread invokes color.set after statement 1 but before statement 2,
   the value of myColourInt won't match the value of myColourName. To avoid that
   the two statements would have to be 'bound together' in some way.
   */
   // statement 1
   int myColourInt = colour.getRGB();
   // statement 2
   String myColourName = colour.getName();
  }

}
