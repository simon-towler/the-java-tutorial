
/*
   Represents an 8 bit RBB colour
*/
public class SynchronizedRGB {
   // declare variables to hold the R, G and B values
   private int red;
   private int green;
   private int blue;

   // an arbitrary name for the colour
   private String name;

   /*
    * a private method to validate input values
    * to the constructor and setter methods
    */
    private void check(int red, int green, int blue) {
      // 8 bit values must be between 0 and 255
      if (
               red < 0 || red > 255
            || green < 0 || green > 255
            || blue < 0 || blue > 255
         ) {
           // classic response to an invalid input parameter
           throw new IllegalArgumentException();
         }
    }

    /*
     * Constructor.
     * This is NOT synchronized. Constructors can not be synchronized
     * (and it would not make sense if they could).
     * No reference to this is leaked prematurely.
     */
     public SynchronizedRGB(int red, int green, int blue, String name) {
       // check validity of the rgb input parameters
       check(red, green, blue);

       // assign input to instance variables
       this.red = red;
       this.green = green;
       this.blue = blue;
       this.name = name;
     }

     /*
      * SYNCHRONIZED METHODS START HERE
      * Accessors and mutators.
      */

      /*
       * Gets this colour as a sigle 3-byte 8-bit RGB value
       * compatible with BufferedImage.
       * Uses clever bitwise operations to derive it.
       */
      public synchronized int getRGB() {
        return ( (red << 16) | (green << 8) | blue);
      }

      public synchronized String getName() {
        return name;
      }

      public synchronized void invert() {
        red = 255 - red;
        green = 255 - green;
        blue = 255 - blue;
        name = "Inverse of " + name;
      }
}
