/*
  Team 3770 Robotics Programming
  Example: BasicConsoleLogging
  Demonstrates variable declaration, data types, and
  basic Java console output
*/
public class BasicConsoleLogging
{
   public static void main( String args[] )
   {
      // Variable declarations
      int    teamNum   = 3770;
      double score     = 99.9;
      String teamName  = "BlitzCreek";

      // Various statements that write to the console
      System.out.println("Welcome to FRC Java Programming");
      System.out.println();
      System.out.println(teamName);
      System.out.println("Team: " + teamNum);
      System.out.println("Score: " + score + " points");
   }
}