public class EnumTest {
  // instance variable
  Day day;

  // constructor
  public EnumTest(Day day) {
    this.day = day;
  }

  public void tellItLikeItIs() {
    // switches can take an enum as an input arg
    switch(day) {

      case MONDAY:
        System.out.println("Mondays are bad.");
        break;

      case FRIDAY:
        System.out.println("Fridays are better.");
        break;

      // more than one case to a line
      case SATURDAY: case SUNDAY:
        System.out.println("Weekends are best.");
        break;

      // note that the syntax is just default:, not case default:
      default:
        System.out.println("Midweek days are so-so.");
        break;
    }
  }

  public static void main(String[] args) {
      EnumTest firstDay = new EnumTest(Day.MONDAY);
      firstDay.tellItLikeItIs();
      EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
      thirdDay.tellItLikeItIs();
      EnumTest fifthDay = new EnumTest(Day.FRIDAY);
      fifthDay.tellItLikeItIs();
      EnumTest sixthDay = new EnumTest(Day.SATURDAY);
      sixthDay.tellItLikeItIs();
      EnumTest seventhDay = new EnumTest(Day.SUNDAY);
      seventhDay.tellItLikeItIs();
  }

}
/*
Outputs:
Mondays are bad.
Midweek days are so-so.
Fridays are better.
Weekends are best.
Weekends are best.
*/
