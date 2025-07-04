/*
  Team 3770 Robotics Programming - Basic Java
  Various examples of Java selection (if/else) control
*/

public class IfStatements1
{
   public static void main( String args[] )
   {
      // Variable declarations and display
      int a = 8;
      int b = 3;
      int c = 5;
      System.out.println("a = 8, b = 3, c = 5");
      System.out.println();

      // ----------------------------------------------------

      // Simple if-statements and if-else-statements.
      // Braces optional if only one action after statement.
      if (a > b)
         System.out.println("a > b");

      if (b <= a)
      {
         System.out.println("b <= a");
      }

      if (c >= a)
         System.out.println("b >= a");
      else
         System.out.println("b < a");

      if (b < c)
      {
         System.out.println("b < c");
      }
      else
      {
         System.out.println("b >= c");
      }

      // ----------------------------------------------------

      if (a != c)
      {
         System.out.println();
         System.out.println("a = 8, c = 5");
         System.out.println("a != c");
      }


      if (a == b)
      {
         System.out.println("  Variables are equal");
         System.out.println("  " + a + " = " + b);
      }
      else
      {
         System.out.println("Variables are not equal");
         System.out.println(a + " != " + b);
      }

      // ----------------------------------------------------

   }
}