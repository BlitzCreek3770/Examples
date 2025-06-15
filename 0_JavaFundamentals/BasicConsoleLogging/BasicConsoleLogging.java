/*
  Team 3770 Robotics Programming - Basic Java
  Demonstrates variable declaration, data types, and basic Java console output.
*/
public class BasicConsoleLogging
{
   public static void main( String args[] )
   {
      // Variable declarations
      int    teamNum   = 3770;            // Declare integer (non-decimal) value
      double score     = 99.9;            // Declare decimal value
      String teamName  = "BlitzCreek";    // Declare string value

      // Various statements that write to the console
      System.out.println("Welcome to FRC Java Programming");
      System.out.println();
      System.out.println(teamName);
      System.out.println("Team: " + teamNum);
      System.out.println("Score: " + score + " points");
   }
}