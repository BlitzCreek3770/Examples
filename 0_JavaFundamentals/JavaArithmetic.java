/*
  Team 3770 Robotics Programming - Basic Java
  Demonstrates Java basic arithmetic operations.
*/

public class JavaArithmetic
{
   public static void main( String args[] )
   {
      // Variable declarations
      int    a, b, c, d;
      double x, y, z;

      // Assignments
      a = 4;
      b = 7;

      x = 2.3;
      y = 6.7;

      // Arithmetic:  addition and subtraction
      c = a + b;   // Addition
      z = y - x;   // Subtraction

      // Display results for addition/subtraction
      System.out.println();
      System.out.println(a + " + " + b + " = " + c);
      System.out.println(y + " - " + x + " = " + z);

      // Arithmetic:  multiplication and division
      c = a * b;   // Multiplication
      z = y / x;   // Division

      // Display results for multiplication/division
      System.out.println();
      System.out.println(a + " * " + b + " = " + c);
      System.out.println(y + " / " + x + " = " + z);

      // Integer arithmetic:  division and modulus
      c = b / a;   // Integer division (not truncation)
      d = b % a;   // Modulus (remainder of long division)

      // Display results for modules and integer division
      System.out.println();
      System.out.println(b + " / " + a + " = " + c);
      System.out.println(b + " % " + a + " = " + d);

      // Exponents require the Math.pow() method.  Display results.
      System.out.println();
      x = 3.0;
      y = 4.0;
      z = Math.pow(x,y);
      System.out.println(x + " to the power of " + y + " = " + z);
   }
}