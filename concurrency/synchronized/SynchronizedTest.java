public class SynchronizedTest {

  public static void main(String... args) {
   SynchronizedRGB colour = new SynchronizedRGB(0, 0, 0, "Pitch Black");

   int myColourInt = colour.getRGB();
   String myColourName = colour.getName();
  }

}
