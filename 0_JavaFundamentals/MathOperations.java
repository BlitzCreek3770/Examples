/*
  Team 3770 Robotics Programming - Basic Java
  Includes examples of math operations from the Math class.
*/

public class MathOperations
{
   public static void main( String args[] )
   {
      // Variable declarations
      double a = 6.7;
      double b = 9.2;
      double c, d, e, f;
      double bottom, top;

      // Math operations

      c = Math.sqrt(a * a + b * b);  // Square root
      System.out.println(c);

      d = Math.round(c);            // Rounding
      System.out.println(d);

      e = Math.pow(3,4);            // Exponentiation
      System.out.println(e);

      f = Math.abs(-3.5);           // Absolute value
      System.out.println(f);

      bottom = Math.floor(3.7);     // Ceiling
      top = Math.ceil(3.7);
      System.out.println(bottom + "|" + top);

      bottom = Math.floor(-3.7);    // Floor
      top = Math.ceil(-3.7);
      System.out.println(bottom + "|" + top);
   }
}