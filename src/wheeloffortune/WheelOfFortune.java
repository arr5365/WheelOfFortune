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
      action();
  }
  
  public static void action(){
      String action;
      String letter;
      Scanner scanner = new Scanner(System.in);
      
     System.out.println("What do you want to do? \nEnter:1 To Spin the Wheel., \nEnter:2 To buy a Vowel., "
             + "\nEnter:3 To Solve the Puzzle. \nEnter:4 To Quit.");
     action = scanner.next();
     System.out.println(action);
     
     while ((action != "0")){
         if ("1".equals(action)) {
         action = "You choose to spin the wheel.";
         System.out.println(action);
         
     }
         if ("2".equals(action)){ 
         action = "You choose to buy a vowel.";
         System.out.println(action);
     }
         if ("3".equals(action)){ 
         action = "You choose to solve the puzzle.";
         System.out.println(action);
     }
         if ("4".equals(action)) 
         {action = "You choose to quit.";
         System.out.println(action);
         System.exit(0);
     }
         action();
     }
      
  }
  
  
}
