/*
Enum instances can hold more than one constant for the instance,
they can have a whole list of constants for it!
And they can have class constants too!
*/
public enum Planet {
  // list of enum constant values
  // values in pars will be passed as args to the constructor
  MERCURY (3.303e+23, 2.4397e6), // mass and radius
  VENUS   (4.869e+24, 6.0518e6),
  EARTH   (5.976e+24, 6.37814e6),
  MARS    (6.421e+23, 3.3972e6),
  JUPITER (1.9e+27,   7.1492e7),
  SATURN  (5.688e+26, 6.0268e7),
  NEPTUNE (1.024e+26, 2.4746e7); // semicolon because class has more stuff

  // class constant
  // universal gravitational constant (units m3 kg-1 s-2)
  public static final double G = 6.67400E-11;

  // instance variables
  private final double mass; // in kilograms
  private final double radius; // in meters

  // constructor
  // invoked only by the compiler!
  // for given instance sets two input args to be mass and radius respectively
  Planet(double mass, double radius) {
    this.mass = mass;
    this.radius = radius;
  }


  // instance methods

  private double mass() {
    return mass;
  }

  private double radius() {
    return radius;
  }

  // derived constant
  double surfaceGravity() {
    return G * mass / (radius * radius);
  }

  double surfaceWeight(double otherMass) {
    return otherMass * surfaceGravity();
  }

  // main method
  public static void main(String[] args) {
    // validate input args, there can be only one
    if (args.length != 1) {
      System.err.println("Usage: java Planet <earth_weight>");
      System.exit(-1);
    }

    // assign the input value to earthWeight
    double earthWeight = Double.parseDouble(args[0]);

    /* Note we're able to reference EARTH here,
    despite not having explicitly instantiated it.
    All these enum constants are instantiated at
    compile time by the compiler! */
    double mass = earthWeight/EARTH.surfaceGravity();

    // use the hidden .values method of the enum type
    for (Planet p : Planet.values()) {
      System.out.printf("Your weight on %s is %f%n",
                        p, p.surfaceWeight(mass));
    }
  }

}
/*
Output for an input of 175:

Your weight on MERCURY is 66.107583
Your weight on VENUS is 158.374842
Your weight on EARTH is 175.000000
Your weight on MARS is 66.279007
Your weight on JUPITER is 442.847567
Your weight on SATURN is 186.552719
Your weight on NEPTUNE is 199.207413

Note the output is in the same order the constants were declared in.
*/
