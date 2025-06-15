/*
  Team 3770 Robotics Programming - Basic Java
  Includes a variety of special Java programming actions including random numbers,
  switch-case statement, conditional operator, type-casting, and output formatting.
*/

import java.util.Random;

public class SpecialActions
{
   public static void main( String args[] )
   {
      // Instantiate random number generator
      Random randomNumber = new Random();

      // Pick random number from 0..3
      int response = randomNumber.nextInt(4);

      // Switch-case statement.  Alternative to the else-if format for
      // multi-selection.  The 'break' action is needed to force an
      // exit from the construct once a case is matched.
      switch (response)
      {
         case 0: System.out.println("ZERO");  break;
         case 1: System.out.println("ONE");   break;
         case 2: System.out.println("TWO");   break;
         case 3: System.out.println("THREE"); break;
      }

      // Pick random number from 0..1
      int coinToss = randomNumber.nextInt(2);

      // Conditional operator.  A shortened if-else construct.
      // Used to a string based on the coin toss value.
      String outcome = coinToss == 0 ? "HEADS" : "TAILS";
      System.out.println(outcome);

      // Type-casting
      double x = 5.2;
      double y = 5.8;

      int a = (int)x;   // "Case" a decimal to an integer.  Does not change data
      int b = (int)y;   // type for forces to integer.  Always truncates; never rounds.
      System.out.println(a);
      System.out.println(b);

      int total = 2345;
      int count = 123;

      // Calculate an average using integer division.  Truncates leftover decimal.
      // Likely unintended.
      double average = total / count;
      System.out.println(average);

      // Calculate an average by "casting" integer values to decimal.
      // Does not change data type of variables, but calculates a decimal
      // average - likely intended.
      average = (double)total / (double)count;
      System.out.println(average);

      // Output formatting.  The "f" implies floating-point decimal.
      // The ".2" defines decimal places.  Operation returns a String and
      // does round as implied.
      String outputString = String.format("%.2f", average);
      System.out.println(outputString);

   }
}