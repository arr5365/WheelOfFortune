/*
* CMPSC 261, Section 1
* Fall 2016
* Instructor: Phil O'Connell
* TODO: DON'T FORGET TO PUT YOUR NAME AND ID
* Student: Andrew Rooney.
* ID: arr5365
*/
package wheeloffortune;

import java.util.Scanner;

public class WheelOfFortune {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      String action;
      Scanner scanner = new Scanner(System.in);
      
     System.out.println("What do you want to do? \nEnter:1 To Spin the Wheel., \nEnter:2 To buy a Vowel., "
             + "\nEnter:3 To Solve the Puzzle. or \nEnter:4 To Quit.");
     action = scanner.next();
     System.out.println(action);
     if ("1".equals(action)) {
         action = "You choose to spin the wheel.";
     }
     if ("2".equals(action)){ 
         action = "You choose to buy a vowel.";
     }
     if ("3".equals(action)){ 
         action = "You choose to solve the puzzle.";
     }
     if ("4".equals(action)) 
     {action = "You choose to quit.";
     return;
     }
     System.out.println(action);
  }
  
  
}
